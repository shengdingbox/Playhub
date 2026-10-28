import { create } from 'zustand'
import * as api from '../api'
import {
  normalizeList, normalizeClasses, normalizeVideoCard, normalizeDetail,
  buildPlayableUrl, mergeVideosByName, classIdOf,
} from '../utils'

const HISTORY_KEY = 'playhub:history'
const SETTINGS_KEY = 'playhub:settings'
const CONFIG_HISTORY_KEY = 'playhub:config-history'
const SEARCH_HISTORY_KEY = 'playhub:search-history'
const MAX_HISTORY = 120
const MAX_SEARCH_HISTORY = 20
const groupLinesCache = new Map()

/**
 * 播放记录的去重键。
 *
 * <p><b>一条记录 = 一条线路</b>：同一视频在不同站点/不同线路下各算一条，
 * 因此键里带上 flagName（线路名）。这样换线路看同一部剧时，
 * 每个线路各自保留自己的集数与进度，不会互相覆盖。
 */
function groupKey(entry) {
  if (!entry) return ''
  const flag = entry.flagName || entry.lineName || ''
  if (entry.isGroup) {
    const sources = entry.sources || []
    const sourceHash = sources.map((s) => s.uid || s.key || '').sort().join(',')
    return `group::${entry.title}::${sourceHash}::${flag}`
  }
  return `${entry.sourceUid}::${entry.vodId}::${flag}`
}

/**
 * 把前端记录压成后端 DTO —— 只保留线路级字段，
 * 不把整包 detail（含所有线路、剧集列表）写进库。
 */
function toRecordDto(entry) {
  if (!entry) return null
  return {
    sourceUid: entry.sourceUid || '',
    vodId: String(entry.vodId ?? ''),
    title: entry.title || '',
    poster: entry.poster || '',
    flagName: entry.flagName || entry.lineName || '默认线路',
    episodeIndex: Math.max(0, entry.episodeIndex ?? 0),
    episodeName: entry.episodeName || '',
    url: entry.url || '',
    position: Math.max(0, Math.floor(entry.currentTime ?? 0)),
    duration: Math.max(0, Math.floor(entry.duration ?? 0)),
    updatedAt: entry.timestamp || Date.now(),
  }
}

/** 后端记录 → 前端展示结构。 */
function fromRecord(r) {
  if (!r) return null
  return {
    id: r.id,
    sourceUid: r.sourceUid,
    vodId: r.vodId,
    title: r.title,
    poster: r.poster,
    flagName: r.flagName,
    episodeIndex: r.episodeIndex ?? 0,
    episodeName: r.episodeName,
    url: r.url,
    currentTime: r.position ?? 0,
    duration: r.duration ?? 0,
    timestamp: r.updatedAt,
  }
}

function configHistoryKey(url) {
  const raw = String(url || '').trim()
  if (!raw) return HISTORY_KEY
  let h = 0
  for (let i = 0; i < raw.length; i++) {
    h = ((h << 5) - h + raw.charCodeAt(i)) | 0
  }
  return `${HISTORY_KEY}:${Math.abs(h).toString(36)}`
}

function loadLS(key, fallback) {
  try {
    const raw = localStorage.getItem(key)
    return raw ? JSON.parse(raw) : fallback
  } catch {
    return fallback
  }
}

function saveLS(key, value) {
  try { localStorage.setItem(key, JSON.stringify(value)) } catch {}
}

