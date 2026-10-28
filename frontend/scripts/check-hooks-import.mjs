/**
 * 构建前检查：React hooks 是否都已从 'react' 引入。
 *
 * <p>起因：HomeView 里用了 useMemo 但忘了加进 import，Vite 构建不会报错
 * （它只做打包，未定义变量是运行时报 ReferenceError），
 * 结果页面直接白屏。这个脚本在 build 之前把这类问题拦下来。
 *
 * 用法：npm run build 会自动先跑（prebuild）。
 */
import { readdir, readFile } from 'node:fs/promises'
import path from 'node:path'

const HOOKS = [
  'useState', 'useEffect', 'useMemo', 'useCallback', 'useRef',
  'useReducer', 'useContext', 'useLayoutEffect', 'useImperativeHandle', 'useTransition',
]

const SRC = path.join(process.cwd(), 'src')

async function walk(dir) {
  const files = []
  for (const entry of await readdir(dir, { withFileTypes: true })) {
    const full = path.join(dir, entry.name)
    if (entry.isDirectory()) {
      files.push(...(await walk(full)))
    } else if (/\.(jsx?|mjs)$/.test(entry.name)) {
      files.push(full)
    }
  }
  return files
}

const files = await walk(SRC)
const problems = []

for (const file of files) {
  const source = await readFile(file, 'utf8')
  // 收集所有从 react 引入的语句，合并判断（兼容 import React,{...} 与 import {...}）
  const reactImports = source
    .split('\n')
    .filter((line) => /from\s+['"]react['"]/.test(line))
    .join('\n')

  for (const hook of HOOKS) {
    const usedPattern = new RegExp(`\\b${hook}\\s*\\(`)
    if (!usedPattern.test(source)) continue
    const importedPattern = new RegExp(`\\b${hook}\\b`)
    if (!importedPattern.test(reactImports)) {
      problems.push({
        file: path.relative(process.cwd(), file),
        hook,
      })
    }
  }
}

if (problems.length > 0) {
  console.error('\n✗ React hooks 引入检查未通过：')
  for (const p of problems) {
    console.error(`  ${p.file}: 使用了 ${p.hook}，但没有从 'react' 引入`)
  }
  console.error(`\n共 ${problems.length} 处，已中止构建。\n`)
  process.exit(1)
}

console.log(`✓ React hooks 引入检查通过（扫描 ${files.length} 个文件）`)
