// frontend/api/web-bridge.ts — window.api 的 Web 实现（Electron IPC → fetch('/api/...')）
//
// 用法：应用启动时（main.tsx）调用一次 `installWebBridge()`，
//   之后 `frontend/api/client.ts`（607 行，逐行未改）的所有 `window.api.*` 调用
//   都会落到本文件：核心命名空间走 Playhub Java 后端，Electron 特有的能力走安全 stub。
//
// 响应包装：Playhub 后端直接返回业务 JSON（错误体 `{"ok":false,"error":"..."}`），
//   本层统一包成 IpcResult —— 2xx → {ok:true,data}；非 2xx / 网络异常 → {ok:false,error:{code,message}}。
//   401（未登录）→ 顺带跳转 `#/login`（见 docs/winbox-merge/api-mapping.md「认证」节）。
//
// ── danmaku / meta 的后端契约（阶段 1 后端尚未实现，由 teammate C 补齐）────────────
//   一律 POST + JSON body + 同源 cookie；成功响应直接是业务数据（本层负责包 IpcResult）：
//     POST /api/danmaku/get       {}                                  → DanmakuSettings
//     POST /api/danmaku/set       <patch>                             → DanmakuSettings
//     POST /api/danmaku/search    {name, season?}                     → DanmakuAnime[]
//     POST /api/danmaku/episodes  {bangumiId, animeTitle?, source}    → DanmakuCandidate[]
//     POST /api/danmaku/fetch     {episodeId, source}                 → string（弹幕 XML 文本）
//     POST /api/meta/search       {name, year?, provider?}            → MetaHit | null
//     POST /api/meta/extra        {name, year?}                       → MetaExtra | null
//     POST /api/meta/doubanExtra  {name, year?}                       → DoubanDetailExtra | null
//     POST /api/meta/doubanReview {reviewId}                          → DoubanReviewDetail | null
//     POST /api/meta/discover     {refresh}                           → DiscoverSection[]
//     POST /api/meta/movieHot     {}                                  → MovieHotList
//     POST /api/meta/discoverImages {name, mediaType, year?, kind?, doubanId?} → MetaImages
//     POST /api/meta/genres       {}                                  → {movie, tv}
//     POST /api/meta/genrePage    {mediaType, genreId, page}          → DiscoverGenrePage
//     POST /api/meta/discoverQuery <ExploreQuery>                     → ExplorePage
//     POST /api/meta/exploreVocab {}                                  → ExploreVocabulary
//     POST /api/meta/getSettings  {}                                  → MetaSettingsView
//     POST /api/meta/setSettings  <patch>                             → MetaSettingsView
//     POST /api/meta/suggest      {q}                                 → MetaSuggestion[]
//     POST /api/meta/images       {mediaType, tmdbId}                 → MetaImages
import type { IpcErr, IpcResult } from '../../shared/ipc-result';
import { err, ok } from '../../shared/ipc-result';
import type {
  LiveBean,
  LiveChannel,
  LiveGroup,
  PlayResult,
  SearchAllProgressEvent,
  SearchAllReport,
  SiteConfig,
  SourceBean,
  UserConfig,
  VodItem,
} from '../../shared/types';
import { DEFAULT_CHANNEL_NAME, DEFAULT_GROUP_NAME, LOCAL_PROXY_BASE } from '../../shared/constants';
import { DEFAULT_PLAYER_SETTINGS, normalizePlayerSettings, type PlayerSettings } from '../../shared/player';
import { normalizeUiScalePref, resolveUiScale, type UiScaleState } from '../../shared/uiScale';
import { parseAbsJson, parseSortJson, vodToVideo } from '../../engine/parse/Movie';
import { moviePageInfo, movieToVodDetail, movieToVodItems, toVodItem } from '../../engine/vod/VodNormalizer';
import { mergeSearchResults, type AggSearchInput } from '../../engine/vod/aggSearch';
import { splitUrlHeaders } from '../../engine/vod/itemNormalize';
import type { HomeResult, ImportReturn } from './client';

// ---------------------------------------------------------------------------
// 基础工具
// ---------------------------------------------------------------------------

const enc = encodeURIComponent;

/** 运行期取值归一（后端 JSON 的形状不保证，宁宽勿窄） */
function str(v: unknown): string {
  return typeof v === 'string' ? v : v == null ? '' : String(v);
}
function num(v: unknown, def = 0): number {
  const n = Number(v);
  return Number.isFinite(n) ? n : def;
}
function arr(v: unknown): unknown[] {
  return Array.isArray(v) ? v : [];
}
function rec(v: unknown): Record<string, unknown> {
  return v && typeof v === 'object' && !Array.isArray(v) ? (v as Record<string, unknown>) : {};
}
function msgOf(e: unknown): string {
  return e instanceof Error ? e.message : String(e);
}

const NS_CODE = 'not-supported';
const NS_MSG = 'Web 版暂不支持';
function nsErr(feature?: string): IpcErr {
  return err(NS_CODE, feature ? `${feature}：${NS_MSG}` : NS_MSG);
}
const noop = (): void => undefined;
const noopUnsub = () => noop;

// ---------------------------------------------------------------------------
// fetch 封装：统一 credentials / JSON / IpcResult 包装 / 401 跳登录
// ---------------------------------------------------------------------------

function redirectLogin(): void {
  try {
    if (!location.hash.startsWith('#/login')) location.hash = '#/login';
  } catch {
    /* 非浏览器环境忽略 */
  }
}

/** 从错误体里挑一条人话（后端错误体 `{"ok":false,"error":"..."}`，兼容 message/msg 与纯文本） */
function pickMessage(raw: string): string {
  const t = (raw || '').trim();
  if (!t) return '';
  try {
    const j = JSON.parse(t) as unknown;
    if (j && typeof j === 'object') {
      const o = j as Record<string, unknown>;
      for (const k of ['message', 'msg', 'error']) {
        const v = o[k];
        if (typeof v === 'string' && v.trim()) return v.trim();
      }
      return '';
    }
  } catch {
    /* 非 JSON：落到下方纯文本分支 */
  }
  return t.length <= 200 ? t : '';
}

interface ReqInit {
  method?: 'GET' | 'POST';
  /** 给了就 JSON 序列化并带 Content-Type */
  body?: unknown;
}

/** 原始文本响应（爬虫 home/category/detail/search 需要原文给 parseAbsJson/parseSortJson） */
async function rawFetch(path: string, init?: ReqInit): Promise<IpcResult<string>> {
  let res: Response;
  try {
    res = await fetch(path, {
      method: init?.method ?? 'GET',
      credentials: 'include', // cookie session 认证（api-mapping.md「认证」节）
      headers: init?.body !== undefined ? { 'Content-Type': 'application/json' } : undefined,
      body: init?.body !== undefined ? JSON.stringify(init.body) : undefined,
    });
  } catch (e) {
    return err('network', `网络请求失败：${msgOf(e)}`);
  }
  let text = '';
  try {
    text = await res.text();
  } catch {
    text = '';
  }
  if (res.status === 401) {
    redirectLogin();
    return err('unauthorized', pickMessage(text) || '请先登录');
  }
  if (!res.ok) {
    return err(`http-${res.status}`, pickMessage(text) || `请求失败（HTTP ${res.status}）`);
  }
  return ok(text);
}

