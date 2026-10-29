// src/renderer/pages/LoginPage.tsx — 登录 / 注册页（Web 版；cookie 会话）
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { login, register } from '../api/auth';

/**
 * 登录页（深色渐变卡 + 圆角，沿用全局令牌与 `card` / `primary` / `linkbtn` 组件类）。
 *   · 登录成功 → 回首页 `/`（replace，避免回退键又回到登录页）；
 *   · 「去注册」行内切换为注册模式，注册成功同样进入首页（后端注册即登录；
 *     若后端注册后不落会话，可在 lead 接入时改为注册后再调 login()）；
 *   · 已登录状态进入本页时不强制跳走 —— 守卫由 App 统一处理。
 */
export default function LoginPage() {
  const nav = useNavigate();
  const [mode, setMode] = useState<'login' | 'register'>('login');
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [confirm, setConfirm] = useState('');
  const [busy, setBusy] = useState(false);
  const [err, setErr] = useState('');

  const submit = async (e: React.FormEvent) => {
    e.preventDefault();
    const name = username.trim();
    if (!name || !password) {
      setErr('请输入用户名和密码');
      return;
    }
    if (mode === 'register' && password !== confirm) {
      setErr('两次输入的密码不一致');
      return;
    }
    setBusy(true);
    setErr('');
    try {
      if (mode === 'login') await login(name, password);
      else await register(name, password);
      nav('/', { replace: true });
    } catch (ex) {
      setErr(ex instanceof Error ? ex.message : String(ex));
    } finally {
      setBusy(false);
    }
  };

  const switchMode = (next: 'login' | 'register') => {
    setMode(next);
    setErr('');
    setConfirm('');
  };

  return (
    <div
      style={{
        flex: 1,
        minHeight: '100vh',
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        padding: 24,
        // 与 body 基线同款的环境光晕，登录页作为全屏页自带一层氛围
        background:
          'radial-gradient(1200px 500px at 85% -10%, color-mix(in srgb, var(--accent) 14%, transparent), transparent 60%),' +
          ' radial-gradient(900px 420px at -10% 110%, color-mix(in srgb, var(--accent-2) 10%, transparent), transparent 55%)',
      }}
    >
      <div className="card" style={{ width: 360, maxWidth: '92vw', padding: 26, boxShadow: 'var(--shadow-lg)' }}>
        {/* 品牌字：渐变文字与 .sidebar .logo 同款 */}
        <div
          style={{
            fontSize: 20,
            fontWeight: 800,
            letterSpacing: '.3px',
            marginBottom: 4,
            background: 'linear-gradient(90deg, var(--accent), var(--accent-2))',
            WebkitBackgroundClip: 'text',
            backgroundClip: 'text',
            color: 'transparent',
          }}
        >
          Playhub
        </div>
        <div className="muted" style={{ fontSize: 12, marginBottom: 18 }}>
          {mode === 'login' ? '登录后继续使用' : '创建一个新账号'}
        </div>

        <form onSubmit={(e) => void submit(e)} style={{ display: 'flex', flexDirection: 'column', gap: 12 }}>
          <label style={{ display: 'flex', flexDirection: 'column', gap: 5 }}>
            <span className="muted" style={{ fontSize: 12 }}>用户名</span>
            <input
              value={username}
              onChange={(e) => setUsername(e.target.value)}
              autoFocus
              autoComplete="username"
              placeholder="请输入用户名"
            />
          </label>
          <label style={{ display: 'flex', flexDirection: 'column', gap: 5 }}>
            <span className="muted" style={{ fontSize: 12 }}>密码</span>
            <input
              type="password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              autoComplete={mode === 'login' ? 'current-password' : 'new-password'}
              placeholder="请输入密码"
            />
          </label>
          {mode === 'register' && (
            <label style={{ display: 'flex', flexDirection: 'column', gap: 5 }}>
              <span className="muted" style={{ fontSize: 12 }}>确认密码</span>
              <input
                type="password"
                value={confirm}
                onChange={(e) => setConfirm(e.target.value)}
                autoComplete="new-password"
                placeholder="再次输入密码"
              />
            </label>
          )}

          {err && <div className="err" style={{ fontSize: 12 }}>{err}</div>}

          <button className="primary" type="submit" disabled={busy} style={{ width: '100%', padding: '9px 0' }}>
            {busy ? '请稍候…' : mode === 'login' ? '登 录' : '注 册'}
          </button>
        </form>

        <div className="row" style={{ justifyContent: 'center', marginTop: 14, gap: 4 }}>
          <span className="muted" style={{ fontSize: 12 }}>
            {mode === 'login' ? '还没有账号？' : '已有账号？'}
          </span>
          <button
            type="button"
            className="linkbtn"
            style={{ fontSize: 12 }}
            onClick={() => switchMode(mode === 'login' ? 'register' : 'login')}
          >
            {mode === 'login' ? '去注册' : '去登录'}
          </button>
        </div>
      </div>
    </div>
  );
}
