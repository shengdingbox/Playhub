import React, { useCallback, useEffect, useMemo, useState } from 'react'
import {
  Button, Card, Checkbox, Empty, Input, Modal, Popconfirm, Space, Table, Tabs, Tag, Typography, message,
} from 'antd'
import { CloudDownloadOutlined, DeleteOutlined, ImportOutlined, ReloadOutlined } from '@ant-design/icons'
import { motion } from 'framer-motion'
import { useStore } from '../stores/useStore'

const { Title, Text, Paragraph } = Typography
const { TextArea } = Input

const pageVariants = {
  initial: { opacity: 0, y: 16 },
  animate: { opacity: 1, y: 0, transition: { duration: 0.35, ease: [0.4, 0, 0.2, 1] } },
  exit: { opacity: 0, y: -8, transition: { duration: 0.2 } },
}

const TYPE_LABEL = {
  0: 'XML',
  1: 'JSON',
  3: 'JAR',
  4: '外链',
}

/**
 * 片源库页面。
 *
 * <p>片源是全局共享的：管理员导入并维护，所有用户可见；
 * 每个用户在这里勾选自己要用的片源（选择存到账号）。
 */
export default function SourcesView() {
  const sourceRows = useStore((s) => s.sourceRows)
  const isAdmin = useStore((s) => s.sourcesIsAdmin)
  const loadSources = useStore((s) => s.loadSources)
  const saveSourceSelection = useStore((s) => s.saveSourceSelection)
  const importSources = useStore((s) => s.importSources)
  const deleteSource = useStore((s) => s.deleteSource)
  const setSourceEnabled = useStore((s) => s.setSourceEnabled)

  const [checkedIds, setCheckedIds] = useState([])
  const [saving, setSaving] = useState(false)
  const [importOpen, setImportOpen] = useState(false)
  const [importing, setImporting] = useState(false)
  const [importTab, setImportTab] = useState('json')
  const [jsonText, setJsonText] = useState('')
  const [configUrl, setConfigUrl] = useState('')

  const syncChecked = useCallback((rows) => {
    setCheckedIds(rows.filter((r) => r.selected).map((r) => r.id))
  }, [])

  useEffect(() => {
    loadSources().then((res) => {
      if (res?.sources) syncChecked(res.sources)
    })
  }, [loadSources, syncChecked])

  const allChecked = useMemo(
    () => sourceRows.length > 0 && checkedIds.length === sourceRows.length,
    [sourceRows, checkedIds]
  )

  const handleSave = async () => {
    setSaving(true)
    try {
      // 全选等价于「不限制」，传空数组即可（后端视为全部启用）
      const ids = checkedIds.length === sourceRows.length ? [] : checkedIds
      await saveSourceSelection(ids)
      message.success('片源选择已保存')
    } catch (err) {
      message.error(err?.message || '保存失败')
    } finally {
      setSaving(false)
    }
  }

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

  const columns = [
    {
      title: '启用',
      dataIndex: 'selected',
      width: 64,
      render: (_, row) => (
        <Checkbox
          checked={checkedIds.includes(row.id)}
          onChange={(e) => {
            setCheckedIds((prev) =>
              e.target.checked ? [...new Set([...prev, row.id])] : prev.filter((x) => x !== row.id)
            )
          }}
        />
      ),
    },
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
    { title: 'api', dataIndex: 'api', ellipsis: true, width: 220 },
    {
      title: '类型',
      dataIndex: 'type',
      width: 80,
      render: (t) => <Tag color="blue">{TYPE_LABEL[t] || `type ${t}`}</Tag>,
    },
    {
      title: '能力',
      width: 150,
      render: (_, row) => (
        <Space size={4} wrap>
          {row.searchable ? <Tag color="green">搜索</Tag> : null}
          {row.quickSearch ? <Tag color="cyan">快速</Tag> : null}
          {row.filterable ? <Tag color="geekblue">筛选</Tag> : null}
        </Space>
      ),
    },
  ]

  if (isAdmin) {
    columns.push({
      title: '管理',
      width: 170,
      render: (_, row) => (
        <Space size={4}>
          <Button
            size="small"
            onClick={() => setSourceEnabled(row.id, !row.enabled)}
          >
            {row.enabled ? '停用' : '启用'}
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
    })
  }

  return (
    <motion.div
      variants={pageVariants}
      initial="initial"
      animate="animate"
      exit="exit"
      style={{ padding: 24, maxWidth: 1400, margin: '0 auto' }}
    >
      <Card
        style={{ borderRadius: 20, marginBottom: 24, border: '1px solid #f0f0f0' }}
        styles={{ body: { padding: '24px 28px' } }}
      >
        <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', flexWrap: 'wrap', gap: 12 }}>
          <div>
            <Title level={3} style={{ margin: 0, fontWeight: 700 }}>
              片源库
            </Title>
            <Text type="secondary">
              共 {sourceRows.length} 个片源，已勾选 {checkedIds.length} 个
              {isAdmin ? '（管理员可导入与维护）' : '（勾选后只使用选中的片源）'}
            </Text>
          </div>
          <Space wrap>
            <Button icon={<ReloadOutlined />} onClick={() => loadSources()}>
              刷新
            </Button>
            <Button
              onClick={() => {
                const all = sourceRows.map((r) => r.id)
                setCheckedIds(checkedIds.length === all.length ? [] : all)
              }}
            >
              {allChecked ? '全部取消' : '全选'}
            </Button>
            <Button type="primary" loading={saving} onClick={handleSave}>
              保存我的选择
            </Button>
            {isAdmin && (
              <Button type="primary" icon={<ImportOutlined />} onClick={() => setImportOpen(true)}>
                导入 TVBox 配置
              </Button>
            )}
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
                {isAdmin ? '点右上角「导入 TVBox 配置」，粘贴 JSON 或填配置地址' : '请联系管理员导入片源'}
              </Text>
            </span>
          }
          style={{ padding: '80px 0' }}
        />
      ) : (
        <Card style={{ borderRadius: 20, border: '1px solid #f0f0f0' }} styles={{ body: { padding: 8 } }}>
          <Table
            rowKey="id"
            size="middle"
            columns={columns}
            dataSource={sourceRows}
            pagination={{ pageSize: 20, showSizeChanger: true }}
          />
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
          导入会把配置里的 <Text code>sites</Text> 逐条解析进片源库；
          同样的片源重复导入只会更新，不会重复。
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
