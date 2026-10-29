// src/renderer/components/TitleBar.tsx
// Web 版：浏览器没有自有窗口 chrome —— 标题栏只保留品牌/标题块。
//   原 Electron 的拖拽区、最小化/最大化/关闭/置顶/小窗口按钮已随窗口管理一并移除。
import { useEffect, useState } from 'react';
import { client } from '../api/client';

interface TitleBarProps {
  title?: string;
  /**
   * `mac` 原为 macOS 交通灯变体（纯窗口控制按钮）—— Web 版不渲染任何内容。
   */
  variant?: 'win' | 'mac';
}

export default function TitleBar({ title = 'Win-Box', variant = 'win' }: TitleBarProps) {
  const [icon, setIcon] = useState('');
  useEffect(() => {
    // Promise.resolve().then 兜底：web 桥未实现 system.icon 时同步异常也转为 rejection，不炸组件
    Promise.resolve()
      .then(() => client.appIcon())
      .then((d) => { if (d) setIcon(d); })
      .catch(() => undefined);
  }, []);

  if (variant === 'mac') return null;

  return (
    <div className="titlebar">
      <div className="tb-title" title={title}>
        {icon ? <img className="tb-ico" src={icon} alt="" draggable={false} /> : <span className="tb-dot" />}
        <span className="tb-text">{title}</span>
      </div>
    </div>
  );
}
