import React, { useEffect, useMemo, useState } from 'react'
import { Layout, Menu, Button, Space, Typography, Badge, Modal, Tag } from 'antd'
import {
  HomeOutlined,
  HistoryOutlined,
  VideoCameraOutlined,
  SettingOutlined,
  LogoutOutlined,
  AppstoreOutlined,
  UserOutlined,
  PlayCircleOutlined,
  MenuFoldOutlined,
  MenuUnfoldOutlined,
} from '@ant-design/icons'
import { useNavigate, useLocation } from 'react-router-dom'
import { useStore } from '../stores/useStore'

const { Sider, Content, Header } = Layout
const { Text } = Typography

const navItems = [
  { key: '/', icon: <HomeOutlined />, label: '首页' },
  { key: '/history', icon: <HistoryOutlined />, label: '历史' },
  { key: '/live', icon: <VideoCameraOutlined />, label: '直播' },
  // 片源库与设置都是管理员专属入口，普通用户不显示
  { key: '/sources', icon: <AppstoreOutlined />, label: '片源', adminOnly: true },
]

export default function AppLayout({ children }) {
  const navigate = useNavigate()
  const location = useLocation()
  const bootstrap = useStore((s) => s.bootstrap)
  const history = useStore((s) => s.history)
  const user = useStore((s) => s.user)
  // 管理员专属入口（片源）对普通用户隐藏
  const visibleNavItems = useMemo(
    () => (user?.isAdmin ? navItems : navItems.filter((item) => !item.adminOnly)),
    [user],
  )
  const logout = useStore((s) => s.logout)
  const [collapsed, setCollapsed] = useState(false)
  const [mobile, setMobile] = useState(window.innerWidth < 768)
  const [error, setError] = useState(null)

  useEffect(() => {
    bootstrap().catch((err) => {
      console.error('Bootstrap error:', err)
      setError(err.message)
    })
  }, [bootstrap])

  useEffect(() => {
    const onResize = () => setMobile(window.innerWidth < 768)
    window.addEventListener('resize', onResize)
    return () => window.removeEventListener('resize', onResize)
  }, [])

  const isPlayerPage = location.pathname === '/player'

  if (isPlayerPage) {
    return (
      <Layout style={{ minHeight: '100vh', background: '#000' }}>
        <Content>{children}</Content>
      </Layout>
    )
  }

  if (error) {
    return (
      <Layout style={{ minHeight: '100vh', background: '#f5f8ff' }}>
        <Content style={{ display: 'flex', alignItems: 'center', justifyContent: 'center' }}>
          <div style={{ textAlign: 'center', padding: 40 }}>
            <Title level={3} style={{ color: '#ff4d4f' }}>加载出错</Title>
            <Text type="secondary">{error}</Text>
            <br /><br />
            <Button type="primary" onClick={() => window.location.reload()}>刷新页面</Button>
          </div>
        </Content>
      </Layout>
    )
  }

  return (
    <Layout style={{ minHeight: '100vh' }}>
      {!mobile && (
        <Sider
          width={220}
          collapsedWidth={72}
          collapsed={collapsed}
          style={{
            background: '#fff',
            borderRight: '1px solid #f0f0f0',
            position: 'fixed',
            left: 0,
            top: 0,
            bottom: 0,
            zIndex: 100,
            display: 'flex',
            flexDirection: 'column',
          }}
        >
          <div
            style={{
              padding: collapsed ? '20px 12px' : '20px 20px',
              borderBottom: '1px solid #f0f0f0',
              display: 'flex',
              alignItems: 'center',
              gap: 12,
              cursor: 'pointer',
              transition: 'all 0.25s ease',
            }}
            onClick={() => navigate('/')}
          >
            <div
              style={{
                width: 36,
                height: 36,
                borderRadius: 10,
                background: 'linear-gradient(135deg, #1677ff, #4096ff)',
                display: 'flex',
                alignItems: 'center',
                justifyContent: 'center',
                flexShrink: 0,
              }}
            >
              <PlayCircleOutlined style={{ color: '#fff', fontSize: 20 }} />
            </div>
            {!collapsed && (
              <Text strong style={{ fontSize: 18, color: '#1a1a2e', letterSpacing: -0.5 }}>
                PlayHub
              </Text>
            )}
          </div>

          <div style={{ flex: 1, padding: '12px 8px' }}>
            <Menu
              mode="inline"
              selectedKeys={[location.pathname]}
              items={visibleNavItems}
              onClick={({ key }) => navigate(key)}
              style={{ border: 'none', background: 'transparent' }}
            />
          </div>

          <div style={{ padding: '12px 8px', borderTop: '1px solid #f0f0f0' }}>
            <Space direction="vertical" style={{ width: '100%' }} size={4}>
              <Button
                type="text"
                icon={<HistoryOutlined />}
                block
                onClick={() => navigate('/history')}
                style={{ textAlign: collapsed ? 'center' : 'left', position: 'relative' }}
              >
                {!collapsed && '观看记录'}
                {history.length > 0 && (
                  <span style={{
                    marginLeft: 8,
                    background: '#1677ff',
                    color: '#fff',
                    borderRadius: 10,
                    padding: '0 6px',
                    fontSize: 11,
                    lineHeight: '18px',
                    display: 'inline-block',
                  }}>
                    {history.length}
                  </span>
                )}
              </Button>
              {user?.isAdmin && (
                <Button
                  type="text"
                  icon={<SettingOutlined />}
                  block
                  onClick={() => navigate('/settings')}
                  style={{ textAlign: collapsed ? 'center' : 'left' }}
                >
                  {!collapsed && '设置'}
                </Button>
              )}
              {user && (
                <Button
                  type="text"
                  icon={<LogoutOutlined />}
                  block
                  danger
                  onClick={() => {
                    Modal.confirm({
                      title: '退出登录',
                      content: `确定退出当前账号「${user.username || ''}」吗？`,
                      okText: '退出',
                      cancelText: '取消',
                      onOk: () => logout(),
                    })
                  }}
                  style={{ textAlign: collapsed ? 'center' : 'left' }}
                >
                  {!collapsed && '退出登录'}
                </Button>
              )}
            </Space>
            {!collapsed && user && (
              <div
                style={{
                  marginTop: 10,
                  paddingTop: 10,
                  borderTop: '1px dashed #f0f0f0',
                  display: 'flex',
                  alignItems: 'center',
                  gap: 6,
                  color: '#8c8c8c',
                  fontSize: 12,
                }}
              >
                <UserOutlined />
                <span style={{ overflow: 'hidden', textOverflow: 'ellipsis', whiteSpace: 'nowrap' }}>
                  {user.username}
                </span>
                {user.isAdmin && (
                  <Tag color="gold" style={{ marginInlineStart: 'auto', marginInlineEnd: 0, fontSize: 10, lineHeight: '16px' }}>
                    管理员
                  </Tag>
                )}
              </div>
            )}
          </div>
        </Sider>
      )}

      <Layout style={{ marginLeft: mobile ? 0 : collapsed ? 72 : 220, transition: 'margin-left 0.25s ease' }}>
        {mobile && (
          <Header
            style={{
              background: '#fff',
              borderBottom: '1px solid #f0f0f0',
              padding: '0 16px',
              display: 'flex',
              alignItems: 'center',
              justifyContent: 'space-between',
              position: 'sticky',
              top: 0,
              zIndex: 99,
              height: 56,
            }}
          >
            <Space>
              <div
                style={{
                  width: 32,
                  height: 32,
                  borderRadius: 8,
                  background: 'linear-gradient(135deg, #1677ff, #4096ff)',
                  display: 'flex',
                  alignItems: 'center',
                  justifyContent: 'center',
                }}
              >
                <PlayCircleOutlined style={{ color: '#fff', fontSize: 18 }} />
              </div>
              <Text strong style={{ fontSize: 16 }}>PlayHub</Text>
            </Space>
            <Space>
              {user?.isAdmin && (
                <Button type="text" icon={<SettingOutlined />} onClick={() => navigate('/settings')} />
              )}
            </Space>
          </Header>
        )}

        {!mobile && (
          <div
            style={{
              position: 'fixed',
              left: collapsed ? 72 : 220,
              top: 12,
              zIndex: 101,
              transition: 'left 0.25s ease',
            }}
          >
            <Button
              type="text"
              icon={collapsed ? <MenuUnfoldOutlined /> : <MenuFoldOutlined />}
              onClick={() => setCollapsed(!collapsed)}
              style={{
                width: 28,
                height: 28,
                borderRadius: 8,
                background: '#fff',
                border: '1px solid #f0f0f0',
                boxShadow: '0 1px 3px rgba(0,0,0,0.06)',
              }}
            />
          </div>
        )}

        <Content style={{ minHeight: '100vh' }}>
          {children}
        </Content>

        {mobile && (
          <div
            style={{
              position: 'fixed',
              bottom: 0,
              left: 0,
              right: 0,
              background: '#fff',
              borderTop: '1px solid #f0f0f0',
              display: 'flex',
              justifyContent: 'space-around',
              padding: '6px 0',
              zIndex: 100,
            }}
          >
            {visibleNavItems.map((item) => (
              <div
                key={item.key}
                onClick={() => navigate(item.key)}
                style={{
                  display: 'flex',
                  flexDirection: 'column',
                  alignItems: 'center',
                  gap: 2,
                  padding: '4px 12px',
                  borderRadius: 8,
                  cursor: 'pointer',
                  color: location.pathname === item.key ? '#1677ff' : '#6b7280',
                  background: location.pathname === item.key ? '#e6f4ff' : 'transparent',
                  transition: 'all 0.2s ease',
                }}
              >
                <span style={{ fontSize: 20 }}>{item.icon}</span>
                <span style={{ fontSize: 11, fontWeight: 500 }}>{item.label}</span>
              </div>
            ))}
          </div>
        )}
      </Layout>
    </Layout>
  )
}
