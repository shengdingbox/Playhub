import client, { getJson, postJson } from './client'

export function loadConfig(url) {
  return postJson('/api/config/load', { url })
}

export function getConfig() {
  return getJson('/api/config')
}

export function getHealth() {
  return getJson('/api/health')
}

export function sourceHome(key) {
  return getJson(`/api/source/${encodeURIComponent(key)}/home`, {
    params: { filter: true },
  })
}

export function sourceCategory(key, tid, pg = 1, extend = {}) {
  return postJson(`/api/source/${encodeURIComponent(key)}/category`, {
    tid,
    pg: String(pg),
    filter: true,
    extend,
  })
}

export function sourceSearch(key, wd, quick = false, config = {}) {
  return getJson(`/api/source/${encodeURIComponent(key)}/search`, {
    params: { wd, quick },
    ...config,
  })
}

export function sourceDetail(key, id, config = {}) {
  return getJson(`/api/source/${encodeURIComponent(key)}/detail`, {
    params: { id },
    ...config,
  })
}

export function sourcePlay(key, flag, id) {
  return getJson(`/api/source/${encodeURIComponent(key)}/play`, {
    params: { flag, id },
  })
}

export function searchAll(wd, quick = false, uids = null) {
  const params = { wd, quick }
  // 只搜索指定源时传 uid 列表；为空表示搜索全部可搜索源
  if (Array.isArray(uids) && uids.length > 0) {
    params.uids = uids.join(',')
  }
  return getJson('/api/search/all', { params })
}

export function liveBootstrap(playlistUrl, epgUrl) {
  return postJson('/api/live/bootstrap', { playlistUrl, epgUrl })
}

export function batchDetail(items) {
  return postJson('/api/batch/detail', { items })
}

export function getProgress(id) {
  return getJson(`/api/progress/${id}`)
}
// ── 账号 ────────────────────────────────────────────────
export function authMe() {
  return getJson('/api/auth/me', { silent: true })
}

export function authLogin(username, password) {
  return postJson('/api/auth/login', { username, password }, { silent: true })
}

export function authRegister(username, password) {
  return postJson('/api/auth/register', { username, password }, { silent: true })
}

export function authLogout() {
  return postJson('/api/auth/logout', {}, { silent: true })
}

export function authChangePassword(oldPassword, newPassword) {
  return postJson('/api/auth/password', { oldPassword, newPassword }, { silent: true })
}

// ── 播放记录（一行 = 一条线路）────────────────────────────
export function listRecords(limit = 500) {
  return getJson('/api/records', { params: { limit }, silent: true })
}

export function saveRecord(record) {
  return postJson('/api/records', record, { silent: true })
}

export function importRecords(records) {
  return postJson('/api/records/import', { records }, { silent: true })
}

export function deleteRecord(id) {
  return client.delete(`/api/records/${id}`).then((r) => r.data)
}

export function deleteRecordsByVideo(sourceUid, vodId) {
  return client
    .delete('/api/records/video', { params: { sourceUid, vodId } })
    .then((r) => r.data)
}

export function clearRecords() {
  return client.delete('/api/records/all').then((r) => r.data)
}
// ── 片源库（全局共享，管理员导入 / 用户勾选）──────────────
export function listSources() {
  return getJson('/api/sources', { silent: true })
}

export function saveSourceSelection(sourceIds) {
  return client.put('/api/sources/selection', { sourceIds }, { silent: true }).then((r) => r.data)
}

export function importSources({ json, url }) {
  return postJson('/api/sources/import', { json, url }, { silent: true })
}

export function setSourceEnabled(id, enabled) {
  return client.patch(`/api/sources/${id}/enabled`, { enabled }, { silent: true }).then((r) => r.data)
}

export function deleteSource(id) {
  return client.delete(`/api/sources/${id}`, { silent: true }).then((r) => r.data)
}

export function clearSources() {
  return client.delete('/api/sources/all', { silent: true }).then((r) => r.data)
}