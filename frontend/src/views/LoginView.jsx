import React, { useState } from 'react'
import { Button, Card, Form, Input, Tabs, Typography, message } from 'antd'
import { LockOutlined, UserOutlined } from '@ant-design/icons'
import { motion } from 'framer-motion'
import { useNavigate } from 'react-router-dom'
import { useStore } from '../stores/useStore'

const { Title, Text } = Typography

const cardVariants = {
  initial: { opacity: 0, y: 24, scale: 0.98 },
  animate: { opacity: 1, y: 0, scale: 1, transition: { duration: 0.4, ease: [0.4, 0, 0.2, 1] } },
}

/**
 * 登录 / 注册页。
 *
 * <p>未登录时由 App 的 AuthGate 直接渲染本组件，因此这里不需要额外路由守卫。
 * 登录成功后进入首页；若 hash 之前带了目标地址则回跳。
 */
export default function LoginView() {
  const navigate = useNavigate()
  const login = useStore((s) => s.login)
  const register = useStore((s) => s.register)
  const [tab, setTab] = useState('login')
  const [loading, setLoading] = useState(false)

  const finish = () => {
    const target = sessionStorage.getItem('playhub:afterLogin') || ''
    sessionStorage.removeItem('playhub:afterLogin')
    navigate(target && target !== '/login' ? target : '/', { replace: true })
  }

  const handleLogin = async (values) => {
    setLoading(true)
    try {
      await login(values.username, values.password)
      message.success('登录成功')
      finish()
    } catch (err) {
      message.error(err?.message || '登录失败')
    } finally {
      setLoading(false)
    }
  }

  const handleRegister = async (values) => {
    if (values.password !== values.confirm) {
      message.error('两次输入的密码不一致')
      return
    }
    setLoading(true)
    try {
      await register(values.username, values.password)
      message.success('注册成功，已自动登录')
      finish()
    } catch (err) {
      message.error(err?.message || '注册失败')
    } finally {
      setLoading(false)
    }
  }

  return (
    <div
      style={{
        minHeight: '100vh',
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        background: 'linear-gradient(135deg, #e6f4ff 0%, #f0f5ff 45%, #fafaff 100%)',
        padding: 24,
      }}
    >
      <motion.div variants={cardVariants} initial="initial" animate="animate" style={{ width: '100%', maxWidth: 420 }}>
        <Card
          style={{
            borderRadius: 20,
            boxShadow: '0 12px 32px rgba(0, 0, 0, 0.08)',
            border: '1px solid #f0f0f0',
          }}
          styles={{ body: { padding: '32px 32px 24px' } }}
        >
          <div style={{ textAlign: 'center', marginBottom: 24 }}>
            <Title level={2} style={{ margin: 0, fontWeight: 700 }}>
              PlayHub
            </Title>
            <Text type="secondary">登录后即可同步你的观看记录</Text>
          </div>

          <Tabs
            activeKey={tab}
            onChange={setTab}
            centered
            items={[
              {
                key: 'login',
                label: '登录',
                children: (
                  <Form layout="vertical" onFinish={handleLogin} autoComplete="on" requiredMark={false}>
                    <Form.Item
                      name="username"
                      rules={[{ required: true, message: '请输入用户名' }]}
                    >
                      <Input
                        size="large"
                        prefix={<UserOutlined />}
                        placeholder="用户名"
                        autoComplete="username"
                      />
                    </Form.Item>
                    <Form.Item
                      name="password"
                      rules={[{ required: true, message: '请输入密码' }]}
                    >
                      <Input.Password
                        size="large"
                        prefix={<LockOutlined />}
                        placeholder="密码"
                        autoComplete="current-password"
                      />
                    </Form.Item>
                    <Button type="primary" size="large" block htmlType="submit" loading={loading}>
                      登录
                    </Button>
                  </Form>
                ),
              },
              {
                key: 'register',
                label: '注册',
                children: (
                  <Form layout="vertical" onFinish={handleRegister} autoComplete="off" requiredMark={false}>
                    <Form.Item
                      name="username"
                      rules={[
                        { required: true, message: '请输入用户名' },
                        { min: 2, max: 32, message: '用户名需 2–32 个字符' },
                      ]}
                    >
                      <Input size="large" prefix={<UserOutlined />} placeholder="用户名" autoComplete="username" />
                    </Form.Item>
                    <Form.Item
                      name="password"
                      rules={[
                        { required: true, message: '请输入密码' },
                        { min: 6, max: 64, message: '密码需 6–64 个字符' },
                      ]}
                    >
                      <Input.Password
                        size="large"
                        prefix={<LockOutlined />}
                        placeholder="密码（至少 6 位）"
                        autoComplete="new-password"
                      />
                    </Form.Item>
                    <Form.Item
                      name="confirm"
                      rules={[{ required: true, message: '请再次输入密码' }]}
                    >
                      <Input.Password
                        size="large"
                        prefix={<LockOutlined />}
                        placeholder="确认密码"
                        autoComplete="new-password"
                      />
                    </Form.Item>
                    <Button type="primary" size="large" block htmlType="submit" loading={loading}>
                      注册并登录
                    </Button>
                  </Form>
                ),
              },
            ]}
          />
        </Card>
      </motion.div>
    </div>
  )
}
