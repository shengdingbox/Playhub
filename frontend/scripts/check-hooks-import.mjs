/**
 * 构建前检查：React hooks 是否都已从 'react' 引入。
 * （同时扫描 .ts/.tsx/.js/.jsx，兼容 Win-box 移植代码）
 */
import { readdir, readFile } from 'node:fs/promises'
import path from 'node:path'

const HOOKS = [
  'useState', 'useEffect', 'useMemo', 'useCallback', 'useRef',
  'useReducer', 'useContext', 'useLayoutEffect', 'useImperativeHandle', 'useTransition',
]

const SRC = process.cwd()

async function walk(dir, out = []) {
  for (const entry of await readdir(dir, { withFileTypes: true })) {
    const full = path.join(dir, entry.name)
    if (entry.isDirectory()) {
      if (entry.name === 'node_modules' || entry.name === 'dist') continue
      await walk(full, out)
    } else if (/\.(tsx?|jsx?|mjs)$/.test(entry.name)) {
      out.push(full)
    }
  }
  return out
}

const files = await walk(SRC)
const problems = []

for (const file of files) {
  const source = await readFile(file, 'utf8')
  const reactImports = source
    .split('\n')
    .filter((line) => /from\s+['"]react['"]/.test(line))
    .join('\n')
  for (const hook of HOOKS) {
    if (!new RegExp(`\\b${hook}\\s*\\(`).test(source)) continue
    if (!new RegExp(`\\b${hook}\\b`).test(reactImports)) {
      problems.push({ file: path.relative(SRC, file), hook })
    }
  }
}

if (problems.length > 0) {
  console.error('\n✗ React hooks 引入检查未通过：')
  for (const p of problems) console.error(`  ${p.file}: 使用了 ${p.hook}，但没有从 'react' 引入`)
  process.exit(1)
}
console.log(`✓ React hooks 引入检查通过（扫描 ${files.length} 个文件）`)