async function aiMergeVideos(videos, settings, keyword) {
  const names = [...new Set(videos.map((v) => v.name).filter(Boolean))]
  if (!names.length) return null

  const prompt = `你是视频分析助手。用户搜索了"${keyword}"。

请完成以下任务：
1. 分析下面的视频列表，将"同一部影片"的不同源合并（名字相似有细微差异如"流浪地球2"和"流浪地球2 4K"）
2. 注意区分：vlog、演唱会、复盘、番外、特别篇、续集、不同季数 不算同一部影片
3. 只有正片内容才算同一部，如"流浪地球2"和"流浪地球2 高清版"算同一部，但"流浪地球2"和"流浪地球2番外"不算
4. 从所有合并后的影片中，选出"一个"最符合用户搜索"${keyword}"的影片
5. 没有相似名称的视频映射到自己

只输出JSON：{"mapping": {"原名": "标准名", ...}, "best": "最符合的标准名"}

视频列表：
${names.map((n, i) => `${i + 1}. ${n}`).join('\n')}`

  try {
    const res = await fetch(`${settings.aiUrl}/v1/chat/completions`, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${settings.aiKey}` },
      body: JSON.stringify({ model: settings.aiModel || 'gpt-4o-mini', messages: [{ role: 'user', content: prompt }], temperature: 0.1 }),
    })
    const data = await res.json()
    const content = data.choices?.[0]?.message?.content || ''
    const jsonMatch = content.match(/\{[\s\S]*\}/)
    if (!jsonMatch) return null
    const parsed = JSON.parse(jsonMatch[0])
    return { mapping: parsed.mapping || parsed, best: parsed.best || '' }
  } catch (err) {
    console.error('AI merge error:', err)
    return null
  }
}

async function aiMergeDetails(details, settings) {
  const validDetails = details.filter((d) => d && (d.desc || d.director || d.actor))
  if (validDetails.length === 0) return null
  if (validDetails.length === 1) return validDetails[0]

  const prompt = `你是视频信息整合助手。下面是同一部影片从不同源获取的详细信息，请整合成一个最完整的版本。

规则：
1. 保留所有有用的信息（导演、演员、简介、类型、年份、地区等）
2. 如果不同源的信息有冲突，选择最详细、最准确的那个
3. 简介要完整，不要截断
4. 只输出JSON格式

输出格式：
{"name": "影片名", "desc": "完整简介", "director": "导演", "actor": "演员", "type": "类型", "year": "年份", "area": "地区"}

源信息：
${validDetails.map((d, i) => `源${i + 1}: ${JSON.stringify({ name: d.name, desc: d.desc?.substring(0, 200), director: d.director, actor: d.actor, type: d.type, year: d.year, area: d.area })}`).join('\n')}`

  try {
    const res = await fetch(`${settings.aiUrl}/v1/chat/completions`, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${settings.aiKey}` },
      body: JSON.stringify({ model: settings.aiModel || 'gpt-4o-mini', messages: [{ role: 'user', content: prompt }], temperature: 0.1 }),
    })
    const data = await res.json()
    const content = data.choices?.[0]?.message?.content || ''
    const jsonMatch = content.match(/\{[\s\S]*\}/)
    if (!jsonMatch) return validDetails[0]
    const parsed = JSON.parse(jsonMatch[0])
    return { ...validDetails[0], ...parsed }
  } catch {
    return validDetails[0]
  }
}

