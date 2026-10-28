# jar2java 使用教程

`tvbox/` 目录自成一体：脚本、工具链、输入 jar、输出产物都在这里，不会往外部目录写任何文件。

```
tvbox/
├─ jar2java.py             一键流水线
├─ tools/                  去混淆 8 步 + jadx
│   ├─ collect_decoders.py / build_inline_map.py / deob_full.py
│   ├─ finalize_clean.py / remove_accessors.py / deflatten.py
│   ├─ fold_const_guard2.py / remove_junk.py / emulate_init.py
│   └─ jadx/bin/jadx.bat
├─ deflat/                 反平坦化、明文替换、规范化、统计
│   ├─ run.py / deflat.py / fmt.py / jutil.py / render.py
│   ├─ decrypt_all.py / normalize.py / scan_calls.py / resolve_all.py
│   └─ check_loss.py / verify.py / diag.py
├─ templates/utils/        规范化用的公共类模板（Crypto/Http/Proxy/Store/Strings）
├─ response.jar            样例：fty 加固
├─ mediahub-spider.jar     样例：普通 jar（Java 壳 + native 核心）
└─ decompiled/response/    全部产物
```

## 1. 快速开始

```bash
cd d:/dev-tmp/python/2.3/pydemo/tvbox
python jar2java.py mediahub-spider.jar     # 用指定 jar
python jar2java.py                         # 默认用同目录的 response.jar
```

产物固定落在 `tvbox/decompiled/response/`。

## 2. 脚本会先判断样本类型

| 样本特征 | 走哪些阶段 |
|---|---|
| 有 `assets/ftyshinidie.guard`（fty 加固） | 全链 1→10 |
| 普通 jar：只有 `classes.dex`，且有 `C0xxx` 混淆类 | 1、3、5、6、7、8、9、10（无 guard，跳过 so/外层 dex） |
| 普通 jar：无 `C0xxx`（源码本就干净） | 只做解包 + jadx，deob 及之后全部自动跳过 |
| 直接给 `.dex` | 跳过解包，当作内部 dex |

判断依据写在日志里，比如：

```
未发现混淆类（C0xxx），源码本就干净，跳过去混淆
没有 src_clean（去混淆被跳过），跳过反平坦化
```

## 3. 十个阶段

| # | 阶段 | 做什么 | 产物 / 校验 |
|---|---|---|---|
| 1 | `unpack` | 解 ZIP（自动建输出目录） | `classes.dex` + `assets/`，dex magic 校验 |
| 2 | `so` | Unicorn 仿真 `.datadiv_decode*`（`--so` 才跑） | `ghidra_v8/decrypted_strings.txt` |
| 3 | `unguard` | guard 逐字节 ^7 还原成 JAR；**普通 jar 则把 classes.dex 复制成 classes_inner.dex** | `classes_inner.dex`，CRC 校验 |
| 4 | `jadx-inner` | 反编译内部 dex | `src_inner/sources` |
| 5 | `jadx-outer` | 反编译外层壳 dex（无 guard 时跳过） | `src_outer/sources` |
| 6 | `deob` | 8 步去混淆（无 C0xxx 时跳过） | `src_clean/sources` |
| 7 | `deflat` | 数值状态机反平坦化 | `src_deflat/sources` |
| 8 | `decrypt` | `Cxxxx.mNN(fNNshort, off, len, key)` → 明文 | 就地替换 |
| 9 | `normalize` | 转发调用规范化；自动铺 `templates/utils` | 默认仅试点 `Appgz.java` |
| 10 | `report` | 调用点统计 + 分类覆盖 + 花括号平衡 | `deflat/_calls_all.txt` 等 |

`deob` 内部顺序：`collect_decoders` → `build_inline_map` → `deob_full` → `finalize_clean` → `remove_accessors` → `deflatten` → `fold_const_guard2` → `remove_junk`。

## 4. 常用命令

