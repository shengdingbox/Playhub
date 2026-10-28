import React, { useCallback, useEffect, useMemo, useState } from 'react'
import {
  Button, Card, Empty, Input, Modal, Popconfirm, Space, Table, Tabs, Tag, Typography, message,
} from 'antd'
import {
  CloudDownloadOutlined, DeleteOutlined, ImportOutlined, PlayCircleOutlined,
  ReloadOutlined, VideoCameraOutlined,
} from '@ant-design/icons'
import { motion } from 'framer-motion'
import { useStore } from '../stores/useStore'

const { Title, Text, Paragraph } = Typography
const { TextArea } = Input

const pageVariants = {
  initial: { opacity: 0, y: 16 },
  animate: { opacity: 1, y: 0, transition: { duration: 0.35, ease: [0.4, 0, 0.2, 1] } },
  exit: { opacity: 0, y: -8, transition: { duration: 0.2 } },
}

const TYPE_LABEL = { 0: 'XML', 1: 'JSON', 3: 'JAR', 4: '外链' }

/**
 * 片源库管理页（仅管理员）。
 *
 * <p>片源是管理员专属功能：在这里导入、分类、启用/停用、删除。
 * 普通用户不接触本页，登录后直接使用启用中的片源。
 *
 * <p>按内容分为两类：<b>影视源</b>（vod）与<b>直播源</b>（live），
 * 导入时按名称关键词自动归类，管理员也可手动调整。
 */
