import React, { useMemo, useRef, useState } from 'react'
import {
  Button, Card, Checkbox, Divider, Form, Input, Modal, Select, Space, Switch,
  Typography, message,
} from 'antd'
import {
  CheckCircleOutlined, CloseCircleOutlined, DownloadOutlined, LoadingOutlined,
  RobotOutlined, SearchOutlined, UploadOutlined, VideoCameraOutlined,
} from '@ant-design/icons'
import { motion } from 'framer-motion'
import { useStore } from '../stores/useStore'

const { Text, Title, Paragraph } = Typography

const pageVariants = {
  initial: { opacity: 0, y: 16 },
  animate: { opacity: 1, y: 0, transition: { duration: 0.35, ease: [0.4, 0, 0.2, 1] } },
  exit: { opacity: 0, y: -8, transition: { duration: 0.2 } },
}

/**
 * 设置页（仅管理员可见）。
 *
 * <p>已从抽屉改为独立页面。原来的「数据源配置 / 配置地址」区块已移除——
 * 片源现在统一从「片源库」导入与选择，不再需要手动填配置地址。
 */
export default function SettingsView() {
  const store = useStore()
  const [aiTesting, setAiTesting] = useState(false)
  const [aiTestResult, setAiTestResult] = useState(null)
  const [exportOpen, setExportOpen] = useState(false)
  const [importOpen, setImportOpen] = useState(false)
  const [exportPassword, setExportPassword] = useState('')
  const [importPassword, setImportPassword] = useState('')
  const [importData, setImportData] = useState('')
  const fileInputRef = useRef(null)

  const searchableSources = useMemo(
    () => (store.sources || []).filter((s) => s.searchable !== 0),
    [store.sources],
  )

  const handleTestAi = async () => {
    const { aiUrl, aiKey, aiModel } = store.settings
    if (!aiUrl || !aiKey) {
      message.warning('请先填写 AI 接口地址和 API Key')
      return
    }
    setAiTesting(true)
    setAiTestResult(null)
    try {
      const res = await fetch(`${aiUrl}/v1/chat/completions`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json', Authorization: `Bearer ${aiKey}` },
        body: JSON.stringify({
          model: aiModel || 'gpt-4o-mini',
          messages: [{ role: 'user', content: '回复"OK"' }],
          max_tokens: 10,
        }),
      })
      if (!res.ok) throw new Error(`HTTP ${res.status}`)
      const data = await res.json()
      if (data.choices?.[0]?.message?.content) {
        setAiTestResult({ ok: true, model: data.model || aiModel })
      } else {
        setAiTestResult({ ok: false, error: '返回格式异常' })
      }
    } catch (err) {
      setAiTestResult({ ok: false, error: err.message })
    } finally {
      setAiTesting(false)
    }
  }

  const encryptData = (data, password) => {
    const jsonStr = JSON.stringify(data)
    const encoded = btoa(unescape(encodeURIComponent(jsonStr)))
    if (!password) return encoded
    let result = ''
    for (let i = 0; i < encoded.length; i++) {
      result += String.fromCharCode(encoded.charCodeAt(i) ^ password.charCodeAt(i % password.length))
    }
    return btoa(result)
  }

  const decryptData = (encrypted, password) => {
    try {
      if (!password) {
        return JSON.parse(decodeURIComponent(escape(atob(encrypted))))
      }
      const decoded = atob(encrypted)
      let result = ''
      for (let i = 0; i < decoded.length; i++) {
        result += String.fromCharCode(decoded.charCodeAt(i) ^ password.charCodeAt(i % password.length))
      }
      return JSON.parse(decodeURIComponent(escape(atob(result))))
    } catch {
      throw new Error('解密失败，密码可能不正确')
    }
  }

  const handleExport = () => {
    if (!exportPassword) {
      message.warning('请设置配置密码')
      return
    }
    // 数据源已迁到片源库，这里只导出本地设置与历史
    const configData = {
      settings: store.settings,
      searchHistory: store.searchHistory,
    }
    const encrypted = encryptData(configData, exportPassword)
    const blob = new Blob([encrypted], { type: 'text/plain' })
    const url = URL.createObjectURL(blob)
    const a = document.createElement('a')
    a.href = url
    a.download = `playhub-settings-${Date.now()}.txt`
    a.click()
    URL.revokeObjectURL(url)
    message.success('设置已导出')
    setExportOpen(false)
    setExportPassword('')
  }

  const handleImport = () => {
    if (!importData.trim()) {
      message.warning('请粘贴配置数据')
      return
    }
    if (!importPassword) {
      message.warning('请输入配置密码')
      return
    }
    try {
      const configData = decryptData(importData.trim(), importPassword)
      if (configData.settings) {
        store.updateSettings(configData.settings)
      }
      message.success('设置导入成功')
      setImportOpen(false)
      setImportPassword('')
      setImportData('')
    } catch (err) {
      message.error(err.message || '导入失败')
    }
  }

  const handleFileImport = (e) => {
    const file = e.target.files[0]
    if (!file) return
    const reader = new FileReader()
    reader.onload = (ev) => setImportData(ev.target.result)
    reader.readAsText(file)
    e.target.value = ''
  }

  const sectionCard = (icon, title, extra, children) => (
    <Card
      style={{ borderRadius: 18, marginBottom: 20, border: '1px solid #f0f0f0' }}
      styles={{ body: { padding: '22px 26px' } }}
    >
      <Title level={5} style={{ marginTop: 0, marginBottom: 18, display: 'flex', alignItems: 'center', gap: 8 }}>
        {icon}
        {title}
        {extra}
      </Title>
      {children}
    </Card>
  )

  return (
    <motion.div
      variants={pageVariants}
      initial="initial"
      animate="animate"
      exit="exit"
      style={{ padding: 24, maxWidth: 920, margin: '0 auto' }}
    >
      {sectionCard(
        <SearchOutlined style={{ color: '#1677ff' }} />,
        '搜索设置',
        null,
        <Form layout="vertical">
          <Form.Item label="搜索范围" style={{ marginBottom: 12 }}>
            <Select
              value={store.settings.searchScope}
              onChange={(v) => store.updateSettings({ searchScope: v })}
              options={[
                { label: '全部源', value: 'all' },
                { label: '当前源', value: 'current' },
                { label: '自选源（可多选）', value: 'custom' },
              ]}
            />
          </Form.Item>
          {store.settings.searchScope === 'custom' && (
            <Form.Item
              label={`选择搜索源（已选 ${(store.settings.searchSourceUids || []).length} / ${searchableSources.length}）`}
            >
              <Space style={{ marginBottom: 8 }} wrap>
                <Button
                  size="small"
                  onClick={() =>
                    store.updateSettings({ searchSourceUids: searchableSources.map((s) => s.uid) })
                  }
                >
                  全选
                </Button>
                <Button size="small" onClick={() => store.updateSettings({ searchSourceUids: [] })}>
                  清空
                </Button>
              </Space>
              {searchableSources.length === 0 ? (
                <Text type="secondary" style={{ fontSize: 12 }}>
                  当前没有可搜索的片源，请先到「片源」页导入并勾选
                </Text>
              ) : (
                <Checkbox.Group
                  style={{ display: 'flex', flexDirection: 'column', gap: 6 }}
                  value={store.settings.searchSourceUids || []}
                  onChange={(values) => store.updateSettings({ searchSourceUids: values })}
                  options={searchableSources.map((s) => ({ label: s.name || s.uid, value: s.uid }))}
                />
              )}
              <Text type="secondary" style={{ fontSize: 12, display: 'block', marginTop: 8 }}>
                未勾选任何源时，将自动搜索全部源
              </Text>
            </Form.Item>
          )}
        </Form>
      )}

      {sectionCard(
        <RobotOutlined style={{ color: '#722ed1' }} />,
        'AI 增强',
        null,
        <Form layout="vertical">
          <Form.Item label="启用 AI 增强" style={{ marginBottom: store.settings.aiEnabled ? 16 : 0 }}>
            <Switch
              checked={store.settings.aiEnabled}
              onChange={(v) => store.updateSettings({ aiEnabled: v })}
            />
            <Text type="secondary" style={{ marginLeft: 12, fontSize: 13 }}>
              用 AI 清洗播放地址、聚合多源信息
            </Text>
          </Form.Item>
          {store.settings.aiEnabled && (
            <>
              <Form.Item label="AI 接口地址">
                <Input
                  placeholder="如: https://api.openai.com"
                  value={store.settings.aiUrl}
                  onChange={(e) => store.updateSettings({ aiUrl: e.target.value })}
                />
                <Text type="secondary" style={{ fontSize: 12 }}>
                  仅支持 OpenAI completions 模式，填 baseURL，域名后不加 /
                </Text>
              </Form.Item>
              <Form.Item label="模型 ID">
                <Input
                  placeholder="如: gpt-4o-mini, deepseek-chat"
                  value={store.settings.aiModel}
                  onChange={(e) => store.updateSettings({ aiModel: e.target.value })}
                />
              </Form.Item>
              <Form.Item label="API Key">
                <Input.Password
                  placeholder="sk-..."
                  value={store.settings.aiKey}
                  onChange={(e) => store.updateSettings({ aiKey: e.target.value })}
                />
              </Form.Item>
              <Form.Item style={{ marginBottom: 0 }}>
                <Space>
                  <Button
                    icon={aiTesting ? <LoadingOutlined /> : undefined}
                    loading={aiTesting}
                    onClick={handleTestAi}
                  >
                    测试连接
                  </Button>
                  {aiTestResult &&
                    (aiTestResult.ok ? (
                      <Text style={{ color: '#52c41a', fontSize: 13 }}>
                        <CheckCircleOutlined style={{ marginRight: 4 }} />
                        连接成功 {aiTestResult.model && `(${aiTestResult.model})`}
                      </Text>
                    ) : (
                      <Text style={{ color: '#ff4d4f', fontSize: 13 }}>
                        <CloseCircleOutlined style={{ marginRight: 4 }} />
                        {aiTestResult.error}
                      </Text>
                    ))}
                </Space>
              </Form.Item>
            </>
          )}
        </Form>
      )}

      {sectionCard(
        <VideoCameraOutlined style={{ color: '#fa8c16' }} />,
        '直播设置',
        null,
        <Form layout="vertical">
          <Form.Item label="直播源地址" style={{ marginBottom: 12 }}>
            <Input
              placeholder="输入 M3U 直播源地址"
              value={store.settings.liveSourceUrl}
              onChange={(e) => store.updateSettings({ liveSourceUrl: e.target.value })}
            />
          </Form.Item>
          <Form.Item label="EPG 地址 (可选)" style={{ marginBottom: 0 }}>
            <Input
              placeholder="输入 EPG XML 地址"
              value={store.settings.liveEpgUrl}
              onChange={(e) => store.updateSettings({ liveEpgUrl: e.target.value })}
            />
          </Form.Item>
        </Form>
      )}

      {sectionCard(
        <DownloadOutlined style={{ color: '#13c2c2' }} />,
        '设置备份',
        null,
        <>
          <Paragraph type="secondary" style={{ fontSize: 13, marginTop: 0 }}>
            导出 / 导入本机的搜索、AI、直播设置（片源由服务端片源库统一管理，不包含在备份里）。
          </Paragraph>
          <Space wrap>
            <Button icon={<DownloadOutlined />} onClick={() => setExportOpen(true)}>
              导出设置
            </Button>
            <Button icon={<UploadOutlined />} onClick={() => setImportOpen(true)}>
              导入设置
            </Button>
          </Space>
        </>
      )}

      <Modal
        title="导出设置"
        open={exportOpen}
        onCancel={() => setExportOpen(false)}
        onOk={handleExport}
        okText="导出"
        cancelText="取消"
      >
        <Form layout="vertical">
          <Form.Item label="设置密码" required>
            <Input.Password
              placeholder="设置密码用于加密导出的配置"
              value={exportPassword}
              onChange={(e) => setExportPassword(e.target.value)}
            />
          </Form.Item>
        </Form>
      </Modal>

      <Modal
        title="导入设置"
        open={importOpen}
        onCancel={() => setImportOpen(false)}
        onOk={handleImport}
        okText="导入"
        cancelText="取消"
        width={640}
      >
        <Form layout="vertical">
          <Form.Item label="设置密码" required>
            <Input.Password
              placeholder="输入导出时设置的密码"
              value={importPassword}
              onChange={(e) => setImportPassword(e.target.value)}
            />
          </Form.Item>
          <Form.Item label="配置数据">
            <Input.TextArea
              rows={6}
              placeholder="粘贴配置数据，或点击下方按钮导入文件"
              value={importData}
              onChange={(e) => setImportData(e.target.value)}
            />
            <Space style={{ marginTop: 8 }}>
              <Button size="small" onClick={() => fileInputRef.current?.click()}>
                选择文件
              </Button>
              <input
                ref={fileInputRef}
                type="file"
                accept=".txt,.json"
                style={{ display: 'none' }}
                onChange={handleFileImport}
              />
            </Space>
          </Form.Item>
        </Form>
      </Modal>
    </motion.div>
  )
}
