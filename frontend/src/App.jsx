import React, { useEffect } from 'react'
import { HashRouter, Routes, Route, useLocation } from 'react-router-dom'
import { AnimatePresence } from 'framer-motion'
import { Spin } from 'antd'
import AppLayout from './components/AppLayout'
import HomeView from './views/HomeView'
import DetailView from './views/DetailView'
import PlayerView from './views/PlayerView'
import HistoryView from './views/HistoryView'
import LiveView from './views/LiveView'
import SourcesView from './views/SourcesView'
import SettingsView from './views/SettingsView'
import LoginView from './views/LoginView'
import { useStore } from './stores/useStore'
import { Result, Button } from 'antd'

/** 管理员专属路由：普通用户访问时给出提示，不暴露页面内容。 */
function AdminRoute({ children }) {
  const user = useStore((s) => s.user)
  if (!user?.isAdmin) {
    return (
      <Result
        status="403"
        title="无权访问"
        subTitle="该页面仅管理员可用"
        style={{ padding: '80px 24px' }}
      />
    )
  }
  return children
}

function AnimatedRoutes() {
  const location = useLocation()
  return (
    <AnimatePresence mode="wait">
      <Routes location={location} key={location.pathname}>
        <Route path="/" element={<HomeView />} />
        <Route path="/detail" element={<DetailView />} />
        <Route path="/player" element={<PlayerView />} />
        <Route path="/history" element={<HistoryView />} />
        <Route path="/live" element={<LiveView />} />
        <Route path="/sources" element={<AdminRoute><SourcesView /></AdminRoute>} />
        <Route path="/settings" element={<AdminRoute><SettingsView /></AdminRoute>} />
        {/* 未登录时 AuthGate 直接渲染登录页；这条路由用于手动访问 #/login */}
        <Route path="/login" element={<LoginView />} />
      </Routes>
    </AnimatePresence>
  )
}

/**
 * 登录门禁：未登录时整站只显示登录页，业务界面完全不渲染，
 * 也就不会触发任何 /api 请求（后端对未登录的 /api 一律返回 401）。
 */
function AuthGate({ children }) {
  const authReady = useStore((s) => s.authReady)
  const user = useStore((s) => s.user)
  const fetchMe = useStore((s) => s.fetchMe)

  useEffect(() => {
    fetchMe()
  }, [fetchMe])

  if (!authReady) {
    return (
      <div
        style={{
          minHeight: '100vh',
          display: 'flex',
          alignItems: 'center',
          justifyContent: 'center',
          background: '#f7f9fc',
        }}
      >
        <Spin size="large" />
      </div>
    )
  }

  if (!user) {
    return <LoginView />
  }

  return children
}

export default function App() {
  return (
    <HashRouter>
      <AuthGate>
        <AppLayout>
          <AnimatedRoutes />
        </AppLayout>
      </AuthGate>
    </HashRouter>
  )
}