export default function SourcesView() {
  const sourceRows = useStore((s) => s.sourceRows)
  const loadSources = useStore((s) => s.loadSources)
  const importSources = useStore((s) => s.importSources)
  const deleteSource = useStore((s) => s.deleteSource)
  const setSourceEnabled = useStore((s) => s.setSourceEnabled)
  const setSourceKind = useStore((s) => s.setSourceKind)

  const [kindTab, setKindTab] = useState('vod')
  const [importOpen, setImportOpen] = useState(false)
  const [importing, setImporting] = useState(false)
  const [importTab, setImportTab] = useState('json')
  const [jsonText, setJsonText] = useState('')
  const [configUrl, setConfigUrl] = useState('')

  useEffect(() => {
    loadSources()
  }, [loadSources])

  const vodRows = useMemo(() => sourceRows.filter((r) => r.kind !== 'live'), [sourceRows])
  const liveRows = useMemo(() => sourceRows.filter((r) => r.kind === 'live'), [sourceRows])
  const visibleRows = kindTab === 'live' ? liveRows : vodRows
  const enabledCount = useMemo(() => sourceRows.filter((r) => r.enabled).length, [sourceRows])

  const handleImport = async () => {
    setImporting(true)
    try {
      const payload = importTab === 'json' ? { json: jsonText } : { url: configUrl }
      const res = await importSources(payload)
      message.success(`导入完成：新增 ${res.inserted}，更新 ${res.updated}，跳过 ${res.skipped}`)
      setImportOpen(false)
      setJsonText('')
      setConfigUrl('')
    } catch (err) {
      message.error(err?.message || '导入失败')
    } finally {
      setImporting(false)
    }
  }

  const toggleKind = useCallback(
    async (row) => {
      const next = row.kind === 'live' ? 'vod' : 'live'
      try {
        await setSourceKind(row.id, next)
        message.success(`已改为${next === 'live' ? '直播源' : '影视源'}`)
      } catch (err) {
        message.error(err?.message || '修改分类失败')
      }
    },
    [setSourceKind]
  )

  const columns = [
    {
      title: '片源名称',
      dataIndex: 'name',
      ellipsis: true,
      render: (name, row) => (
        <Space size={6}>
          <Text strong>{name || '(未命名)'}</Text>
          {!row.enabled && <Tag color="default">已停用</Tag>}
        </Space>
      ),
    },
    { title: 'api', dataIndex: 'api', ellipsis: true, width: 210 },
    {
      title: '类型',
      dataIndex: 'type',
      width: 76,
      render: (t) => <Tag color="blue">{TYPE_LABEL[t] || `type ${t}`}</Tag>,
    },
    {
      title: '能力',
      width: 140,
      render: (_, row) => (
        <Space size={4} wrap>
          {row.searchable ? <Tag color="green">搜索</Tag> : null}
          {row.quickSearch ? <Tag color="cyan">快速</Tag> : null}
          {row.filterable ? <Tag color="geekblue">筛选</Tag> : null}
        </Space>
      ),
    },
    {
      title: '操作',
      width: 250,
      render: (_, row) => (
        <Space size={4} wrap>
          <Button size="small" onClick={() => setSourceEnabled(row.id, !row.enabled)}>
            {row.enabled ? '停用' : '启用'}
          </Button>
          <Button size="small" onClick={() => toggleKind(row)}>
            {row.kind === 'live' ? '设为影视源' : '设为直播源'}
          </Button>
          <Popconfirm
            title="删除该片源？"
            onConfirm={() => deleteSource(row.id)}
            okText="删除"
            cancelText="取消"
          >
            <Button size="small" danger icon={<DeleteOutlined />} />
          </Popconfirm>
        </Space>
      ),
    },
  ]

  return (
    <motion.div
      variants={pageVariants}
      initial="initial"
      animate="animate"
      exit="exit"
      style={{ padding: 24, maxWidth: 1400, margin: '0 auto' }}
    >
      <Card
        style={{ borderRadius: 20, marginBottom: 20, border: '1px solid #f0f0f0' }}
        styles={{ body: { padding: '24px 28px' } }}
      >
        <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', flexWrap: 'wrap', gap: 12 }}>
          <div>
            <Title level={3} style={{ margin: 0, fontWeight: 700 }}>
              片源库
            </Title>
            <Text type="secondary">
              影视源 {vodRows.length} 个 · 直播源 {liveRows.length} 个 · 启用中 {enabledCount} 个
              （仅管理员可维护，普通用户直接使用启用中的片源）
            </Text>
          </div>
          <Space wrap>
            <Button icon={<ReloadOutlined />} onClick={() => loadSources()}>
              刷新
            </Button>
            <Button type="primary" icon={<ImportOutlined />} onClick={() => setImportOpen(true)}>
              导入 TVBox 配置
            </Button>
          </Space>
        </div>
      </Card>

      {sourceRows.length === 0 ? (
        <Empty
          description={
            <span>
              片源库还是空的
              <br />
              <Text type="secondary" style={{ fontSize: 13 }}>
                点右上角「导入 TVBox 配置」，粘贴 JSON 或填配置地址
              </Text>
            </span>
          }
          style={{ padding: '80px 0' }}
        >
          <Button type="primary" icon={<ImportOutlined />} onClick={() => setImportOpen(true)}>
            导入片源
          </Button>
        </Empty>
      ) : (
        <Card style={{ borderRadius: 20, border: '1px solid #f0f0f0' }} styles={{ body: { padding: '8px 8px 16px' } }}>
          <Tabs
            activeKey={kindTab}
            onChange={setKindTab}
            style={{ paddingInline: 12 }}
            items={[
              {
                key: 'vod',
                label: (
                  <Space size={6}>
                    <PlayCircleOutlined />
                    影视源
                    <Tag color="green">{vodRows.length}</Tag>
                  </Space>
                ),
              },
              {
                key: 'live',
                label: (
                  <Space size={6}>
                    <VideoCameraOutlined />
                    直播源
                    <Tag color="orange">{liveRows.length}</Tag>
                  </Space>
                ),
              },
            ]}
          />
          {visibleRows.length === 0 ? (
            <Empty description={kindTab === 'live' ? '暂无直播源' : '暂无影视源'} style={{ padding: '60px 0' }} />
          ) : (
            <Table
              rowKey="id"
              size="middle"
              columns={columns}
              dataSource={visibleRows}
              pagination={{ pageSize: 20, showSizeChanger: true }}
            />
          )}
        </Card>
      )}

      <Modal
        title="导入 TVBox 片源"
        open={importOpen}
        onCancel={() => setImportOpen(false)}
        onOk={handleImport}
        confirmLoading={importing}
        okText="开始导入"
        cancelText="取消"
        width={720}
      >
        <Paragraph type="secondary" style={{ fontSize: 13 }}>
          导入会把配置里的 <Text code>sites</Text> 逐条解析进片源库，并按名称自动区分
          <Text strong>影视源</Text> / <Text strong>直播源</Text>；相同的片源重复导入只会更新。
        </Paragraph>
        <Tabs
          activeKey={importTab}
          onChange={setImportTab}
          items={[
            {
              key: 'json',
              label: '粘贴 JSON',
              children: (
                <TextArea
                  value={jsonText}
                  onChange={(e) => setJsonText(e.target.value)}
                  placeholder='把 TVBox 配置 JSON 整段粘贴到这里，例如 {"sites":[{"name":"...","api":"csp_..."}]}'
                  autoSize={{ minRows: 10, maxRows: 18 }}
                  style={{ fontFamily: 'monospace', fontSize: 12 }}
                />
              ),
            },
            {
              key: 'url',
              label: '配置地址',
              children: (
                <Space direction="vertical" style={{ width: '100%' }}>
                  <Input
                    value={configUrl}
                    onChange={(e) => setConfigUrl(e.target.value)}
                    placeholder="https://example.com/tvbox/source.json"
                    prefix={<CloudDownloadOutlined />}
                    allowClear
                  />
                  <Text type="secondary" style={{ fontSize: 12 }}>
                    由服务器下载并解析该地址，适合直接同步别人的配置。
                  </Text>
                </Space>
              ),
            },
          ]}
        />
      </Modal>
    </motion.div>
  )
}
