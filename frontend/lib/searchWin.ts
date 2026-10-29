// src/renderer/lib/searchWin.ts
// Web 版：不存在独立搜索窗口 —— 搜索一律在**本窗口内**跳 `/search?agg=…`
// （由 HomePage 读 `?agg=` 执行全源搜索）。

/** 本窗口的导航函数（App 注入）。 */
let navFn: ((to: string) => void) | null = null;
export function bindSearchNav(fn: (to: string) => void): void { navFn = fn; }

/** Web 版没有「独立搜索窗口」（保留函数与签名，调用点无需改） */
export function isSearchWindow(): boolean { return false; }

/** 搜索结果路由 */
function inlineSearchRoute(term: string): string {
  return `/search?agg=${encodeURIComponent(String(term).trim())}`;
}

/** 搜索入口：本窗口内跳 `/search?agg=…`（App 未注入导航时退化到直接改 hash） */
export async function openSearchWindow(term: string): Promise<void> {
  const t = String(term || '').trim();
  if (!t) return;
  if (navFn) {
    navFn(inlineSearchRoute(t));
    return;
  }
  window.location.hash = `#${inlineSearchRoute(t)}`;
}
