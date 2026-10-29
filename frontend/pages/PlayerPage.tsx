// src/renderer/pages/PlayerPage.tsx
// 播放页（hash 路由 #/player，Web 版为普通路由页）。
// 由详情页「播放」/ 历史页「续播」经 `nav('/player', { state })` 跳入，播放数据随路由 state 携带；
//   刷新（state 丢失）时回退读 sessionStorage 里最近一次的播放上下文。
import { useCallback, useEffect, useRef, useState } from 'react';
import { useLocation } from 'react-router-dom';
import VideoPlayer from '../components/VideoPlayer';
import BackButton from '../components/BackButton';
import { client } from '../api/client';
import { uiMem, recordWatch, saveUiMemory, historyGroupKey } from '../lib/uiMemory';
import { formatEpisodeLabel } from '../lib/epName';
import { playerWindowTitle } from '../lib/videoResolution';
import { makeStaleGuard } from '../lib/staleGuard';
import { restoreHistorySource } from '../lib/historySource';
import type { PlayResult } from '../../shared/types';
import DriveBindModal from '../components/DriveBindModal';
import { playbackResultError } from '../../shared/playbackResult';

export interface PlayerInitData {
  key: string;
  flag: string;
  episodes: { name: string; url: string }[];
  epIndex: number;
  title: string;
  subtitleTitle?: string;
  lastUrl: string;
  lastName: string;
  meta?: { pic?: string; remarks?: string; sourceName?: string; vodId?: string; fromKey?: string; id?: string; profileId?: string };
  /** 历史续播：上次播放进度（秒），交给播放器自动 seek（详情页正常播放不传） */
  startTime?: number;
}

/** 播放上下文暂存（仅本会话）：HashRouter 刷新后路由 state 丢失，用它恢复「正在播的这部片」 */
const STASH_KEY = 'winbox-player-init';

function stashInit(d: PlayerInitData): void {
  try {
    sessionStorage.setItem(STASH_KEY, JSON.stringify(d));
  } catch {
    /* ignore */
  }
}

function readStashedInit(): PlayerInitData | null {
  try {
    const j = sessionStorage.getItem(STASH_KEY);
    if (!j) return null;
    const d = JSON.parse(j) as PlayerInitData;
    return d && Array.isArray(d.episodes) && d.episodes.length ? d : null;
  } catch {
    return null;
  }
}

