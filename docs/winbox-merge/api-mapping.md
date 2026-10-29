# Win-box → Playhub Web 化：接口适配规范

## 背景

Win-box 是 Electron 桌面应用，前端通过 `window.api.<ns>.<method>()` 经 IPC 调主进程。
本任务把它改成 Web 应用：`window.api.<ns>.<method>()` 改为经 `fetch('/api/...')` 调 Playhub Java 后端。

**核心约束**：`frontend/api/client.ts`（607 行）一行不改——我们提供一个新的 `window.api` 实现。

## 响应格式（IpcResult）

所有接口统一返回：

```json
{ "ok": true,  "data": <T> }
{ "ok": false, "error": { "code": "xxx", "message": "中文错误消息" } }
```

`client.ts` 里的 `unwrap()` 在 `ok:false` 时 `throw new Error(error.message)`。

## window.api 命名空间 → REST 端点映射

| window.api | HTTP | 端点 | 说明 | Playhub 现状 |
|---|---|---|---|---|
| system.ping | GET | /api/health | 健康检查 | ✅ 已有（需包装成 IpcResult） |
| system.setTheme | — | — | 皮肤切换纯前端 | 前端本地处理，不调后端 |
| config.cfgGet | GET | /api/config | 当前配置 | ✅ 已有 |
| config.import | POST | /api/config/load `{url}` | 导入配置 | ✅ 已有 |
| config.listSites | GET | /api/config | 同上 | ✅ 用 /api/config 的 sites |
| vod.home(key) | GET | /api/source/{key}/home?filter=true | 首页 | ✅ 已有 |
| vod.category({key,tid,pg,extend}) | POST | /api/source/{key}/category `{tid,pg,filter:true,extend}` | 分类 | ✅ 已有 |
| vod.detail({key,ids}) | GET | /api/source/{key}/detail?id={ids[0]} | 详情 | ✅ 已有（ids 只取第一个） |
| vod.search({key,wd}) | GET | /api/source/{key}/search?wd= | 单源搜索 | ✅ 已有 |
| vod.searchAll(wd) | GET | /api/search/all?wd= | 全源搜索 | ✅ 已有（一次性返回，无进度） |
| vod.play({key,flag,id}) | GET | /api/source/{key}/play?flag=&id= | 播放 | ✅ 已有 |
| live.load(index) | POST | /api/live/bootstrap `{}` | 直播 | ✅ 已有 |
| danmaku.search/get/fetch/episodes | POST | /api/danmaku/* | 弹幕 | ❌ 需新增（teammate C） |
| meta.search/extra/doubanExtra | POST | /api/meta/* | 豆瓣元数据 | ❌ 需新增（teammate C） |
| playerPrefs.get/set | — | localStorage | 播放偏好 | 前端本地处理 |
| backup.export/import | — | — | 设置备份 | 阶段 1 stub 返回 ok:false |

## 事件订阅（Electron IPC 事件 → Web 阶段 1 用 stub）

所有 `onXxx(cb)` 返回 `() => {}`（noop 退订），不触发回调。后续如需进度（searchAll）再换 SSE。

## Electron 特有（需要移除/改造）

- `win.*`（窗口管理）→ 全部移除
- `boss.*`（老板键）→ 移除
- `player.open`（独立播放窗口）→ 改为路由跳转 `/player`
- `mpv.*`/`engine.*`（MPV 内核）→ 移除，Web 只用 HTML5
- `update.*` → 移除
- `net.*`/`ui.*`/`dlna.*` → 移除
- `plugins.*`/`merge.*` → 阶段 1 stub

## 认证

- 所有 `/api/**` 请求需要登录（cookie session）
- fetch 统一 `credentials: 'include'`
- 401 → 跳转 `/#/login`
- 公开端点：`/api/auth/*`、`/api/health`

## Playhub 现有后端响应格式 vs IpcResult

Playhub 现有接口直接返回 JSON（如 `{sites:[...]}` 或爬虫原始 JsonNode）。
**适配层负责包装**：fetch 到响应后包成 `{ok:true, data}`；HTTP 错误/异常包成 `{ok:false,error}`。

## 关键文件

- Win-box 源码参考：`C:\Users\fei\AppData\Local\Temp\winbox\`（src/renderer, src/main/preload.ts, src/shared/）
- 新前端：`frontend/`（已从 Win-box renderer 复制）
- 共享类型：`shared/`（项目根）
- 引擎纯逻辑：`engine/`（项目根）
- Playhub 后端：`src/main/java/com/tvbox/web/`

## 前端路由

Win-box 用 react-router-dom v7 + HashRouter。页面：
- `/` HomePage（首页：分类 + 视频墙）
- `/discover` DiscoverPage（发现页）
- `/detail/:key/:id` DetailPage
- `/player` PlayerPage（播放，从详情跳转）
- `/live` LivePage
- `/history` HistoryPage
- `/favorites` FavoritesPage
- `/storage` StoragePage（片源管理）
- `/config` ConfigPage（设置）
- `/about` AboutPage

需新增：`/login`（Web 版需要登录）
