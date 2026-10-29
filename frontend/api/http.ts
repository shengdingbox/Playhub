// src/renderer/api/http.ts — Web 版统一 fetch 封装：credentials + JSON + 401 处理
// 与 Electron 版 api/client.ts（window.api IPC）平行：纯 HTTP 走这里。

/** 后端错误响应的常见形状（Spring Boot / 业务包装都兜一下） */
interface ApiErrorBody {
  message?: string;
  error?: string;
  msg?: string;
}

export class ApiError extends Error {
  constructor(
    public readonly status: number,
    message: string,
  ) {
    super(message);
    this.name = 'ApiError';
  }
}

/** 401 统一跳登录页（HashRouter 用 hash 路由，直接改 hash 即可） */
function redirectToLogin(): void {
  if (window.location.hash !== '#/login') {
    window.location.hash = '#/login';
  }
}

export interface ApiFetchOptions extends Omit<RequestInit, 'body'> {
  /** 传对象会 JSON.stringify 并自动补 Content-Type */
  body?: unknown;
  /** 为 true 时 401 不跳登录页（登录/注册/me 等认证端点自身用） */
  skipAuthRedirect?: boolean;
}

/**
 * 统一 API 请求：
 *   · 始终 `credentials: 'include'`（会话 cookie）；
 *   · 401 → 跳 `#/login`（除非 skipAuthRedirect），并抛 ApiError；
 *   · 非 2xx → 尝试从响应体里取 message 抛 ApiError；
 *   · 2xx 且有 body → 解析 JSON 返回；无 body（204/空）→ undefined。
 */
export async function apiFetch<T = unknown>(path: string, opts: ApiFetchOptions = {}): Promise<T> {
  const { body, skipAuthRedirect, headers, ...rest } = opts;
  const h: Record<string, string> = { ...(headers as Record<string, string> | undefined) };
  let payload: BodyInit | undefined;
  if (body !== undefined) {
    h['Content-Type'] = 'application/json';
    payload = JSON.stringify(body);
  }
  const res = await fetch(path, { ...rest, headers: h, body: payload, credentials: 'include' });
  if (res.status === 401) {
    if (!skipAuthRedirect) redirectToLogin();
    throw new ApiError(401, '未登录或会话已过期');
  }
  if (!res.ok) {
    let message = `请求失败（HTTP ${res.status}）`;
    try {
      const data = (await res.json()) as ApiErrorBody;
      message = data.message || data.msg || data.error || message;
    } catch {
      /* 非 JSON 错误体：用默认文案 */
    }
    throw new ApiError(res.status, message);
  }
  if (res.status === 204) return undefined as T;
  const text = await res.text();
  if (!text) return undefined as T;
  return JSON.parse(text) as T;
}
