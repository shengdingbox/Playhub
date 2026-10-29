// PlayHub Web 前端构建配置（基于 Win-box 移植）
// renderer 在 frontend/ 根目录，shared 类型在项目根 shared/
import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';
import { dirname, resolve } from 'node:path';
import { fileURLToPath } from 'node:url';

const root = dirname(fileURLToPath(import.meta.url));

export default defineConfig({
  root,
  plugins: [react()],
  base: './',
  build: {
    // 输出到 Spring Boot 静态目录，由后端托管
    outDir: resolve(root, '../src/main/resources/static'),
    emptyOutDir: true,
    target: 'chrome130',
  },
  server: {
    port: 5173,
    strictPort: true,
    fs: { allow: [resolve(root, '..')] }, // 允许引用 ../shared
    proxy: {
      // 开发模式下把 /api 代理到本地后端
      '/api': { target: 'http://127.0.0.1:18080', changeOrigin: true },
    },
  },
});
