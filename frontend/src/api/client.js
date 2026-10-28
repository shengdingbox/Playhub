import axios from 'axios'
import { message } from 'antd'

const client = axios.create({
  baseURL: '/',
  timeout: 90000,
  withCredentials: true,
})

// Track if message handler is initialized
let messageInitialized = false

export function initMessageHandler() {
  if (messageInitialized) return
  messageInitialized = true

  client.interceptors.response.use(
    (res) => res,
    (err) => {
      if (isAbortError(err)) return Promise.reject(err)

      const status = err.response?.status || 0

      // 未登录 / 登录态失效：统一跳登录页，不弹错误提示（这是常态，不是故障）
      if (status === 401) {
        if (!window.location.hash.startsWith('#/login')) {
          window.location.hash = '#/login'
        }
        return Promise.reject(new Error('请先登录'))
      }

      const msg =
        err.response?.data?.message ||
        (typeof err.response?.data === 'string' ? err.response.data : null) ||
        err.message ||
        '请求失败'

      // 聚合类操作（如全站搜索）中单个源失败属正常现象，
      // 由调用方静默处理，不弹全局错误提示。
      if (err.config?.silent) return Promise.reject(new Error(msg))

      // Don't show toast for "未加载配置" etc managed by components
      if (status === 400 && msg.includes('配置')) {
        // Config-related errors handled by components
      } else {
        message.error(msg, 3)
      }

      return Promise.reject(new Error(msg))
    }
  )
}

export async function getJson(url, config) {
  const res = await client.get(url, config)
  return res.data
}

export async function postJson(url, body, config) {
  const res = await client.post(url, body, config)
  return res.data
}

export function isAbortError(err) {
  return axios.isCancel(err) || err?.code === 'ERR_CANCELED'
}

export default client
