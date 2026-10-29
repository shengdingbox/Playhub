// src/renderer/api/auth.ts — 认证接口（cookie 会话；401 = 未登录）
import { apiFetch } from './http';

export interface AuthUser {
  id: number | string;
  username: string;
  role: string;
}

/**
 * 当前登录用户；未登录（401）返回 **null** 而不是抛错。
 * 其余异常（网络失败等）照常抛出，调用方可按需 catch 成 null。
 */
export async function fetchMe(): Promise<AuthUser | null> {
  try {
    return await apiFetch<AuthUser>('/api/auth/me', { method: 'GET', skipAuthRedirect: true });
  } catch (e) {
    if (e instanceof Error && 'status' in e && (e as { status: number }).status === 401) return null;
    throw e;
  }
}

/** 登录；失败（含 401 密码错误）抛 ApiError（message 取后端文案） */
export function login(username: string, password: string): Promise<AuthUser> {
  return apiFetch<AuthUser>('/api/auth/login', {
    method: 'POST',
    body: { username, password },
    skipAuthRedirect: true, // 登录接口的 401 = 凭据错误，不应再跳一次登录页
  });
}

/** 注册；失败（如用户名已存在）抛 ApiError */
export function register(username: string, password: string): Promise<AuthUser> {
  return apiFetch<AuthUser>('/api/auth/register', {
    method: 'POST',
    body: { username, password },
    skipAuthRedirect: true,
  });
}

/** 登出（清会话 cookie）；失败静默不算致命，但这里仍抛给调用方决定 */
export function logout(): Promise<void> {
  return apiFetch<void>('/api/auth/logout', { method: 'POST', skipAuthRedirect: true });
}
