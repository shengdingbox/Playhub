// src/renderer/lib/detailWin.ts
// Web 版：不存在独立详情窗口 —— 详情一律在**本窗口内**路由跳转
// （伪墓碑：上一个页面保持挂载、仅隐藏，返回零重载，见 App.tsx 的 KeepAliveRoutes）。
import { detailRoute } from '../../shared/detailWin';

/** Web 版没有「独立详情窗口」（保留函数与签名，调用点无需改） */
export function isDetailWindow(): boolean {
  return false;
}

/** 打开详情页统一入口：本窗口内跳转。 */
export async function openDetailRoute(
  nav: (to: string) => void,
  key: string,
  id: string,
  query?: string,
): Promise<void> {
  nav(detailRoute(key, id, query));
}