/** JSON 响应（大多数端点） */
async function request<T>(path: string, init?: ReqInit): Promise<IpcResult<T>> {
  const r = await rawFetch(path, init);
  if (!r.ok) return r as IpcResult<T>;
  if (!r.data.trim()) return ok(undefined as T);
  try {
    return ok(JSON.parse(r.data) as T);
  } catch {
    return err('bad-json', '后端返回的不是合法 JSON');
  }
}

const post = <T>(path: string, body?: unknown): Promise<IpcResult<T>> => request<T>(path, { method: 'POST', body: body ?? {} });

const sleep = (ms: number): Promise<void> => new Promise((r) => setTimeout(r, ms));

// ---------------------------------------------------------------------------
// 同源中转（/proxy，替代桌面版 127.0.0.1:9978 本地中继）
//   后端 ProxyController 约定：url = 目标地址；headers = base64 编码的 "Key:Value" 行。
//   m3u8 清单由后端重写分片地址继续走中转，防盗链头随请求注入。
// ---------------------------------------------------------------------------

function base64Utf8(s: string): string {
  const bytes = new TextEncoder().encode(s);
  let bin = '';
  for (const b of bytes) bin += String.fromCharCode(b);
  return btoa(bin);
}

function proxyUrl(url: string, headers?: Record<string, string>): string {
  const p = new URLSearchParams();
  p.set('url', url);
  const hs = Object.entries(headers ?? {}).filter(([k, v]) => k.trim() && v.trim());
  if (hs.length) p.set('headers', base64Utf8(hs.map(([k, v]) => `${k}:${v}`).join('\n')));
  return `/proxy?${p.toString()}`;
}

