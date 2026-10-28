/**
 * 调起手机本地播放器。
 *
 * <p>浏览器无法直接「打开某个 App」，但可以用各平台的 URL scheme：
 * <ul>
 *   <li><b>Android</b>：{@code intent://} 语法，能指定包名（VLC / MX Player）或不指定包名交由系统选择；
 *       也可以用 {@code market://} 之类的自定义 scheme，但 {@code intent://} 覆盖面最广。</li>
 *   <li><b>iOS</b>：只能用应用自己注册的 scheme（VLC 的 {@code vlc-x-callback://}、
 *       Infuse 的 {@code infuse://} 等），没有 Android 那样的通用跳转机制。</li>
 *   <li><b>桌面</b>：浏览器没有对应能力，只提供复制链接。</li>
 * </ul>
 *
 * <p>注意：调起必须在用户点击的同一事件里触发；且目标地址要能被手机访问到
 * （用本机代理出的 {@code /proxy?...} 地址时，手机需能连到同一台服务器）。
 */

/** 把相对地址补成绝对地址，外部播放器才能访问。 */
export function toAbsoluteUrl(url) {
  if (!url) return ''
  const raw = String(url).trim()
  if (!raw) return ''
  if (/^(https?|rtmp|rtsp|ftp|magnet|thunder|ed2k):/i.test(raw)) return raw
  if (raw.startsWith('//')) return `${window.location.protocol}${raw}`
  try {
    return new URL(raw, window.location.origin).toString()
  } catch {
    return raw
  }
}

export function detectPlatform() {
  const ua = navigator.userAgent || ''
  if (/Android/i.test(ua)) return 'android'
  if (/iPhone|iPad|iPod/i.test(ua)) return 'ios'
  return 'desktop'
}

export function isMobile() {
  return detectPlatform() !== 'desktop'
}

/**
 * 构造 Android 的 intent 链接。
 *
 * @param url 目标地址（绝对）
 * @param pkg 目标应用包名；为空则由系统弹出「用哪个应用打开」
 */
export function buildAndroidIntent(url, pkg) {
  try {
    const parsed = new URL(url)
    const scheme = parsed.protocol.replace(':', '')
    // intent:// 后面只保留 host + path + query（不含 scheme://）
    const rest = url.slice(url.indexOf('//') + 2)
    const params = [`scheme=${scheme}`]
    if (pkg) {
      params.push(`package=${pkg}`)
    }
    params.push('action=android.intent.action.VIEW')
    params.push('type=video/*')
    return `intent://${rest}#Intent;${params.join(';')};end`
  } catch {
    return url
  }
}

/**
 * 返回当前平台可用的播放器列表。
 * 每一项：{ key, name, hint, href }
 */
export function buildPlayerOptions(rawUrl) {
  const url = toAbsoluteUrl(rawUrl)
  if (!url) return []
  const platform = detectPlatform()
  const options = []

  if (platform === 'android') {
    options.push({
      key: 'system',
      name: '系统播放器',
      hint: '弹窗让你选择已安装的应用',
      href: buildAndroidIntent(url, null),
    })
    options.push({
      key: 'vlc',
      name: 'VLC',
      hint: '需要已安装 VLC for Android',
      href: buildAndroidIntent(url, 'org.videolan.vlc'),
    })
    options.push({
      key: 'mx',
      name: 'MX Player',
      hint: '需要已安装 MX Player',
      href: buildAndroidIntent(url, 'com.mxtech.videoplayer.ad'),
    })
    options.push({
      key: 'mxpro',
      name: 'MX Player Pro',
      hint: '需要已安装 MX Player Pro',
      href: buildAndroidIntent(url, 'com.mxtech.videoplayer.pro'),
    })
    options.push({
      key: 'nplayer',
      name: 'nPlayer',
      hint: '需要已安装 nPlayer',
      href: buildAndroidIntent(url, 'com.newin.nplayer.pro'),
    })
  } else if (platform === 'ios') {
    options.push({
      key: 'system',
      name: '系统播放器',
      hint: 'Safari 直接打开该地址',
      href: url,
    })
    options.push({
      key: 'vlc',
      name: 'VLC',
      hint: '需要已安装 VLC for iOS',
      href: `vlc-x-callback://x-callback-url/stream?url=${encodeURIComponent(url)}`,
    })
    options.push({
      key: 'infuse',
      name: 'Infuse',
      hint: '需要已安装 Infuse',
      href: `infuse://x-callback-url/play?url=${encodeURIComponent(url)}`,
    })
    options.push({
      key: 'nplayer',
      name: 'nPlayer',
      hint: '需要已安装 nPlayer',
      href: `nplayer-http://${url.replace(/^https?:\/\//i, '')}`,
    })
  } else {
    options.push({
      key: 'system',
      name: '系统默认应用打开',
      hint: '交给操作系统的关联程序处理',
      href: url,
    })
  }

  return options
}

/** 复制文本（优先 Clipboard API，失败回退到 execCommand）。 */
export async function copyText(text) {
  try {
    if (navigator.clipboard?.writeText) {
      await navigator.clipboard.writeText(text)
      return true
    }
  } catch {
    // 继续走回退方案
  }
  try {
    const textarea = document.createElement('textarea')
    textarea.value = text
    textarea.style.position = 'fixed'
    textarea.style.opacity = '0'
    document.body.appendChild(textarea)
    textarea.select()
    const ok = document.execCommand('copy')
    document.body.removeChild(textarea)
    return ok
  } catch {
    return false
  }
}
