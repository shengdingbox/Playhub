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
- `/` DiscoverPage（发现页，默认首页）
- `/home` HomePage（点播：分类 + 视频墙）
- `/search` HomePage（全源搜索）
- `/detail/:key/:id` DetailPage
- `/player` PlayerPage（播放，从详情跳转）
- `/live` LivePage
- `/history` HistoryPage
- `/favorites` FavoritesPage
- `/storage` StoragePage（WebDAV）
- `/config` ConfigPage（设置）
- `/about` AboutPage
- `/login` LoginPage（**Web 版新增**，AuthGate 守卫）

---

# 阶段 2 契约（网盘 / 磁力 / 蜘蛛兼容性）

## 网盘（drives）

前端 `client.ts` 有 10 个调用点，后端端点：

| 前端方法 | 端点 | 说明 |
|---|---|---|
| driveGet | `GET /api/drive/list` | 返回 `{provider: token}` 映射 |
| driveSet(provider, token) | `POST /api/drive/set` `{provider,token}` | 手动绑定凭据 |
| driveRemove(provider) | `POST /api/drive/remove` `{provider}` | 解绑 |
| driveQrCreate(provider?) | `POST /api/drive/qrCreate` `{provider?}` | 扫码登录（可占位） |
| driveQrPoll(provider,sid) | `POST /api/drive/qrPoll` `{provider,sid}` | 扫码轮询（可占位） |
| driveWebLogin(provider) | `POST /api/drive/webLogin` `{provider}` | 可返回 not-supported |
| ucTv*（4 个） | `/api/drive/ucTv*` | 可整体 not-supported |
| （浏览/播放） | `POST /api/drive/browse`、`POST /api/drive/playUrl` | 由适配层接 |

优先级：夸克/UC 的「粘贴 token 绑定 + 浏览 + 取播放地址」跑通即可。

## 磁力（BT）—— **透明集成在播放链路，不是独立前端接口**

⚠ 前端 `bt.*` 只有 `detectPlayers`（Web 返回空数组）。磁力是后端自动处理的：

```
TvboxFacadeService.play() 返回前
  → 若 result.url 以 "magnet:" 开头
  → torrentService.open(magnet)      // aria2 添加 + 等首块落盘
  → 成功：url 改写为 "/proxy?do=bt&gid=<gid>&file=<idx>"，parse=0
  → 失败：保留原 magnet + message 人话提示（不抛异常）

ProxyController 的 do=bt 分支：
  GET /proxy?do=bt&gid=x&file=n
  → 解析 Range 头
  → torrentService.waitRange(gid, file, start, end)  // 等 piece 落盘，超时→503
  → RandomAccessFile 从 absPath+fileOffset+start 读字节
  → 206 Partial Content + Content-Range
```

参考：Win-box `src/main/torrent/torrentPlay.ts`（301 行）、`Aria2Sidecar.ts`（247 行）、`SpiderHost.ts:3028 tryMagnetPlay`。

aria2 缺失时返回明确错误「aria2 未安装」，不崩溃。

## 蜘蛛引擎兼容性（转换产物修补）

两个「就地修补」机制，在 dex2jar 转换产物生成后、加载前运行：

1. **classFix**：dex2jar 把 `invoke-super` 转成自递归 `invokespecial`（owner 指向本类）→ StackOverflowError。
   修复 = 把该 Methodref 的 `class_index` 就地改写成 `super_class`（2 字节改写，不重排字节码）。
   护栏：只改「invokespecial 指向本类同名同签名」的引用；该 Methodref 仅被这一处使用；不碰 private/<init>/<clinit>；方法必须在超类链上声明。
   影响面：整族盘搜蜘蛛（Pan/MiPan/PanSou/Baiku/KuLe 等）的 init 全栈溢出。

2. **appProxyStub**：jar 自带的极简 `com/github/catvod/spider/Proxy`（只有 `proxy(Map)`+`<init>`）缺 `getProxyUrlDo(String)` → NoSuchMethodError。
   修复 = 仅当是极简形态时补上该方法（返回 `/proxy?do=` + 参数）；形态不符不动。

**不需要移植 okhttp4Compat**：Playhub 已用 okhttp 4.12.0 + kotlin-stdlib 1.9.25（打包已含），4.x 天然支持两种 `RequestBody.create` 参数序。