export default function PlayerPage() {
  const loc = useLocation();
  const [init, setInit] = useState<PlayerInitData | null>(null);
  const [epIndex, setEpIndex] = useState(0);
  const [activeUrl, setActiveUrl] = useState('');
  const [curName, setCurName] = useState('');
  /** 不含集号的片名 —— 右键「详情信息」浮层显示用（只显示片名，不显示第几集） */
  const [playName, setPlayName] = useState('');
  const [resolution, setResolution] = useState('');
  const windowTitle = playerWindowTitle(curName, resolution);
  const [resolving, setResolving] = useState(false);
  // 网盘资源未绑定 cookie（play 检出）→ 传给播放器提示去配置页绑定
  const [driveBind, setDriveBind] = useState<string | null>(null);
  /** parse=1 且自动解析失败时的原因提示（上屏，替代原来的静默黑屏） */
  const [parseMsg, setParseMsg] = useState('');
  /** 解析代数 —— 换集/换源后旧的 client.play 晚到必须作废（不覆盖新集的地址） */
  const resolveGen = useRef(makeStaleGuard());

  // 解析并播放指定集
  const resolve = useCallback(async (d: PlayerInitData, idx: number, preparedUrl = '') => {
    const eps = d.episodes;
    if (!eps || idx < 0 || idx >= eps.length) return;
    const target = eps[idx];
    const gen = resolveGen.current.next(); // 开一代：晚到的旧结果直接丢弃
    // 剧名副名优先用 subtitleTitle（详情页主标题）；回退 title；再回退 resourceName 首段
    // 集名统一归一（网盘源文件名 → 「第N集 · 体积」），标题/历史都好看
    const mainTitle = (d.subtitleTitle || d.title || '').trim();
    const label = formatEpisodeLabel(target.name, idx);
    const display = mainTitle ? `${mainTitle} - ${label}` : label;
    setEpIndex(idx);
    setCurName(display);
    setPlayName(mainTitle);
    setResolution('');
    setResolving(true);
    setActiveUrl('');
    setParseMsg('');
    setDriveBind(null);
    try {
      // 历史续播进入时可能已切过订阅；换集/重试也恢复同一份订阅。
      if (!preparedUrl && d.meta?.profileId) {
        await restoreHistorySource(client, { profileId: d.meta.profileId, sourceKey: d.key, sourceName: d.meta.sourceName });
        if (!resolveGen.current.isCurrent(gen)) return;
      }
      const r: PlayResult = preparedUrl ? { url: preparedUrl, parse: 0, flag: d.flag, playUrl: '' } : await client.play({ key: d.key, flag: d.flag, id: target.url });
      if (!resolveGen.current.isCurrent(gen)) return; // 过期结果：不 setActiveUrl、不记历史
      setDriveBind(r.needDriveCookieBind || null);
      if (r.needDriveCookieBind) return;
      const playError = playbackResultError(r);
      if (playError) {
        setParseMsg(playError);
        return;
      }
      setParseMsg('');
      setActiveUrl(r.url);
    } catch (e) {
      if (!resolveGen.current.isCurrent(gen)) return; // 过期失败：不要用旧集的原始地址顶掉新集
      setParseMsg(e instanceof Error ? e.message : String(e));
      return;
    } finally {
      if (resolveGen.current.isCurrent(gen)) setResolving(false);
    }
    // 所属档案在初始化时固定，进度回写不能读取后来已切换的当前订阅。
    if (d.meta?.fromKey || d.meta?.id) {
      uiMem.playSource = { fromKey: d.meta?.fromKey || '', id: d.meta?.id || '', name: display };
    }
    recordWatch({
      url: target.url,
      rawUrl: target.url,
      flag: d.flag,
      name: display,
      pic: d.meta?.pic,
      remarks: label,
      sourceName: d.meta?.sourceName,
      sourceKey: d.meta?.fromKey,
      profileId: d.meta?.profileId,
      vodId: d.meta?.vodId ?? d.meta?.id,
      time: d.startTime || 0,
    });
    saveUiMemory();
  }, []);

  // 收到初始化数据 → 重置并播放
  const applyInit = useCallback(
    async (d: PlayerInitData) => {
      // 历史记录仅保存当前集；重新取同片详情以恢复上下集，而不是永远只有一集。
      const hydrateGen = resolveGen.current.next();
      setResolving(true);
      setActiveUrl('');
      if (d.key && d.meta?.profileId) {
        try {
          await restoreHistorySource(client, { profileId: d.meta.profileId, sourceKey: d.key, sourceName: d.meta.sourceName });
          if (!resolveGen.current.isCurrent(hydrateGen)) return;
        } catch (e) {
          if (!resolveGen.current.isCurrent(hydrateGen)) return;
          setParseMsg(e instanceof Error ? e.message : String(e));
          setResolving(false);
          return;
        }
      } else if (d.key) {
        try {
          const cfg = await client.cfgGet();
          if (!resolveGen.current.isCurrent(hydrateGen)) return;
          d = { ...d, meta: { ...d.meta, profileId: cfg.activeProfileId } };
        } catch { /* 兼容不提供档案信息的旧初始化调用 */ }
      }
      if (d.episodes?.length === 1 && d.meta?.vodId && d.key) {
        try {
          const detail = await client.detail({ key: d.key, ids: [d.meta.vodId] });
          if (!resolveGen.current.isCurrent(hydrateGen)) return;
          const eps = detail?.episodes[d.flag] || [];
          const idx = eps.findIndex((ep) => ep.url === d.episodes[0].url);
          if (idx >= 0) d = { ...d, episodes: eps, epIndex: idx };
        } catch { /* 详情失效：仍可按历史原始地址续播 */ }
      }
      if (!resolveGen.current.isCurrent(hydrateGen)) return;
      stashInit(d);
      setInit(d);
      setActiveUrl('');
      const idx = Math.max(0, Math.min(d.epIndex || 0, (d.episodes?.length || 1) - 1));
      void resolve(d, idx, d.lastUrl);
    },
    [resolve],
  );

  // 路由 state（详情页/历史页跳入）→ 应用初始化；同一份 state 对象不重复应用（StrictMode 双跑兜底）。
  const appliedRef = useRef<unknown>(null);
  useEffect(() => {
    const incoming = (loc.state as PlayerInitData | null) || readStashedInit();
    if (!incoming || appliedRef.current === incoming) return;
    appliedRef.current = incoming;
    void applyInit(incoming);
  }, [loc.state, applyInit]);

  // 卸载时作废旧解析（换集/离开后晚到的 play 结果不得再写状态）
  useEffect(() => () => {
    resolveGen.current.next();
  }, []);

  // 播放器内换集
  const goEp = useCallback(
    (idx: number) => {
      if (init && Number.isInteger(idx) && idx >= 0 && idx < init.episodes.length) {
        const next = { ...init, startTime: 0, lastUrl: '' };
        // 保持初始化上下文与显示状态一致；后续重试不能回到旧集。
        next.epIndex = idx;
        stashInit(next);
        setInit(next);
        void resolve(next, idx);
      }
    },
    [init, resolve],
  );

  const eps = init?.episodes || [];
  const canPrev = !!init && epIndex > 0;
  const canNext = !!init && epIndex < eps.length - 1;

  // 进度回写历史：读「播放直链」的 playTime，写到「原始 episode url」历史键。
  //   历史键与直链键不同源 —— 只有这里定时回写，历史的 time 才会推进，下次续播才能 seek 新进度。
  const liveRef = useRef<{ raw: string; url: string; name: string; flag?: string; meta?: PlayerInitData['meta'] }>({ raw: '', url: '', name: '' });
  useEffect(() => {
    liveRef.current = { raw: init?.episodes?.[epIndex]?.url || '', url: activeUrl, name: curName || init?.lastName || '', flag: init?.flag, meta: init?.meta };
  }, [init, epIndex, activeUrl, curName]);
  useEffect(() => {
    const raw = init?.episodes?.[epIndex]?.url || '';
    if (!raw || !activeUrl) return;
    // 回写进度也带上来源/资源标识 —— 否则会被写成「按 url 记」的第二条
    //   （历史按 sourceKey+vodId 分组，同片多集只留一条）
    const hist = {
      flag: init?.flag,
      sourceName: init?.meta?.sourceName,
      sourceKey: init?.meta?.fromKey,
      profileId: init?.meta?.profileId,
      vodId: init?.meta?.vodId ?? init?.meta?.id,
      pic: init?.meta?.pic,
    };
    const t = setInterval(() => {
      const sec = uiMem.playTime.get(activeUrl) || 0;
      if (sec > 0) {
        recordWatch({
          url: raw,
          rawUrl: raw,
          ...hist,
          name: curName || init?.lastName || '',
          remarks: init?.episodes?.[epIndex]?.name,
          time: sec,
        });
        saveUiMemory();
      }
    }, 5000);
    return () => clearInterval(t);
  }, [init, epIndex, activeUrl, curName]);
  // 卸载兜底：离开播放页瞬间把「最新进度」写回历史（5s 定时器已被 clear，不能再丢最后一段进度）
  useEffect(() => {
    return () => {
      const c = liveRef.current;
      if (c.raw && c.url) {
        const sec = uiMem.playTime.get(c.url) || 0;
        if (sec > 0) {
          recordWatch({
            url: c.raw,
            rawUrl: c.raw,
            flag: c.flag,
            sourceName: c.meta?.sourceName,
            sourceKey: c.meta?.fromKey,
            profileId: c.meta?.profileId,
            vodId: c.meta?.vodId ?? c.meta?.id,
            pic: c.meta?.pic,
            name: c.name,
            time: sec,
          });
          saveUiMemory();
        }
      }
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  return (
    <>
      {/* 简易页头：返回 + 当前集标题（Web 版无窗口标题栏） */}
      <div className="topbar" style={{ flex: '0 0 auto' }}>
        <BackButton fallback="/home" label="返回" />
        <span style={{ overflow: 'hidden', textOverflow: 'ellipsis', whiteSpace: 'nowrap' }}>{windowTitle || '播放'}</span>
      </div>
      {/* 这两层改用 CSS 类（`.pwin-body` / `.pwin-stage`）——内联样式没有
          `min-height: 0`，flex 的默认 `min-height: auto` 会被视频固有比例撑高，
          竖屏/超宽视频会把播放器整体顶出视口，底部控制条随之不可见（下方 UI 消失）。 */}
      <div className="pwin-body">
        {driveBind && (
          <DriveBindModal
            siteName={curName || '当前播放源'}
            initialProvider={driveBind}
            onClose={() => setDriveBind(null)}
            onSaved={() => {
              setDriveBind(null);
              if (init) void resolve(init, epIndex);
            }}
          />
        )}
        {parseMsg && (
          <div className="err" style={{ margin: '8px 12px 0', fontSize: 12 }} title={parseMsg}>
            {parseMsg}
          </div>
        )}
        <div className="pwin-stage">
          {activeUrl ? (
            <VideoPlayer
              url={activeUrl}
              resourceName={curName}
              playTitle={playName}
              onResolutionChange={setResolution}
              danmakuTitle={((init?.subtitleTitle || init?.title) || '').trim()}
              driveBindProvider={driveBind}
              // 在播放器里绑定网盘成功后自动重新解析当前集（不必手动重进播放页）
              onDriveBound={() => {
                setDriveBind(null);
                if (init) void resolve(init, epIndex);
              }}
              // 历史续播：进度以历史记录为准（新直链与 playTime 旧键不匹配，须显式传入）
              startTime={init?.startTime || 0}
              canPrev={canPrev}
              canNext={canNext}
              onPrev={() => goEp(epIndex - 1)}
              onNext={() => goEp(epIndex + 1)}
              // 图集源（每「集」= 一张图）/ 音乐源 → 图片浏览器 / 音乐播放器显示页码与封面
              epIndex={epIndex}
              epTotal={eps.length}
              // 全屏播放器「选集」—— 传**本线路**的集列表（与 上一集/下一集 同一份）
              //   从历史记录进入时 applyInit 会重新取详情把 eps 补全 ⇒ 这边同样可用
              episodes={eps}
              onPickEpisode={(idx) => goEp(idx)}
              cover={init?.meta?.pic}
              // 跳过片头片尾 —— 资源键（与历史分组同口径）+ 本集键（原始 episode url）
              skipResourceKey={historyGroupKey({
                sourceKey: init?.key,
                vodId: init?.meta?.vodId ?? init?.meta?.id,
                name: curName,
                url: eps[epIndex]?.url,
              })}
              skipEpisodeKey={eps[epIndex]?.url || `#${epIndex}`}
              skipEpisodeLabel={eps[epIndex]?.name || curName}
            />
          ) : (
             <div className="empty">{resolving ? '正在解析本集…' : parseMsg ? '播放失败，可重试或切换集数' : '等待播放…'}
               {!resolving && init && <div style={{ marginTop: 12, display: 'flex', gap: 12, justifyContent: 'center' }}>
                 <button disabled={!canPrev} onClick={() => goEp(epIndex - 1)}>上一集</button>
                 <button onClick={() => void resolve(init, epIndex)}>重试</button>
                 <button disabled={!canNext} onClick={() => goEp(epIndex + 1)}>下一集</button>
               </div>}
             </div>
          )}
        </div>
      </div>
    </>
  );
}