```bash
python jar2java.py --list                  # 看阶段
python jar2java.py xxx.jar --force         # 换了 jar，强制重跑 jadx
python jar2java.py --from deflat           # 复用已有中间产物
python jar2java.py --only report           # 只重算统计
python jar2java.py xxx.jar --so            # 额外仿真 SO 字符串
python jar2java.py --from normalize --normalize-all   # 规范化铺开整个 spider
python jar2java.py xxx.jar --log run.log   # 长任务写日志
```

`--from X` 跑 X 及其之后；`--only X` 只跑一个。

## 5. 产物

```
decompiled/response/
├─ classes.dex / classes_inner.jar / classes_inner.dex
├─ src_outer/sources/     外层壳类（fty 样本 73 个）
├─ src_inner/sources/     jadx 原始反编译（混淆态）
├─ src_clean/sources/     去混淆后
├─ src_deflat/sources/    反平坦化 + 规范化 → 最终方案
└─ deflat/                _calls_all.txt / _mapping_all.txt / _complex_all.txt
```

- 只想要能读的源码：`src_inner/sources`（普通 jar 到这里就够了）
- fty 样本的最终形态：`src_deflat/sources`（707 个爬虫相关类 + 6 个 utils）

**注意**：输出目录是固定的，跑另一个 jar 会覆盖上一个的结果。要同时保留两个样本，把 `tvbox/` 整个复制一份再跑。

## 6. 实测基线

fty 样本 `response.jar`（本机，`--force` 全链）：

| 项 | 数值 |
|---|---|
| 解包 | classes.dex 36,852 B + 3 个 assets |
| guard 还原 | 994,025 B → ^7 修正 13,512 字节 → classes_inner.dex 2,327,092 B |
| 去混淆 | 解码器 54 / 包装 1285 / 守卫折叠 529 / 垃圾行 86 / 死状态变量 52 |
| 反平坦化 | `files=707`，`remaining=3` |
| 明文替换 | 116 处 |
| 规范化 | Appgz 44 → 0 |
| 统计 | 837 种 7394 处，complex 1 种，花括号平衡 |
| 总耗时 | 165 s（jadx 首次约 +40 s） |

普通样本 `mediahub-spider.jar`：dex 32,436 B → 6 个 java（`MediaHub`/`Init`/`Credentials`/`NativeLoader`/`NativePins`/`QrDialog`），无混淆类，去混淆及之后全部跳过，用时约 25 s。它的核心逻辑在 native so（`NativeLoader.load` + `nativeCall`），Java 侧只是壳。

## 7. 故障排查

**jadx 闪退**：`.bat` 必须经 `cmd /c` 调用（脚本已处理）。

**删除目录报 FileNotFoundError**：本机 sitecustomize 把 `shutil.rmtree` 重定向成"移到回收站"，大目录会抛异常。脚本的 `force_rmtree` 改为先 `os.rename` 成 `*.trash`，绕开该 shim，残留目录手工删即可。

**看不到输出**：用 `--log run.log` 后台跑，再 `Get-Content run.log -Tail 20`。

**`collect_decoders.py` 报目录不存在**：该脚本只认 `spider/merge`、`parser`、`spider` 三个目录。遇到结构不同的样本（如只有 `spider`），改成 `os.walk(ROOT)` 遍历即可。

**花括号不平衡**（`App99` / `Hmys` / `Music` 等）：jadx 原始输出就少/多一个 `}`，这些文件上的折叠与反平坦化会部分跳过，属已知限制。

**normalize 没效果**：规则表与包名绑定，默认只处理试点 `Appgz.java`；全量用 `--normalize-all`，铺开前先按包复核规则。

## 8. 换新样本要改什么

1. 直接 `python jar2java.py new.jar`；只有 guard 打乱表不同才改 `FTY_TABLE`。
2. jadx 路径不同：改 `JADX_BAT`（默认 `tvbox/tools/jadx/bin/jadx.bat`）。
3. 类名前缀不是 `C0xxx`：改 `jar2java.py`（混淆类判定）与 `deflat/` 里相关正则。
4. 新的混淆 pattern：在 `deflat/resolve_all.py` 补一条 regex + 一个 kind，再 `--only report` 看覆盖率。