/** 桌面版 9978 中继地址（蜘蛛可能直接产出）→ Web 同源 /proxy；非中继地址原样返回 */
function rewrapLocalRelay(u: string): string {
  if (!u.startsWith(LOCAL_PROXY_BASE)) return u;
  try {
    const url = new URL(u);
    const inner = url.searchParams.get('url') ?? url.searchParams.get('u') ?? '';
    if (!/^https?:\/\//i.test(inner)) return u;
    const headers: Record<string, string> = {};
    const ref = url.searchParams.get('referer') ?? url.searchParams.get('ref') ?? '';
    const ua = url.searchParams.get('ua') ?? '';
    const ck = url.searchParams.get('cookie') ?? '';
    if (ref) headers['Referer'] = ref;
    if (ua) headers['User-Agent'] = ua;
    if (ck) headers['Cookie'] = ck;
    return proxyUrl(inner, headers);
  } catch {
    return u;
  }
}

/**
 * 封面图归一：engine 的 normalizeVodPic 会把带 Referer 的图包成 `9978/img?u=…`（Web 无此服务），
 * 这里改写成同源 /proxy；无 Referer 的直链不动（<img> 无 CORS 约束）。
 */
function picForWeb(pic: string): string {
  const s = str(pic).trim();
  if (!s) return '';
  if (s.startsWith(LOCAL_PROXY_BASE)) return rewrapLocalRelay(s);
  return s;
}

function itemsForWeb(items: VodItem[]): VodItem[] {
  return items.map((it) => ({ ...it, pic: picForWeb(it.pic) }));
}

// ---------------------------------------------------------------------------
// 爬虫响应 → 前端 DTO（复用 engine 纯逻辑：parseAbsJson/parseSortJson/VodNormalizer）
// ---------------------------------------------------------------------------

/** home / category 共用的组装：蜘蛛原文 → HomeResult；空结果带 msg 视为源级错误（HomePage 据此自动重试） */
function homeResultFrom(text: string, key: string, withClasses: boolean): IpcResult<HomeResult> {
  const abs = parseAbsJson(text, key);
  const movie = abs?.movie ?? null;
  const items = itemsForWeb(movieToVodItems(movie, key));
  const msg = str(abs?.msg).trim();
  if (!items.length && msg) return err('spider', msg);
  const page = moviePageInfo(movie);
  return ok({
    sortClasses: withClasses ? parseSortJson(text) : [],
    items,
    page: page.page,
    pagecount: page.pagecount,
    total: page.total,
    sourceKey: key,
  });
}

function parseHeaderField(v: unknown): Record<string, string> {
  if (!v) return {};
  if (typeof v === 'string') {
    try {
      return parseHeaderField(JSON.parse(v));
    } catch {
      return {};
    }
  }
  if (typeof v === 'object' && !Array.isArray(v)) {
    const out: Record<string, string> = {};
    for (const [k, val] of Object.entries(v)) if (typeof val === 'string' && val.trim()) out[k] = val;
    return out;
  }
  return {};
}

/**
 * 播放地址归一（对齐桌面版 SpiderHost 的中继语义）：
 *   · 桌面 9978 中继地址 → 同源 /proxy；
 *   · 地址尾部的 `@Referer=…` 约定头 + 蜘蛛 header 字段 → 有则整段走 /proxy（浏览器无法给 <video> 注头）；
 *   · 多段 `#` 拼接逐段处理；parse=1（待嗅探的解析页）原样不动。
 */
function playUrlForWeb(raw: string, header: Record<string, string>): string {
  return raw
    .split('#')
    .map((seg) => {
      const s = seg.trim();
      if (!s) return s;
      if (s.startsWith(LOCAL_PROXY_BASE)) return rewrapLocalRelay(s);
      const { url, headers: tail } = splitUrlHeaders(s);
      const merged = { ...tail, ...header };
      if (Object.keys(merged).length === 0) return url;
      return /^https?:\/\//i.test(url) ? proxyUrl(url, merged) : url;
    })
    .join('#');
}

function toPlayResult(raw: unknown, flag: string): PlayResult {
  const o = rec(raw);
  const parse = num(o.parse, 0);
  const header = parseHeaderField(o.header);
  const rawUrl = Array.isArray(o.url) ? arr(o.url).map(str).filter(Boolean).join('#') : str(o.url);
  const message = str(o.msg ?? o.message);
  return {
    parse,
    url: parse === 1 ? rawUrl : playUrlForWeb(rawUrl, header),
    playUrl: str(o.playUrl ?? o.play_url),
    flag: str(o.flag) || flag,
    ...(Object.keys(header).length ? { header } : {}),
    ...(message ? { message } : {}),
    ...(o.jx !== undefined ? { jx: o.jx as number | string } : {}),
    ...(str(o.needDriveCookieBind) ? { needDriveCookieBind: str(o.needDriveCookieBind) } : {}),
    ...(str(o.externalLink) ? { externalLink: str(o.externalLink) } : {}),
  };
}

// ---------------------------------------------------------------------------
// 聚合搜索：/api/search/all 是异步的（{progressId} + 轮询 /api/progress/{id}）
//   轮询途中向 onSearchAllProgress 订阅者推「粗粒度进度」（不带逐源条目——
//   后端只在 done 时一次性给出 results；HomePage 对此形态有原生支持）。
// ---------------------------------------------------------------------------

type SearchProgressCb = (ev: SearchAllProgressEvent) => void;
const searchProgressSubs = new Set<SearchProgressCb>();

function emitSearchProgress(ev: SearchAllProgressEvent): void {
  for (const cb of [...searchProgressSubs]) {
    try {
      cb(ev);
    } catch {
      /* 单个订阅者异常不影响其它 */
    }
  }
}

/** /api/progress 的 results 行 → mergeSearchResults 输入；行 = 命中条目（vod_* + source_*）或错误行（{error, source_*}） */
function assembleSearchAll(rows: unknown[]): SearchAllReport {
  const inputs = new Map<string, AggSearchInput & { items: VodItem[] }>();
  for (const row of rows) {
    const o = rec(row);
    const key = str(o.source_uid) || str(o.source_key) || str(o.source_name);
    if (!key) continue;
    const name = str(o.source_name) || key;
    const errMsg = str(o.error);
    if (errMsg && o.vod_id === undefined && o.vod_name === undefined) {
      inputs.set(key, { key, name, status: 'error', error: errMsg, items: [] });
      continue;
    }
    let inp = inputs.get(key);
    if (!inp || inp.status === 'error') {
      inp = { key, name, status: 'ok', items: [] };
      inputs.set(key, inp);
    }
    try {
      const v = vodToVideo(o);
      if (!v.name.trim()) continue;
      inp.items.push({ ...toVodItem(v, key), pic: picForWeb(v.pic) });
    } catch {
      /* 单条失败跳过（与上游一致） */
    }
  }
  const list: AggSearchInput[] = [...inputs.values()].map((inp) =>
    inp.status === 'ok' && inp.items.length === 0 ? { ...inp, status: 'empty' as const } : inp,
  );
  return mergeSearchResults(list);
}

/** 兼容一次性返回形态（{list, errors}；后端若改同步接口不至于挂） */
function assembleSyncSearchAll(data: unknown, wd: string): SearchAllReport | null {
  const o = rec(data);
  if (!Array.isArray(o.list)) return null;
  const report = assembleSearchAll([...arr(o.list), ...arr(o.errors)]);
  emitSearchProgress({ wd, done: report.perSource.length, total: report.perSource.length, pending: 0 });
  return report;
}

async function pollSearchAll(progressId: string, wd: string): Promise<IpcResult<SearchAllReport>> {
  // 后端单源 25s 超时 + 全局收敛等待（最长 90s），这里再留一档余量
  const deadline = Date.now() + 120_000;
  for (;;) {
    await sleep(800);
    const r = await request<Record<string, unknown>>(`/api/progress/${enc(progressId)}`);
    if (!r.ok) return r;
    const d = rec(r.data);
    if (d.found === false) return err('not-found', '搜索进度不存在或已过期，请重试');
    const total = num(d.total);
    const completed = num(d.completed);
    emitSearchProgress({ wd, done: completed, total, pending: Math.max(0, total - completed) });
    if (d.done === true) return ok(assembleSearchAll(arr(d.results)));
    if (Date.now() > deadline) return err('timeout', '聚合搜索超时：部分源响应过慢，请稍后重试');
  }
}

// ---------------------------------------------------------------------------
// 配置映射：/api/config（stripConfig）→ SourceBean / UserConfig / SiteConfig
// ---------------------------------------------------------------------------

const LS_ACTIVE_SOURCE = 'webbridge.ui.activeSourceKey';
const LS_ACTIVE_LIVE = 'webbridge.ui.activeLiveIndex';

function lsGet(k: string): string {
  try {
    return localStorage.getItem(k) ?? '';
  } catch {
    return '';
  }
}
function lsSet(k: string, v: string): void {
  try {
    localStorage.setItem(k, v);
  } catch {
    /* 隐私模式/配额满 → 静默 */
  }
}

/** 后端 SiteDefinition JSON → 前端 SourceBean（uid 兜底 key；ext 对象序列化为字符串） */
function toSourceBean(raw: unknown): SourceBean {
  const s = rec(raw);
  const key = str(s.key) || str(s.uid) || str(s.name) || str(s.api);
  return {
    key,
    name: str(s.name) || key,
    type: num(s.type),
    api: str(s.api),
    searchable: s.searchable === undefined ? 1 : num(s.searchable, 1),
    quickSearch: s.quickSearch === undefined ? 1 : num(s.quickSearch, 1),
    changeable: 1,
    filterable: s.filterable === undefined ? 1 : num(s.filterable, 1),
    playUrl: str(s.playUrl),
    ext: typeof s.ext === 'string' ? s.ext : s.ext == null ? '' : JSON.stringify(s.ext),
    jar: str(s.jar),
    playerType: s.playerType === undefined ? -1 : num(s.playerType, -1),
    categories: Array.isArray(s.categories) ? arr(s.categories).map(str) : null,
    timeout: 0,
    click: str(s.click),
    style: str(s.style),
    ...(s.homePage ? { homePage: str(s.homePage) } : {}),
  };
}

function toLiveBean(raw: unknown, index: number): LiveBean {
  const s = rec(raw);
  return {
    name: str(s.name) || `线路${index + 1}`,
    api: str(s.api),
    type: str(s.type),
    url: str(s.url),
    jar: str(s.jar),
    ext: typeof s.ext === 'string' ? s.ext : s.ext == null ? '' : JSON.stringify(s.ext),
    epg: str(s.epg),
    playerType: str(s.playerType),
    timeout: num(s.timeout, 15),
    ...(s.timeZone ? { timeZone: str(s.timeZone) } : {}),
    ...(s.header && typeof s.header === 'object' && !Array.isArray(s.header) ? { header: s.header as Record<string, string> } : {}),
    ...(s.ua ? { ua: str(s.ua) } : {}),
  };
}

function toParses(c: Record<string, unknown>): SiteConfig['parses'] {
  return arr(c.parses).map((p) => {
    const o = rec(p);
    return {
      name: str(o.name),
      url: str(o.url),
      ext: typeof o.ext === 'string' ? o.ext : o.ext == null ? '' : JSON.stringify(o.ext),
      type: num(o.type),
    };
  });
}

/** /api/config → UserConfig（Web 阶段 1：ui 选择存 localStorage，档案/墓碑尚无后端载体） */
function toUserConfig(c: Record<string, unknown>): UserConfig {
  return {
    version: 2,
    apiUrl: '',
    global: { spider: str(c.spider), flags: arr(c.flags).map(str) },
    sources: arr(c.sites).map(toSourceBean),
    lives: arr(c.lives).map(toLiveBean),
    parses: toParses(c),
    ui: { activeSourceKey: lsGet(LS_ACTIVE_SOURCE), activeLiveIndex: num(lsGet(LS_ACTIVE_LIVE), 0) },
    profiles: [],
    activeProfileId: '',
    deletedSourceKeys: [],
  };
}

function toSiteConfig(c: Record<string, unknown>, sources: SourceBean[]): SiteConfig {
  return {
    sites: sources,
    parses: toParses(c),
    lives: arr(c.lives).map(toLiveBean),
    flags: arr(c.flags).map(str),
    spider: str(c.spider),
    jarCache: '',
    danmaku: '',
    wallpaper: str(c.wallpaper),
    hosts: {},
    rules: [],
    doh: [],
    ads: [],
    proxy: [],
  };
}

/** config.import / config.importUrl 共用：POST /api/config/load {url} → ImportReturn */
async function importImpl(url: string | undefined): Promise<IpcResult<ImportReturn>> {
  const u = (url || '').trim();
  if (!u) return err('bad-request', 'Web 版请使用订阅 URL 导入（暂不支持粘贴 JSON / 本地文件）');
  const r = await request<Record<string, unknown>>('/api/config/load', { method: 'POST', body: { url: u } });
  if (!r.ok) return r;
  const body = rec(r.data);
  // /config/load 用 200 + {ok:false,message} 表达「非管理员拒绝」等业务失败
  if (body.ok === false) return err('denied', str(body.message) || '导入被拒绝');
  const cfg = rec(body.config);
  const sources = arr(cfg.sites).map(toSourceBean);
  return ok({
    config: toSiteConfig(cfg, sources),
    report: {
      total: sources.length,
      ok: sources.length,
      skipped: 0,
      degraded: 0,
      items: sources.map((s, i) => ({ index: i, key: s.key, name: s.name, type: s.type, api: s.api, status: 'OK' as const, message: '' })),
    },
    warnings: [],
  });
}

// ---------------------------------------------------------------------------
// 直播：/api/live/bootstrap 响应 → {groups: LiveGroup[], liveName}
// ---------------------------------------------------------------------------

function toLiveGroups(data: unknown): LiveGroup[] {
  const o = rec(data);
  const byGroup = new Map<string, LiveChannel[]>();
  for (const raw of arr(o.channels)) {
    const ch = rec(raw);
    const url = str(ch.url);
    if (!url) continue;
    const group = str(ch.group) || DEFAULT_GROUP_NAME;
    const item: LiveChannel = {
      name: str(ch.name) || DEFAULT_CHANNEL_NAME,
      urls: [url],
      logo: str(ch.logo),
      epg: '',
      ua: '',
      click: '',
      format: '',
      origin: '',
      referer: '',
      'tvg-id': str(ch.tvgId),
      'tvg-name': str(ch.tvgName),
      'tvg-chno': '',
    };
    const list = byGroup.get(group);
    if (list) list.push(item);
    else byGroup.set(group, [item]);
  }
  return [...byGroup.entries()].map(([group, channels]) => ({ group, channels }));
}

// ---------------------------------------------------------------------------
// 播放偏好 / 字幕设置 / 弹幕降级：localStorage 持久化（Web 本地能力）
// ---------------------------------------------------------------------------

const PLAYER_SETTINGS_KEY = 'winbox-player-settings';

function readPlayerSettings(): PlayerSettings {
  try {
    const raw = localStorage.getItem(PLAYER_SETTINGS_KEY);
    if (!raw) return { ...DEFAULT_PLAYER_SETTINGS };
    return normalizePlayerSettings(JSON.parse(raw) as Partial<PlayerSettings>);
  } catch {
    return { ...DEFAULT_PLAYER_SETTINGS };
  }
}

// ---------------------------------------------------------------------------
// 界面缩放：Web 用 CSS zoom 实现桌面版 webContents.setZoomFactor 的等价效果
// ---------------------------------------------------------------------------

const UI_SCALE_KEY = 'winbox-ui-scale';

function readUiScale(): UiScaleState {
  const pref = normalizeUiScalePref(lsGet(UI_SCALE_KEY));
  const work = {
    width: window.screen?.availWidth || 1920,
    height: window.screen?.availHeight || 1080,
  };
  return { pref, scale: resolveUiScale(work, pref), work };
}

function applyUiScale(s: UiScaleState): void {
  try {
    (document.documentElement.style as CSSStyleDeclaration & { zoom?: string }).zoom = s.scale === 1 ? '' : String(s.scale);
  } catch {
    /* 非浏览器环境忽略 */
  }
}

// ---------------------------------------------------------------------------
// 播放器窗口的 Web 模拟（桌面 = 独立播放器窗口；Web = 具名标签页 / 本页 #/player 路由）
//   · player.open(init)  → init 存 localStorage + 脉冲，window.open('…#/player', 'winbox-player')
//     具名目标复用已开的播放器标签页并聚焦；弹窗被拦则退回本页 hash 跳转。
//   · PlayerPage 挂载后 playerOnInit 订阅 + playerReady() → 本层把暂存的 init 投递给它；
//     复用不刷新的标签页靠 storage 事件（脉冲键）再次投递。
//   · player.switchEp 只在「本页就是播放器」时本地派发并返回 switched=true；
//     其余一律 false —— 调用方（App.tsx）随后会走 playerOpen，新 init 效果等同换集。
// ---------------------------------------------------------------------------

const PLAYER_INIT_KEY = 'webbridge.player.init';
const PLAYER_INIT_PULSE = 'webbridge.player.init.pulse';
const PLAYER_SWITCH_KEY = 'webbridge.player.switch';
const PLAYER_SWITCH_PULSE = 'webbridge.player.switch.pulse';
const PLAYER_TAB_NAME = 'winbox-player';

const playerInitSubs = new Set<(d: unknown) => void>();
const playerSwitchSubs = new Set<(idx: number) => void>();
const playerMiniSubs = new Set<(mini: boolean) => void>();
const playerFullscreenSubs = new Set<(fullscreen: boolean) => void>();
let playerMiniState = false;

function readPlayerInit(): unknown | null {
  try {
    const raw = localStorage.getItem(PLAYER_INIT_KEY);
    return raw ? JSON.parse(raw) : null;
  } catch {
    return null;
  }
}

function emitPlayerInit(d: unknown): void {
  for (const cb of [...playerInitSubs]) {
    try {
      cb(d);
    } catch {
      /* 忽略单个订阅者异常 */
    }
  }
}

function emitPlayerSwitch(idx: number): void {
  for (const cb of [...playerSwitchSubs]) {
    try {
      cb(idx);
    } catch {
      /* 同上 */
    }
  }
}

function isPlayerRoute(): boolean {
  try {
    return location.hash.startsWith('#/player');
  } catch {
    return false;
  }
}

function playerPageUrl(): string {
  return `${location.origin}${location.pathname}#/player`;
}

/** 跨标签页脉冲（storage 事件只在「其它」标签页触发；本标签页走直接派发） */
function onStorageEvent(e: StorageEvent): void {
  if (e.key === PLAYER_INIT_PULSE) {
    const d = readPlayerInit();
    if (d) emitPlayerInit(d);
  } else if (e.key === PLAYER_SWITCH_PULSE) {
    try {
      const cmd = JSON.parse(localStorage.getItem(PLAYER_SWITCH_KEY) ?? 'null') as { epIndex?: unknown } | null;
      const idx = Number(cmd?.epIndex);
      if (Number.isInteger(idx) && idx >= 0) emitPlayerSwitch(idx);
    } catch {
      /* 坏脉冲忽略 */
    }
  }
}

// ---------------------------------------------------------------------------
// system.sessionId：标识「本次启动」（新标签页 = 新会话；刷新保留）
// ---------------------------------------------------------------------------

const SESSION_ID_KEY = 'webbridge.sessionId';

function webSessionId(): string {
  try {
    let v = sessionStorage.getItem(SESSION_ID_KEY);
    if (!v) {
      v =
        typeof crypto !== 'undefined' && typeof crypto.randomUUID === 'function'
          ? crypto.randomUUID()
          : `${Date.now()}-${Math.random().toString(36).slice(2)}`;
      sessionStorage.setItem(SESSION_ID_KEY, v);
    }
    return v;
  } catch {
    return `${Date.now()}`;
  }
}

// ---------------------------------------------------------------------------
// window.api 全量实现（类型直接对齐 client.ts 的 Window['api'] 声明）
// ---------------------------------------------------------------------------

const api: Window['api'] = {
  system: {
    ping: async () => {
      const r = await request<Record<string, unknown>>('/api/health');
      if (!r.ok) return r as IpcResult<string>;
      return ok('pong');
    },
    icon: () => Promise.resolve(ok('')),
    // 皮肤切换纯前端（lib/theme 自己持久化 + 应用）；这里仅回成功
    setTheme: () => Promise.resolve(ok(undefined)),
    quit: () => Promise.resolve(nsErr('退出请直接关闭浏览器标签页')),
    dataDir: () => Promise.resolve(nsErr('Web 版无本地数据目录')),
    sessionId: () => Promise.resolve(ok(webSessionId())),
  },

  config: {
    import: (a) => importImpl(a?.url),
    listSites: async () => {
      const r = await request<Record<string, unknown>>('/api/config');
      if (!r.ok) return r as IpcResult<SourceBean[]>;
      return ok(arr(rec(r.data).sites).map(toSourceBean));
    },
    diagnose: () => Promise.resolve(ok(null)),
    cfgGet: async () => {
      const r = await request<Record<string, unknown>>('/api/config');
      if (!r.ok) return r as IpcResult<UserConfig>;
      return ok(toUserConfig(rec(r.data)));
    },
    // 源的增删改排序：Web 阶段 1 由管理员在后端统一管理，前端只读
    addSource: () => Promise.resolve(nsErr('Web 版暂不支持添加单个源（请改用订阅 URL 导入）')),
    updateSource: () => Promise.resolve(nsErr('Web 版暂不支持编辑源')),
    deleteSource: () => Promise.resolve(nsErr('Web 版暂不支持删除源')),
    deleteSources: () => Promise.resolve(nsErr('Web 版暂不支持删除源')),
    moveSource: () => Promise.resolve(nsErr('Web 版暂不支持调整源顺序')),
    // 选中源/线路是 UI 态：localStorage 持久，cfgGet 的 ui 字段会带上
    setActiveSource: (key) => {
      lsSet(LS_ACTIVE_SOURCE, str(key));
      return Promise.resolve(ok(undefined));
    },
    setActiveLive: (index) => {
      lsSet(LS_ACTIVE_LIVE, String(num(index, 0)));
      return Promise.resolve(ok(undefined));
    },
    importUrl: (url) => importImpl(url),
    importJsonLocal: () => Promise.resolve(nsErr('本地文件导入')),
    importPyLocal: () => Promise.resolve(nsErr('本地 .py 导入')),
    importLiveLocal: () => Promise.resolve(nsErr('本地直播源导入')),
    deleteLive: () => Promise.resolve(nsErr('Web 版暂不支持删除直播线路')),
    deleteLives: () => Promise.resolve(nsErr('Web 版暂不支持删除直播线路')),
    updateLive: () => Promise.resolve(nsErr('Web 版暂不支持重命名直播线路')),
    importPackage: () => Promise.resolve(nsErr('本地包导入')),
    webHomeOpen: () => Promise.resolve(nsErr('网页源独立窗口')),
    saveAsProfile: () => Promise.resolve(nsErr('多配置档案')),
    activateProfile: () => Promise.resolve(nsErr('多配置档案')),
    deleteProfile: () => Promise.resolve(nsErr('多配置档案')),
    updateProfileName: () => Promise.resolve(nsErr('多配置档案')),
    cfgProfiles: () => Promise.resolve(ok([])),
    profileSites: () => Promise.resolve(ok({ activeId: '', profiles: [] })),
    switchProfileSource: () => Promise.resolve(nsErr('多配置档案')),
    vodDebug: () => Promise.resolve(nsErr('单源诊断')),
    audit: () => Promise.resolve(nsErr('逐源体检')),
    cacheClear: () => Promise.resolve(ok({ freedBytes: 0, cleared: [], failed: [] })),
    driveBindKeys: () => Promise.resolve(ok([])),
    gotoDriveBind: () => Promise.resolve(ok(undefined)),
    onNavDriveBind: () => noopUnsub(),
  },

  vod: {
    home: async (key) => {
      const r = await rawFetch(`/api/source/${enc(key)}/home?filter=true`);
      if (!r.ok) return r as IpcResult<HomeResult>;
      return homeResultFrom(r.data, key, true);
    },
    category: async (a) => {
      const r = await rawFetch(`/api/source/${enc(a.key)}/category`, {
        method: 'POST',
        body: { tid: a.tid, pg: str(a.pg) || '1', filter: true, extend: a.extend ?? {} },
      });
      if (!r.ok) return r as IpcResult<HomeResult>;
      return homeResultFrom(r.data, a.key, false);
    },
    detail: async (a) => {
      const id = a.ids?.[0] ?? '';
      const r = await rawFetch(`/api/source/${enc(a.key)}/detail?id=${enc(id)}`);
      if (!r.ok) return r;
      const abs = parseAbsJson(r.data, a.key);
      const d = movieToVodDetail(abs?.movie, a.key);
      return ok(d ? { ...d, pic: picForWeb(d.pic) } : null);
    },
    search: async (a) => {
      const r = await rawFetch(`/api/source/${enc(a.key)}/search?wd=${enc(a.wd)}`);
      if (!r.ok) return r as IpcResult<VodItem[]>;
      const abs = parseAbsJson(r.data, a.key);
      return ok(itemsForWeb(movieToVodItems(abs?.movie, a.key)));
    },
    searchAll: async (wd, opts) => {
      void opts; // refresh：Web 后端无本地缓存语义，每次即全新搜索
      const r = await request<Record<string, unknown>>(`/api/search/all?wd=${enc(wd)}`);
      if (!r.ok) return r as IpcResult<SearchAllReport>;
      const progressId = str(rec(r.data).progressId);
      if (!progressId) {
        const sync = assembleSyncSearchAll(r.data, wd);
        return sync ? ok(sync) : err('bad-response', '聚合搜索响应缺少 progressId');
      }
      return pollSearchAll(progressId, wd);
    },
    onSearchAllProgress: (cb) => {
      searchProgressSubs.add(cb);
      return () => {
        searchProgressSubs.delete(cb);
      };
    },
    play: async (a) => {
      const r = await request<Record<string, unknown>>(`/api/source/${enc(a.key)}/play?flag=${enc(a.flag)}&id=${enc(a.id)}`);
      if (!r.ok) return r as IpcResult<PlayResult>;
      return ok(toPlayResult(r.data, a.flag));
    },
    detectPlayers: () => Promise.resolve(ok([])),
    openExternal: () => Promise.resolve(ok({ ok: false, error: 'Web 版不支持调用本机外部播放器' })),
  },

  live: {
    load: async (index) => {
      // bootstrap 需要 playlistUrl：先从 /api/config 取线路（阶段 1 后端未暴露 lives → 明确报错）
      const cr = await request<Record<string, unknown>>('/api/config');
      if (!cr.ok) return cr as IpcResult<{ groups: LiveGroup[]; liveName: string }>;
      const live = rec(arr(rec(cr.data).lives)[index]);
      const playlistUrl = str(live.url) || str(live.api);
      if (!playlistUrl) {
        return err('not-supported', '直播暂不可用：后端 /api/config 未返回 lives 线路列表（需后端补充）');
      }
      const epg = str(live.epg);
      const r = await request<Record<string, unknown>>('/api/live/bootstrap', {
        method: 'POST',
        body: { playlistUrl, ...(epg ? { epgUrl: epg } : {}) },
      });
      if (!r.ok) return r as IpcResult<{ groups: LiveGroup[]; liveName: string }>;
      return ok({ groups: toLiveGroups(r.data), liveName: str(live.name) || `线路${index + 1}` });
    },
    meta: async () => {
      const r = await request<Record<string, unknown>>('/api/config');
      if (!r.ok) return r as IpcResult<LiveBean[]>;
      return ok(arr(rec(r.data).lives).map(toLiveBean));
    },
    epg: () => Promise.resolve(ok({ byKey: {} })),
    templates: () => Promise.resolve(ok([])),
    render: () => Promise.resolve(nsErr('直播导出')),
    export: () => Promise.resolve(nsErr('直播导出')),
  },

  // 设置备份（含渲染层 localStorage）—— 阶段 1 按规范 stub
  backup: {
    export: () => Promise.resolve(nsErr('设置备份')),
    import: () => Promise.resolve(nsErr('设置备份恢复')),
  },

  // WebDAV 存储（只读）—— 需要服务端凭证管理，阶段 1 空列表
  dav: {
    list: () => Promise.resolve(ok([])),
    set: () => Promise.resolve(nsErr('WebDAV 服务器管理')),
    remove: () => Promise.resolve(nsErr('WebDAV 服务器管理')),
    browse: () => Promise.resolve(nsErr('WebDAV 浏览')),
    openExternal: () => Promise.resolve(ok({ ok: false, error: 'Web 版不支持调用本机外部播放器' })),
  },

  // DLNA 投屏（SSDP 是局域网 UDP 发现，浏览器无此能力）
  dlna: {
    discover: () => Promise.resolve(ok([])),
    cast: () => Promise.resolve(nsErr('DLNA 投屏')),
  },

  // 字幕：设置持久化到 localStorage（开关/字号/位置可用）；多源检索待后端接入
  subtitle: (() => {
    const KEY = 'webbridge.subtitle.settings';
    interface SubSettings {
      enabled: boolean;
      fontSize: number;
      bottom: number;
      providers: Record<string, boolean>;
      assrtToken?: string;
      activeFile?: string;
    }
    const defaults = (): SubSettings => ({ enabled: false, fontSize: 20, bottom: 40, providers: { assrt: true, subtitlecat: true } });
    const read = (): SubSettings => {
      try {
        const raw = localStorage.getItem(KEY);
        if (raw) return { ...defaults(), ...(JSON.parse(raw) as Partial<SubSettings>) };
      } catch {
        /* fallthrough */
      }
      return defaults();
    };
    return {
      get: () => Promise.resolve(ok(read())),
      set: (patch) => {
        const next = { ...read(), ...(patch ?? {}) };
        lsSet(KEY, JSON.stringify(next));
        return Promise.resolve(ok(next));
      },
      providers: () => Promise.resolve(ok([])),
      search: () => Promise.resolve(ok({ candidates: [], providers: [] })),
      fetch: () => Promise.resolve(nsErr('字幕源接入')),
    };
  })(),

  // 弹幕 / 元数据：端点契约见文件头注释（后端 teammate C 补齐后自动可用；404 会包成 err 上屏）
  // 弹幕：search/episodes/fetch 走后端；get/set 是**前端偏好**，存 localStorage
  danmaku: (() => {
    const KEY = 'playhub:danmaku-settings';
    const read = (): Record<string, unknown> => {
      try {
        return JSON.parse(localStorage.getItem(KEY) || '{}') as Record<string, unknown>;
      } catch {
        return {};
      }
    };
    return {
      get: () => Promise.resolve(ok(read() as any)),
      set: (patch: Record<string, unknown>) => {
        const next = { ...read(), ...(patch ?? {}) };
        try {
          localStorage.setItem(KEY, JSON.stringify(next));
        } catch {
          /* 隐私模式写不进去时忽略 */
        }
        return Promise.resolve(ok(next as any));
      },
      search: (name: string, season?: number) => post('/api/danmaku/search', { name, season }),
      episodes: (bangumiId: number, animeTitle: string | undefined, source: string) =>
        post('/api/danmaku/episodes', { bangumiId, animeTitle, source }),
      fetch: (episodeId: number, source: string) =>
        post('/api/danmaku/fetch', { episodeId, source }),
    };
  })(),

  // 元数据：search/extra/doubanExtra/discover 走后端；
  //   其余后端暂未实现（阶段 2 范围外）→ 返回空数据让 UI 优雅降级，而不是弹错误；
  //   getSettings/setSettings 属前端偏好，存 localStorage。
  meta: (() => {
    const KEY = 'playhub:meta-settings';
    const read = (): Record<string, unknown> => {
      try {
        return JSON.parse(localStorage.getItem(KEY) || '{}') as Record<string, unknown>;
      } catch {
        return {};
      }
    };
    return {
      search: (name: string, year?: string, provider?: string) =>
        post('/api/meta/search', { name, year, provider }),
      extra: (name: string, year?: string) => post('/api/meta/extra', { name, year }),
      doubanExtra: (name: string, year?: string) => post('/api/meta/doubanExtra', { name, year }),
      discover: (refresh?: boolean) => post('/api/meta/discover', { refresh: !!refresh }),
      doubanReview: () => Promise.resolve(ok(null as any)),
      movieHot: () => Promise.resolve(ok({ tabs: [], items: [] } as any)),
      discoverImages: () => Promise.resolve(ok({ backdrops: [], posters: [] } as any)),
      genres: () => Promise.resolve(ok({ movie: [], tv: [] } as any)),
      genrePage: (_m: unknown, _g: unknown, page: number) =>
        Promise.resolve(ok({ items: [], page, pagecount: 0 } as any)),
      discoverQuery: () => Promise.resolve(ok(null as any)),
      exploreVocab: () => Promise.resolve(ok(null as any)),
      getSettings: () => Promise.resolve(ok(read() as any)),
      setSettings: (patch: Record<string, unknown>) => {
        const next = { ...read(), ...(patch ?? {}) };
        try {
          localStorage.setItem(KEY, JSON.stringify(next));
        } catch {
          /* 忽略 */
        }
        return Promise.resolve(ok(next as any));
      },
      suggest: () => Promise.resolve(ok([] as any)),
      images: () => Promise.resolve(ok({ backdrops: [], posters: [] } as any)),
    };
  })(),

  // 网盘：接后端 /api/drive/*（阶段 2）
  //   后端这些接口返回 {ok:true,data} / {ok:false,error} 信封，而 request() 已把响应体
  //   JSON.parse 后又包了一层 ok()，这里统一解包成单层 IpcResult。
  drives: (() => {
    const call = async <T>(path: string, init?: ReqInit): Promise<IpcResult<T>> => {
      const r = await request<Record<string, unknown>>(path, init);
      if (!r.ok) return r;
      const d: Record<string, unknown> = r.data ?? {};
      if (typeof d === 'object' && d !== null && 'ok' in d) {
        if (d.ok === true) return ok(d.data as T);
        const e = (d.error ?? {}) as Record<string, unknown>;
        return err(String(e.code ?? 'api'), String(e.message ?? '请求失败'));
      }
      return ok(d as T);
    };
    return {
      get: () => call<Record<string, string>>('/api/drive/list'),
      set: (a: { provider: string; token: string }) =>
        call<void>('/api/drive/set', { method: 'POST', body: a }),
      remove: (provider: string) =>
        call<void>('/api/drive/remove', { method: 'POST', body: { provider } }),
      qrCreate: (provider?: string) =>
        call<{ provider: string; content: string; imageDataUrl?: string; sid: string }>(
          '/api/drive/qrCreate',
          { method: 'POST', body: { provider } },
        ),
      qrPoll: (provider: string, sid: string) =>
        call<{
          state: number;
          token?: string;
          tokenKind?: 'refresh_token' | 'cookie' | 'access_token';
          username?: string;
          hint?: string;
        }>('/api/drive/qrPoll', { method: 'POST', body: { provider, sid } }),
      webLogin: (provider: string) =>
        call<void>('/api/drive/webLogin', { method: 'POST', body: { provider } }),
      ucTvStatus: () => call<{ bound: boolean }>('/api/drive/ucTvStatus'),
      ucTvQrCreate: () =>
        call<{ imageDataUrl: string }>('/api/drive/ucTvQrCreate', { method: 'POST', body: {} }),
      ucTvQrPoll: () =>
        call<{ state: 'wait' | 'ok' | 'expired' | 'error'; hint?: string }>(
          '/api/drive/ucTvQrPoll',
          { method: 'POST', body: {} },
        ),
      ucTvRemove: () =>
        call<void>('/api/drive/ucTvRemove', { method: 'POST', body: {} }),
    };
  })(),

  // 窗口管理：浏览器没有对应能力；close 在播放器页做了合理模拟（关标签页 / 返回上一页）
  win: {
    minimize: () => Promise.resolve(ok(undefined)),
    maximize: () => Promise.resolve(ok(undefined)),
    close: () => {
      try {
        if (isPlayerRoute()) {
          if (window.name === PLAYER_TAB_NAME) {
            window.close(); // 脚本打开的标签页允许自闭
            return Promise.resolve(ok(undefined));
          }
          if (history.length > 1) history.back();
          else location.hash = '#/';
          return Promise.resolve(ok(undefined));
        }
        window.close(); // 用户手动开的标签页会被浏览器忽略（静默 no-op）
      } catch {
        /* 忽略 */
      }
      return Promise.resolve(ok(undefined));
    },
    isMaximized: () => Promise.resolve(ok(true)), // Web 内容恒充满窗口
    setAlwaysOnTop: (on) => Promise.resolve(ok(!!on)), // 无对应能力，回显目标态让 UI 自洽
    isAlwaysOnTop: () => Promise.resolve(ok(false)),
    openDetail: (a) => {
      const q = a?.query ? `?${a.query}` : '';
      const hash = `#/detail/${enc(a.key)}/${enc(a.id)}${q}`;
      let w: Window | null = null;
      try {
        w = window.open(`${location.origin}${location.pathname}${hash}`, '_blank');
      } catch {
        /* fallthrough */
      }
      if (!w) location.hash = hash; // 弹窗被拦 → 本页跳转
      return Promise.resolve(ok({ ok: true, reused: false }));
    },
    openSearch: (term) => {
      const hash = `#/search?agg=${enc(term)}`;
      let w: Window | null = null;
      try {
        w = window.open(`${location.origin}${location.pathname}${hash}`, '_blank');
      } catch {
        /* fallthrough */
      }
      if (!w) location.hash = hash;
      return Promise.resolve(ok({ ok: true, reused: false }));
    },
    routeReady: () => Promise.resolve(ok(undefined)),
    reportError: (message) => {
      try {
        console.error('[renderer]', message);
      } catch {
        /* 忽略 */
      }
      return Promise.resolve(ok(undefined));
    },
    onNavigate: () => noopUnsub(),
  },

  net: {
    onSpeed: () => noopUnsub(),
    proxyGet: () => Promise.resolve(ok({ enabled: false, url: '' })),
    proxySet: () => Promise.resolve(nsErr('网络代理（Web 版由浏览器/系统管理）')),
  },

  // 播放器窗口的 Web 模拟（见上方「播放器窗口」注释块）
  player: {
    open: (init) => {
      const data = { ...rec(init), initSeq: Date.now() };
      try {
        localStorage.setItem(PLAYER_INIT_KEY, JSON.stringify(data));
        localStorage.setItem(PLAYER_INIT_PULSE, String(Date.now()));
      } catch {
        /* 隐私模式：只能同页派发 */
      }
      if (isPlayerRoute()) {
        emitPlayerInit(data);
      } else {
        let w: Window | null = null;
        try {
          w = window.open(playerPageUrl(), PLAYER_TAB_NAME);
        } catch {
          /* fallthrough */
        }
        if (!w) location.hash = '#/player';
      }
      return Promise.resolve(ok(undefined));
    },
    switchEp: (request) => {
      const idx = typeof request === 'number' ? request : Number(rec(request).epIndex);
      if (isPlayerRoute() && Number.isInteger(idx) && idx >= 0) {
        emitPlayerSwitch(idx);
        return Promise.resolve(ok({ switched: true }));
      }
      // 跨标签页：发脉冲（播放器页若在会收到）；返回 false 让调用方走 playerOpen 推送完整 init
      try {
        localStorage.setItem(PLAYER_SWITCH_KEY, JSON.stringify({ ...rec(request), epIndex: idx }));
        localStorage.setItem(PLAYER_SWITCH_PULSE, String(Date.now()));
      } catch {
        /* 忽略 */
      }
      return Promise.resolve(ok({ switched: false }));
    },
    ready: () => {
      const d = readPlayerInit();
      if (d) queueMicrotask(() => emitPlayerInit(d));
      return Promise.resolve(ok({ ok: true }));
    },
    isOpen: () => Promise.resolve(ok({ open: !!readPlayerInit() })),
    close: () => {
      try {
        if (isPlayerRoute() && window.name === PLAYER_TAB_NAME) window.close();
      } catch {
        /* 忽略 */
      }
      return Promise.resolve(ok(undefined));
    },
    setMini: (isMini) => {
      playerMiniState = !!isMini;
      for (const cb of [...playerMiniSubs]) {
        try {
          cb(playerMiniState);
        } catch {
          /* 忽略 */
        }
      }
      return Promise.resolve(ok({ mini: playerMiniState }));
    },
    isMini: () => Promise.resolve(ok({ mini: playerMiniState })),
    setFullscreen: (fullscreen) => {
      try {
        if (fullscreen) void document.documentElement.requestFullscreen?.().catch(() => undefined);
        else if (document.fullscreenElement) void document.exitFullscreen().catch(() => undefined);
      } catch {
        /* 忽略 */
      }
      for (const cb of [...playerFullscreenSubs]) {
        try {
          cb(!!fullscreen);
        } catch {
          /* 忽略 */
        }
      }
      return Promise.resolve(ok({ fullscreen: !!fullscreen }));
    },
    isFullscreen: () => {
      let f = false;
      try {
        f = !!document.fullscreenElement;
      } catch {
        /* 忽略 */
      }
      return Promise.resolve(ok({ fullscreen: f }));
    },
    setResizable: (resizable) => Promise.resolve(ok({ resizable: !!resizable })),
    onInit: (cb) => {
      playerInitSubs.add(cb);
      return () => {
        playerInitSubs.delete(cb);
      };
    },
    onSwitchEp: (cb) => {
      playerSwitchSubs.add(cb);
      return () => {
        playerSwitchSubs.delete(cb);
      };
    },
    onMini: (cb) => {
      playerMiniSubs.add(cb);
      return () => {
        playerMiniSubs.delete(cb);
      };
    },
    onFullscreen: (cb) => {
      playerFullscreenSubs.add(cb);
      return () => {
        playerFullscreenSubs.delete(cb);
      };
    },
    onWindowState: () => noopUnsub(),
    onCtl: () => noopUnsub(),
  },

  // 播放诊断上报（fire-and-forget）：Web 阶段 1 落到 console
  media: {
    report: (ev) => {
      try {
        if (ev && (ev.event === 'error' || ev.event.startsWith('hls-fatal'))) console.warn('[media]', ev.event, ev.url ?? '');
      } catch {
        /* 忽略 */
      }
    },
  },

  // 老板键（全局快捷键 + 隐藏全部窗口）—— 浏览器无对应能力
  boss: {
    get: () => Promise.resolve(ok({ enabled: false, accel: 'CommandOrControl+Shift+B' })),
    set: () => Promise.resolve(nsErr('老板键')),
    onEnter: () => noopUnsub(),
    onExit: () => noopUnsub(),
  },

  merge: {
    export: () => Promise.resolve(nsErr('订阅合并导出')),
    save: () => Promise.resolve(nsErr('订阅合并保存')),
  },

  quark: {
    cleanup: () => Promise.resolve(ok(undefined)), // Web 无落盘文件，清理即 no-op
  },

  // 播放偏好（m3u8 去广告 / 外部播放器绑定等）：localStorage 实现
  playerPrefs: {
    get: () => Promise.resolve(ok(readPlayerSettings())),
    set: (patch) => {
      const next = normalizePlayerSettings({ ...readPlayerSettings(), ...(patch ?? {}) });
      lsSet(PLAYER_SETTINGS_KEY, JSON.stringify(next));
      return Promise.resolve(ok(next));
    },
  },

  // MPV 内核：Web 只用 HTML5（VideoPlayer 的 resolveKernel 会自动回落 html5）
  mpv: {
    status: () => Promise.resolve(ok({ available: false, path: '', source: 'none' as const, note: 'Web 版仅内置 HTML5 播放内核' })),
    start: () => Promise.resolve(nsErr('MPV 播放内核')),
    cmd: () => Promise.resolve(nsErr('MPV 播放内核')),
    stop: () => Promise.resolve(ok({ ok: true })),
    onState: () => noopUnsub(),
  },

  // 第三方播放内核（插件托管）：Web 不可用
  engine: {
    list: () => Promise.resolve(ok([])),
    status: (id) => Promise.resolve(ok({ id: str(id), ready: false, note: NS_MSG })),
    setEnabled: () => Promise.resolve(ok({ ok: false, reason: 'Web 版仅内置 HTML5 播放内核' })),
    start: () => Promise.resolve(ok({ ok: false, reason: 'Web 版暂不支持第三方播放内核' })),
    cmd: () => Promise.resolve(nsErr('第三方播放内核')),
    stop: () => Promise.resolve(ok({ ok: true })),
    onState: () => noopUnsub(),
  },

  // 插件系统：全部空实现（列表空 → 配置页各插件区块自然隐藏）
  plugins: {
    list: () => Promise.resolve(ok([])),
    inspect: () => Promise.resolve(nsErr('插件安装')),
    install: () => Promise.resolve(nsErr('插件安装')),
    uninstall: () => Promise.resolve(nsErr('插件卸载')),
    setEnabled: () => Promise.resolve(nsErr('插件启停')),
    sr: () => Promise.resolve(ok({ available: false, modes: [], mode: 'off' })),
    themes: () => Promise.resolve(ok([])),
    commands: () => Promise.resolve(ok([])),
    keymaps: () => Promise.resolve(ok([])),
    settings: () => Promise.resolve(ok([])),
    setSetting: () => Promise.resolve(ok({ ok: false, reason: NS_MSG })),
    slots: () => Promise.resolve(ok([])),
  },

  // 磁力外部播放器探测：浏览器无法探测本机程序
  bt: {
    detectPlayers: () => Promise.resolve(ok([])),
  },

  // 更新：Web 版由服务端统一部署
  update: {
    check: () => Promise.resolve(nsErr('检查更新（Web 版由服务端统一部署）')),
    download: () => Promise.resolve(nsErr('下载更新')),
    install: () => Promise.resolve(nsErr('安装更新')),
    onProgress: () => noopUnsub(),
  },

  // 界面缩放：CSS zoom 真实实现（见上方「界面缩放」注释块）
  ui: {
    getScale: () => Promise.resolve(ok(readUiScale())),
    setScale: (v) => {
      lsSet(UI_SCALE_KEY, normalizeUiScalePref(v));
      const st = readUiScale();
      applyUiScale(st);
      return Promise.resolve(ok(st));
    },
  },
};

// ---------------------------------------------------------------------------
// 安装入口
// ---------------------------------------------------------------------------

let installed = false;

/** 设置 window.api（幂等）；同时恢复界面缩放、挂上跨标签页 storage 事件（播放器 init/换集投递） */
export function installWebBridge(): void {
  (window as unknown as { api: Window['api'] }).api = api;
  if (installed) return;
  installed = true;
  try {
    window.addEventListener('storage', onStorageEvent);
  } catch {
    /* 非浏览器环境忽略 */
  }
  applyUiScale(readUiScale());
}