export const useStore = create((set, get) => ({
  // 当前登录用户；null 表示未登录（App 的 AuthGate 会拦住整站）
  user: null,
  // 是否已完成一次登录态探测，避免首屏闪一下登录页
  authReady: false,

  configUrl: '',
  config: null,
  configHistory: loadLS(CONFIG_HISTORY_KEY, []),
  bootstrapped: false,

  sources: [],
  selectedSourceUid: '',

  classes: [],
  activeClassId: '',

  wallVideos: [],
  wallMode: 'home',
  wallTitle: '',
  wallPagination: { page: 1, pageCount: 1, total: 0 },
  searchKeyword: '',
  searchProgress: { active: false, total: 0, completed: 0, aiProcessing: false },
  searchCache: null,
  searchHistory: loadLS(SEARCH_HISTORY_KEY, []),

  currentDetail: null,
  detailCache: {},

  currentPlayback: null,

  // 观看记录以服务端 SQLite 为准（登录后加载），本地只做内存缓存
  history: [],

  // 片源库（管理员导入的全局片源）与本人勾选状态
  sourceRows: [],
  sourcesIsAdmin: false,

  liveGroups: [],
  liveChannels: [],
  currentLiveChannelId: '',
  currentLiveSourceIndex: 0,
  liveSummary: null,

  settings: loadLS(SETTINGS_KEY, {
    searchScope: 'all', searchSourceUids: [], liveSourceUrl: '', liveEpgUrl: '',
    aiEnabled: false, aiUrl: '', aiKey: '', aiModel: '',
  }),

  loading: { config: false, wall: false, detail: false, player: false },

  getSelectedSource() {
    return get().sources.find((x) => x.uid === get().selectedSourceUid) || get().sources[0] || null
  },

  async bootstrap() {
    try {
      const settings = loadLS(SETTINGS_KEY, {
        searchScope: 'all', searchSourceUids: [], liveSourceUrl: '', liveEpgUrl: '',
        aiEnabled: false, aiUrl: '', aiKey: '', aiModel: '',
      })
      const configUrl = localStorage.getItem('playhub:configUrl') || ''
      const selectedSourceUid = localStorage.getItem('playhub:selectedSourceUid') || ''
      set({ settings, configUrl, selectedSourceUid, bootstrapped: true })

      // 片源库是管理员专属功能：普通用户不拉取，直接使用管理员配置的启用片源
      if (get().user?.isAdmin) {
        await get().loadSources()
      }

      // 只有管理员才可能还用着历史配置地址；普通用户一律使用服务端片源库
      if (configUrl && get().user?.isAdmin) {
        try {
          await get().loadConfig(configUrl)
          return
        } catch (err) {
          console.error('loadConfig error in bootstrap:', err)
        }
      }
      // 使用管理员导入的片源库（普通用户唯一的配置来源）
      try {
        await get().loadFromServer()
      } catch (err) {
        console.warn('loadFromServer failed:', err?.message)
      }
    } catch (err) {
      console.error('bootstrap error:', err)
      set({ bootstrapped: true })
    }
  },

  /** 片源库列表 + 本人勾选状态。 */
  async loadSources() {
    try {
      const res = await api.listSources()
      set({ sourceRows: res?.sources || [], sourcesIsAdmin: !!res?.isAdmin })
      return res
    } catch (err) {
      console.warn('loadSources failed:', err?.message)
      return null
    }
  },

  /** 保存本人勾选的片源；空数组表示全部启用。 */
  async saveSourceSelection(sourceIds) {
    await api.saveSourceSelection(sourceIds)
    await get().loadSources()
    await get().loadFromServer()
  },

  /** 管理员导入 TVBox 配置（JSON 文本或 URL）。 */
  async importSources({ json, url }) {
    const res = await api.importSources({ json, url })
    await get().loadSources()
    await get().loadFromServer()
    return res
  },

  async deleteSource(id) {
    await api.deleteSource(id)
    await get().loadSources()
    await get().loadFromServer()
  },

  async setSourceEnabled(id, enabled) {
    await api.setSourceEnabled(id, enabled)
    await get().loadSources()
    await get().loadFromServer()
  },

  /** 管理员编辑片源（名称 / 分类 / 免代理直连 / 启用）。 */
  async updateSource(id, patch) {
    await api.updateSource(id, patch)
    await get().loadSources()
    await get().loadFromServer()
  },

  /** 管理员调整片源分类（影视源 / 直播源）。 */
  async setSourceKind(id, kind) {
    await api.setSourceKind(id, kind)
    await get().loadSources()
  },

  /** 直接用服务端的配置（configUrl 为空时即为片源库构建的配置）。 */
  async loadFromServer() {
    const cfg = await api.getConfig()
    if (cfg && Array.isArray(cfg.sites)) {
      get().applyConfig(cfg, get().configUrl || 'db://sources')
    }
  },

  /**
   * 把一份配置应用到界面状态。
   *
   * <p>若片源库里有勾选记录，只展示被勾选的片源；否则全部展示。
   */
  applyConfig(cfg, url) {
    const allSites = cfg.sites || []
    const rows = get().sourceRows || []
    let sites = allSites
    if (rows.length) {
      const selectedUids = new Set(rows.filter((r) => r.selected).map((r) => r.uid))
      if (selectedUids.size) {
        const filtered = allSites.filter((s) => selectedUids.has(s.uid))
        if (filtered.length) sites = filtered
      }
    }
    sites = sites.filter((s) => s.searchable !== 0)
    const classes = normalizeClasses(cfg)

    const skipApis = new Set(['csp_Config', 'csp_LocalFile', 'csp_YGP', 'csp_Push', 'csp_Market', 'csp_Douban'])
    const prevUid = get().selectedSourceUid
    let selectedUid = ''
    if (prevUid) {
      const prev = sites.find((s) => s.uid === prevUid)
      if (prev && !skipApis.has(prev.api)) selectedUid = prevUid
    }
    if (!selectedUid) {
      const rec = sites.find((s) => s.searchable !== 0 && !skipApis.has(s.api)) || sites[0]
      selectedUid = rec?.uid || ''
    }

    set({
      config: cfg, sources: sites, selectedSourceUid: selectedUid,
      classes: classes.length ? classes : get().classes,
      activeClassId: '', searchCache: null, bootstrapped: true,
    })
    if (url && url.startsWith('http')) {
      set({ configUrl: url })
      localStorage.setItem('playhub:configUrl', url)
      get().addConfigHistory(url)
    }
    localStorage.setItem('playhub:selectedSourceUid', selectedUid)
    get().loadRecords()

    if (selectedUid) get().loadHome().catch(() => {})
  },

  async loadConfig(url) {
    set((s) => ({ loading: { ...s.loading, config: true } }))
    try {
      const res = await api.loadConfig(url)
      // 后端对非管理员返回 ok:false，这里必须拦下，否则会拿空配置把界面清空
      if (res && res.ok === false) {
        throw new Error(res.message || '配置加载失败')
      }
      const cfg = res.config || res
      get().applyConfig(cfg, url)
    } catch (err) {
      console.error('loadConfig error:', err)
      throw err
    } finally {
      set((s) => ({ loading: { ...s.loading, config: false } }))
    }
  },

  addConfigHistory(url) {
    const list = get().configHistory.filter((u) => u !== url)
    list.unshift(url)
    const trimmed = list.slice(0, 10)
    set({ configHistory: trimmed })
    saveLS(CONFIG_HISTORY_KEY, trimmed)
  },

  removeConfigHistory(url) {
    const list = get().configHistory.filter((u) => u !== url)
    set({ configHistory: list })
    saveLS(CONFIG_HISTORY_KEY, list)
  },

  addSearchHistory(keyword) {
    const list = get().searchHistory.filter((k) => k !== keyword)
    list.unshift(keyword)
    const trimmed = list.slice(0, MAX_SEARCH_HISTORY)
    set({ searchHistory: trimmed })
    saveLS(SEARCH_HISTORY_KEY, trimmed)
  },

  removeSearchHistory(keyword) {
    const list = get().searchHistory.filter((k) => k !== keyword)
    set({ searchHistory: list })
    saveLS(SEARCH_HISTORY_KEY, list)
  },

  clearSearchHistory() {
    set({ searchHistory: [] })
    saveLS(SEARCH_HISTORY_KEY, [])
  },

  async selectSource(uid) {
    set({ selectedSourceUid: uid, searchCache: null, wallVideos: [], wallMode: 'home' })
    localStorage.setItem('playhub:selectedSourceUid', uid)
    await get().loadHome()
  },

  async loadHome() {
    const source = get().getSelectedSource()
    if (!source) {
      set({ wallVideos: [], loading: { ...get().loading, wall: false } })
      return
    }
    set((s) => ({ loading: { ...s.loading, wall: true }, wallMode: 'home', wallTitle: source.name, searchCache: null }))
    try {
      const payload = await api.sourceHome(source.uid)
      const classes = normalizeClasses(payload)
      if (classes.length) set({ classes })
      const list = normalizeList(payload).map((v) => normalizeVideoCard(v, source))
      set({ wallVideos: list, wallPagination: { page: 1, pageCount: 1, total: list.length } })
      if (!list.length && classes.length) await get().loadCategory(classIdOf(classes[0]))
    } catch (err) {
      console.error('loadHome error:', err)
      set({ wallVideos: [] })
    } finally {
      set((s) => ({ loading: { ...s.loading, wall: false } }))
    }
  },

  async loadCategory(tid, page = 1) {
    const source = get().getSelectedSource()
    if (!source) return
    set((s) => ({ loading: { ...s.loading, wall: true }, wallMode: 'category', activeClassId: tid, wallTitle: get().classes.find((c) => classIdOf(c) === tid)?.type_name || tid }))
    try {
      const payload = await api.sourceCategory(source.uid, tid, page)
      const list = normalizeList(payload).map((v) => normalizeVideoCard(v, source))
      set({
        wallVideos: page === 1 ? list : [...get().wallVideos, ...list],
        wallPagination: { page: Number(payload.page || payload.pg || 1), pageCount: Number(payload.pagecount || payload.pageCount || 1), total: Number(payload.total || list.length) },
      })
    } catch (err) {
      console.error('loadCategory error:', err)
    } finally {
      set((s) => ({ loading: { ...s.loading, wall: false } }))
    }
  },

  async searchVideos(keyword) {
    if (!keyword?.trim()) return
    if (get().searchProgress.active) return

    const kw = keyword.trim()
    const scope = get().settings.searchScope
    const { settings } = get()
    const useAI = settings.aiEnabled && settings.aiUrl && settings.aiKey

    get().addSearchHistory(kw)

    set({
      wallMode: 'search', searchKeyword: kw, wallTitle: `搜索: ${kw}`,
      wallVideos: [], searchCache: null,
      searchProgress: { active: true, total: 0, completed: 0, aiProcessing: false },
      loading: { ...get().loading, wall: true },
    })

    // 搜索范围：all=全部可搜源 / current=当前源 / custom=用户勾选的部分源
    const allSearchable = get().sources.filter((s) => s.searchable !== 0)
    let targetSources
    if (scope === 'current') {
      targetSources = [get().getSelectedSource()].filter(Boolean)
    } else if (scope === 'custom') {
      const picked = new Set(settings.searchSourceUids || [])
      targetSources = allSearchable.filter((s) => picked.has(s.uid))
      // 勾选集为空时退化为全部源，避免搜索直接空转
      if (targetSources.length === 0) targetSources = allSearchable
    } else {
      targetSources = allSearchable
    }

    const total = targetSources.length
    set((s) => ({ searchProgress: { ...s.searchProgress, total } }))

    const searchWithTimeout = async (src) => {
      const controller = new AbortController()
      const timeout = setTimeout(() => controller.abort(), 5000)
      try {
        const payload = await api.sourceSearch(src.uid, kw, false, { signal: controller.signal, silent: true })
        clearTimeout(timeout)
        return normalizeList(payload).map((v) => normalizeVideoCard(v, src))
      } catch {
        clearTimeout(timeout)
        return []
      }
    }

    // Use backend multi-threaded searchAll for AI mode
    if (useAI) {
      try {
        const response = await api.searchAll(kw, false, targetSources.map((s) => s.uid))
        const progressId = response.progressId

        if (progressId) {
          // Poll progress until done
          const results = await new Promise((resolve) => {
            const poll = async () => {
              try {
                const progress = await api.getProgress(progressId)
                if (progress.found) {
                  set((s) => ({ searchProgress: { ...s.searchProgress, completed: progress.completed, total: progress.total } }))
                  if (progress.done) {
                    resolve(progress.results || [])
                  } else {
                    setTimeout(poll, 300)
                  }
                } else {
                  setTimeout(poll, 300)
                }
              } catch { setTimeout(poll, 300) }
            }
            poll()
          })

          // 过滤桥接/爬虫返回的 {"error": "..."} 条目，避免显示成空卡片
          const usable = (results || []).filter(
            (v) => v && !v.error && (v.vod_name || v.name),
          )
          const allCards = usable.map((v) => normalizeVideoCard(v, { uid: v.source_uid || v.key, name: v.source_name || v.name }))

          set((s) => ({ searchProgress: { ...s.searchProgress, aiProcessing: true } }))
          const aiResult = await aiMergeVideos(allCards, settings, kw)
          let finalVideos = allCards
          if (aiResult) {
            finalVideos = mergeVideosByName(allCards, aiResult.mapping)
            if (aiResult.best) {
              const bestIdx = finalVideos.findIndex((v) => v.name === aiResult.best)
              if (bestIdx >= 0) finalVideos[bestIdx].isBestMatch = true
            }
          }
          set({
            wallVideos: finalVideos,
            searchCache: { keyword: kw, videos: finalVideos },
            searchProgress: { active: false, total, completed: total, aiProcessing: false },
            loading: { ...get().loading, wall: false },
          })
          return
        }
      } catch (err) {
        console.log('searchAll failed, falling back to frontend:', err.message)
      }
    }

    // Frontend concurrent search (fallback or AI mode)
    const allCards = []
    let completed = 0
    const queue = [...targetSources]
    const concurrency = useAI ? 4 : 4

    const worker = async () => {
      while (queue.length > 0) {
        const src = queue.shift()
        if (!src) break
        const cards = await searchWithTimeout(src)
        allCards.push(...cards)
        completed++
        if (!useAI) {
          set((s) => ({
            wallVideos: [...allCards],
            searchProgress: { ...s.searchProgress, completed },
          }))
        } else {
          set((s) => ({ searchProgress: { ...s.searchProgress, completed } }))
        }
      }
    }

    const workers = Array.from({ length: Math.min(concurrency, queue.length) }, () => worker())
    await Promise.allSettled(workers)

    if (useAI) {
      set((s) => ({ searchProgress: { ...s.searchProgress, aiProcessing: true } }))
      try {
        const aiResult = await aiMergeVideos(allCards, settings, kw)
        let finalVideos = allCards
        if (aiResult) {
          finalVideos = mergeVideosByName(allCards, aiResult.mapping)
          if (aiResult.best) {
            const bestIdx = finalVideos.findIndex((v) => v.name === aiResult.best)
            if (bestIdx >= 0) finalVideos[bestIdx].isBestMatch = true
          }
        }
        set({
          wallVideos: finalVideos,
          searchCache: { keyword: kw, videos: finalVideos },
          searchProgress: { active: false, total, completed, aiProcessing: false },
          loading: { ...get().loading, wall: false },
        })
      } catch (err) {
        console.error('AI merge error:', err)
        set({
          wallVideos: allCards,
          searchCache: { keyword: kw, videos: allCards },
          searchProgress: { active: false, total, completed, aiProcessing: false },
          loading: { ...get().loading, wall: false },
        })
      }
    } else {
      set({
        searchCache: { keyword: kw, videos: allCards },
        searchProgress: { active: false, total, completed, aiProcessing: false },
        loading: { ...get().loading, wall: false },
      })
    }
  },

  async ensureDetail(sourceUid, vodId, options = {}) {
    const cacheKey = `${sourceUid}::${vodId}`
    if (!options.force && get().detailCache[cacheKey]) {
      set({ currentDetail: get().detailCache[cacheKey] })
      return get().detailCache[cacheKey]
    }
    set((s) => ({ loading: { ...s.loading, detail: true } }))
    try {
      const payload = await api.sourceDetail(sourceUid, vodId)
      const source = get().sources.find((s) => s.uid === sourceUid)
      const detail = normalizeDetail(payload, source)
      if (!detail) throw new Error('详情数据为空')
      set((s) => ({ currentDetail: detail, detailCache: { ...s.detailCache, [cacheKey]: detail } }))
      return detail
    } catch (err) {
      console.error('ensureDetail error:', err)
      return null
    } finally {
      set((s) => ({ loading: { ...s.loading, detail: false } }))
    }
  },

  async ensureGroupDetail(sources) {
    set((s) => ({ loading: { ...s.loading, detail: true } }))
    try {
      for (const src of sources) {
        try {
          const payload = await api.sourceDetail(src.uid, src.vodId)
          const source = get().sources.find((s) => s.uid === src.uid) || src
          const detail = normalizeDetail(payload, source)
          if (detail && detail.playGroups?.length > 0) {
            set((s) => ({ currentDetail: detail }))
            return detail
          }
        } catch { continue }
      }
      return null
    } finally {
      set((s) => ({ loading: { ...s.loading, detail: false } }))
    }
  },

  async ensureGroupLines(sources, onProgress, onAiProcessing) {
    const cacheKey = sources.map((s) => `${s.uid}:${s.vodId}`).sort().join('|')
    const cached = groupLinesCache.get(cacheKey)
    if (cached && Date.now() - cached.time < 86400000) return cached

    const allLines = []
    const allDetails = []
    const total = sources.length

    onProgress?.(0, total)

    try {
      const items = sources.map((src) => ({ key: src.uid, id: src.vodId }))
      const response = await api.batchDetail(items)
      const progressId = response.progressId

      if (progressId) {
        // Poll progress until done
        const results = await new Promise((resolve, reject) => {
          const poll = async () => {
            try {
              const progress = await api.getProgress(progressId)
              if (progress.found) {
                onProgress?.(progress.completed, progress.total)
                if (progress.done) {
                  resolve(progress.results || [])
                } else {
                  setTimeout(poll, 300)
                }
              } else {
                setTimeout(poll, 300)
              }
            } catch (err) {
              reject(err)
            }
          }
          poll()
        })

        // Process results
        for (const r of results) {
          if (r.detail) {
            const source = get().sources.find((s) => s.uid === r.key) || { uid: r.key, name: r.key }
            const detail = normalizeDetail(r.detail, source)
            if (detail?.playGroups?.length) {
              allDetails.push(detail)
              for (const group of detail.playGroups) {
                allLines.push({
                  sourceUid: r.key,
                  sourceName: source.name,
                  groupName: group.flag,
                  displayName: `${source.name}-${group.flag}`,
                  episodes: group.episodes || [],
                })
              }
            }
          }
        }
      } else {
        // No progressId, use results directly
        const results = response.results || response
        for (let i = 0; i < results.length; i++) {
          const r = results[i]
          if (r.detail) {
            const source = get().sources.find((s) => s.uid === r.key) || { uid: r.key, name: r.key }
            const detail = normalizeDetail(r.detail, source)
            if (detail?.playGroups?.length) {
              allDetails.push(detail)
              for (const group of detail.playGroups) {
                allLines.push({
                  sourceUid: r.key,
                  sourceName: source.name,
                  groupName: group.flag,
                  displayName: `${source.name}-${group.flag}`,
                  episodes: group.episodes || [],
                })
              }
            }
          }
          onProgress?.(i + 1, total)
        }
      }
    } catch (err) {
      console.error('batchDetail error, falling back:', err)
      let done = 0
      for (const src of sources) {
        try {
          const payload = await api.sourceDetail(src.uid, src.vodId)
          const source = get().sources.find((s) => s.uid === src.uid) || src
          const detail = normalizeDetail(payload, source)
          if (detail?.playGroups?.length) {
            allDetails.push(detail)
            for (const group of detail.playGroups) {
              allLines.push({
                sourceUid: src.uid,
                sourceName: src.name,
                groupName: group.flag,
                displayName: `${src.name}-${group.flag}`,
                episodes: group.episodes || [],
              })
            }
          }
        } catch {}
        done++
        onProgress?.(done, total)
      }
    }

    onProgress?.(total, total)

    let bestDetail = allDetails.find((d) => d.desc && d.director && d.actor) || allDetails[0] || null

    const { settings } = get()
    if (settings.aiEnabled && settings.aiUrl && settings.aiKey && allDetails.length > 1) {
      onAiProcessing?.(true)
      const merged = await aiMergeDetails(allDetails, settings)
      if (merged) bestDetail = merged
      onAiProcessing?.(false)
    }

    const result = { lines: allLines, detail: bestDetail, time: Date.now() }
    groupLinesCache.set(cacheKey, result)
    return result
  },

  async playEpisode(sourceUid, vodId, flagName, episodeIndex) {
    const detail = get().currentDetail
    if (!detail) return null
    set((s) => ({ loading: { ...s.loading, player: true } }))
    try {
      const group = detail.playGroups.find((g) => g.flag === flagName)
      if (!group) return null
      const episode = group.episodes[episodeIndex]
      if (!episode) return null
      let playUrl = episode.id || episode.url
      try {
        const playPayload = await api.sourcePlay(sourceUid, flagName, episode.id || episode.url)
        playUrl = buildPlayableUrl(playPayload, episode.id || episode.url)
      } catch {}
      const playback = { sourceUid, vodId, title: detail.name, poster: detail.pic, flagName, episodeIndex, episodeName: episode.name, url: playUrl }
      set({ currentPlayback: playback })
      get().upsertHistory(playback)
      return playback
    } catch (err) {
      console.error('playEpisode error:', err)
      return null
    } finally {
      set((s) => ({ loading: { ...s.loading, player: false } }))
    }
  },

  async autoSelectAndPlay(sources, vodId, flagName, episodeIndex) {
    set((s) => ({ loading: { ...s.loading, player: true } }))
    for (const src of sources) {
      try {
        const uid = src.uid || src.key
        const payload = await api.sourceDetail(uid, vodId)
        const source = get().sources.find((s) => s.uid === uid) || src
        const detail = normalizeDetail(payload, source)
        if (!detail) continue
        const group = detail.playGroups.find((g) => g.flag === flagName) || detail.playGroups[0]
        if (!group?.episodes?.length) continue
        const epIdx = Math.min(episodeIndex || 0, group.episodes.length - 1)
        const episode = group.episodes[epIdx]
        let playUrl = episode.id || episode.url
        try {
          const playPayload = await api.sourcePlay(uid, group.flag, episode.id || episode.url)
          playUrl = buildPlayableUrl(playPayload, episode.id || episode.url)
        } catch {}
        const playback = { sourceUid: uid, vodId, title: detail.name, poster: detail.pic, flagName: group.flag, episodeIndex: epIdx, episodeName: episode.name, url: playUrl, detail }
        set({ currentPlayback: playback, currentDetail: detail })
        get().upsertHistory(playback)
        return playback
      } catch { continue }
    }
    set((s) => ({ loading: { ...s.loading, player: false } }))
    return null
  },

  // ── 账号与登录态 ──────────────────────────────────────
  async fetchMe() {
    try {
      const res = await api.authMe()
      if (res?.loggedIn) {
        set({ user: { id: res.userId, username: res.username, role: res.role || 'user', isAdmin: !!res.isAdmin }, authReady: true })
        await get().loadRecords()
        get().migrateLocalHistory()
      } else {
        set({ user: null, authReady: true })
      }
    } catch {
      set({ user: null, authReady: true })
    }
  },

  async login(username, password) {
    const res = await api.authLogin(username, password)
    set({ user: { id: res.userId, username: res.username, role: res.role || 'user', isAdmin: !!res.isAdmin }, authReady: true })
    await get().loadRecords()
    get().migrateLocalHistory()
    return res
  },

  async register(username, password) {
    const res = await api.authRegister(username, password)
    set({ user: { id: res.userId, username: res.username, role: res.role || 'user', isAdmin: !!res.isAdmin }, authReady: true })
    await get().loadRecords()
    get().migrateLocalHistory()
    return res
  },

  async logout() {
    try {
      await api.authLogout()
    } catch {}
    set({ user: null, history: [] })
    window.location.hash = '#/login'
  },

  /** 从服务端加载线路级观看记录（登录后调用）。 */
  async loadRecords() {
    if (!get().user) return
    try {
      const res = await api.listRecords(1000)
      const list = (res?.records || []).map(fromRecord).filter(Boolean)
      set({ history: list })
    } catch (err) {
      console.warn('loadRecords failed:', err?.message)
    }
  },

  /**
   * 首次登录时把浏览器 localStorage 里旧的观看记录一次性迁进该账号。
   * 每个用户只迁一次（按 userId 打标记），迁移失败不写标记以便下次重试。
   */
  async migrateLocalHistory() {
    const user = get().user
    if (!user) return
    const marker = `playhub:history-imported:${user.id}`
    if (localStorage.getItem(marker)) return
    try {
      const legacy = loadLS(configHistoryKey(localStorage.getItem('playhub:configUrl') || ''), [])
      if (Array.isArray(legacy) && legacy.length) {
        const records = legacy.map(toRecordDto).filter((r) => r && r.sourceUid && r.vodId)
        if (records.length) {
          await api.importRecords(records)
          await get().loadRecords()
        }
      }
    } catch (err) {
      console.warn('migrateLocalHistory failed:', err?.message)
      return
    }
    localStorage.setItem(marker, '1')
  },

  // ── 观看记录（一条 = 一条线路）──────────────────────────
  upsertHistory(entry) {
    const dto = toRecordDto(entry)
    if (!dto || !dto.sourceUid || !dto.vodId) return

    const record = {
      ...dto,
      id: entry.id,
      isGroup: entry.isGroup || undefined,
      sources: entry.sources || undefined,
      lineIndex: entry.lineIndex ?? 0,
      timestamp: dto.updatedAt,
    }
    const key = groupKey(record)
    const list = [record, ...get().history.filter((h) => groupKey(h) !== key)].slice(0, MAX_HISTORY)
    set({ history: list })

    // 异步落库，失败不影响播放
    api.saveRecord(dto).catch(() => {})
  },

  updateHistoryEntry(patch) {
    const key = groupKey(patch)
    const list = get().history.map((h) =>
      groupKey(h) === key ? { ...h, ...patch, timestamp: Date.now() } : h
    )
    set({ history: list })
    const updated = list.find((h) => groupKey(h) === key)
    if (updated) api.saveRecord(toRecordDto(updated)).catch(() => {})
  },

  updateHistoryTime(sourceUid, vodId, currentTime, isGroup, title, flagName) {
    let updated = null
    const list = get().history.map((h) => {
      let match = false
      if (isGroup && h.isGroup) {
        match = h.title === title && (!flagName || h.flagName === flagName)
      } else if (!isGroup && !h.isGroup) {
        match = h.sourceUid === sourceUid && h.vodId === String(vodId)
          && (!flagName || h.flagName === flagName)
      }
      if (match) {
        updated = { ...h, currentTime: Math.floor(currentTime), timestamp: Date.now() }
        return updated
      }
      return h
    })
    set({ history: list })
    if (updated) api.saveRecord(toRecordDto(updated)).catch(() => {})
  },

  getHistoryEntry(sourceUid, vodId, isGroup, title, flagName) {
    return get().history.find((h) => {
      if (isGroup && h.isGroup) {
        return h.title === title && (!flagName || h.flagName === flagName)
      }
      if (!isGroup && !h.isGroup) {
        return h.sourceUid === sourceUid && h.vodId === String(vodId)
          && (!flagName || h.flagName === flagName)
      }
      return false
    })
  },

  async clearHistory() {
    set({ history: [] })
    try {
      await api.clearRecords()
    } catch {}
  },

  async loadLiveData(playlistUrl, epgUrl) {
    if (!playlistUrl) return
    try {
      const res = await api.liveBootstrap(playlistUrl, epgUrl)
      const rawChannels = res.channels || []
      const channelMap = new Map()
      for (const ch of rawChannels) {
        const name = String(ch.name || '').trim()
        if (!name) continue
        if (!channelMap.has(name)) {
          channelMap.set(name, { id: ch.id || name, name, group: ch.group || '未分组', logo: ch.logo || '', sources: [], programmes: [] })
        }
        const entry = channelMap.get(name)
        if (ch.url) entry.sources.push({ url: ch.url, label: `源${entry.sources.length + 1}` })
        if (ch.programmes?.length) entry.programmes = ch.programmes
      }
      const channels = [...channelMap.values()]
      const groupMap = new Map()
      for (const ch of channels) { groupMap.set(ch.group, (groupMap.get(ch.group) || 0) + 1) }
      const groups = [...groupMap.entries()].map(([name, count]) => ({ name, count }))
      set({ liveGroups: groups, liveChannels: channels, liveSummary: res.summary, currentLiveChannelId: channels[0]?.id || '', currentLiveSourceIndex: 0 })
    } catch (err) { console.error('loadLiveData error:', err) }
  },

  selectLiveChannel(id) { set({ currentLiveChannelId: id, currentLiveSourceIndex: 0 }) },
  selectLiveSource(index) { set({ currentLiveSourceIndex: index }) },

  selectNextLiveSource() {
    const { currentLiveChannelId, currentLiveSourceIndex, liveChannels } = get()
    const ch = liveChannels.find((c) => c.id === currentLiveChannelId)
    if (!ch) return false
    const next = currentLiveSourceIndex + 1
    if (next >= ch.sources.length) return false
    set({ currentLiveSourceIndex: next })
    return true
  },

  updateSettings(patch) {
    const next = { ...get().settings, ...patch }
    set({ settings: next })
    saveLS(SETTINGS_KEY, next)
  },
}))
