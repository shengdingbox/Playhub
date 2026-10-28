#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""jar → dex → (guard/so) → java 一键流水线。

完整链路（fty 体系，实测样本 tvbox/response.jar）：

  ①  response.jar                     ZIP：classes.dex + assets/ftyguard_v*.so + assets/ftyshinidie.guard
  ②  外层 dex (classes.dex)            60 个 Guard 空壳类
  ③  ftyshinidie.guard               被"点状打乱"的完整 JAR：
                                      每个字节 b，若 b ∈ {0x01,0x02,0x05,0x06} 则 b ^= 0x07（自逆，无密钥）
                                      ——这就是 native so 的 getLoader 唯一做的事，静态即可还原
  ④  内部 dex (classes_inner.dex)     707 个 java / 67 个真爬虫（字符串 XOR 表 + 薄包装 + 控制流平坦化）
  ⑤  jadx                             反编译成 java（src_outer / src_inner）
  ⑥  tools/ 去混淆链                  字符串内联 → 包装内联 → 字符串状态机 → 常量守卫折叠 → 垃圾清理
  ⑦  deflat/ 数值状态机反平坦化       while(true){i^=K; switch(i){...}} → 顺序/分支/循环
  ⑧  decrypt_all / normalize          XOR 解码调用 → 明文；Cxxxx.mNN 转发 → 语义调用
  ⑨  resolve_all                     调用点统计与分类覆盖率

SO 的角色（本例已完全解出，故默认跳过）：
  .init_array 三个 .datadiv_decode* 负责解密字符串（Unicorn 仿真可 dump 明文）；
  JNI getLoader 读取 guard → 4 条 strb 做 ^7 修正 → DexClassLoader 加载内部 dex。
  算法已知后就不再需要仿真，`--so` 仅用于复核/新样本探路。

用法:
    python jar2java.py                        # 处理 tvbox/response.jar（默认）
    python jar2java.py path/to/response.jar   # 处理指定 jar
    python jar2java.py --list                 # 列出全部阶段
    python jar2java.py --from deob            # 从某阶段开始（复用已有产物）
    python jar2java.py --only report          # 只跑一个阶段
    python jar2java.py --force                # 重跑 jadx（覆盖已有输出目录）
    python jar2java.py --so                   # 额外跑 SO 字符串解码（tools/emulate_init.py）
    python jar2java.py path/to/x.dex          # 输入直接是 dex 时跳过解包，当作内部 dex

环境: Python 3.10+；jdk8+（jadx 需要）；jadx 位于 tools/jadx/bin/jadx.bat。
"""
import argparse
import collections
import os
import re
import shutil
import subprocess
import sys
import time
import zipfile

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

ROOT = os.path.dirname(os.path.abspath(__file__))
RESP = os.path.join(ROOT, 'decompiled', 'response')
INNER_SRC = os.path.join(RESP, 'src_inner', 'sources')
OUTER_SRC = os.path.join(RESP, 'src_outer', 'sources')
CLEAN_SRC = os.path.join(RESP, 'src_clean', 'sources')
DEFLAT_SRC = os.path.join(RESP, 'src_deflat', 'sources')
TOOLS = os.path.join(ROOT, 'tools')
DEFLAT_DIR = os.path.join(ROOT, 'deflat')
JADX_BAT = os.path.join(TOOLS, 'jadx', 'bin', 'jadx.bat')
GUARD = os.path.join(RESP, 'assets', 'ftyshinidie.guard')
INNER_DEX = os.path.join(RESP, 'classes_inner.dex')
PY = sys.executable

# guard 的点状打乱表：命中则 ^7（自逆：加密与解密是同一个操作）
FTY_TABLE = frozenset((0x01, 0x02, 0x05, 0x06))

STAGES = [
    ('unpack',     '解包 jar → classes*.dex + assets/'),
    ('so',         'SO 字符串解码（Unicorn 仿真 .datadiv_decode*，可选）'),
    ('unguard',    'ftyfix 修复 ftyshinidie.guard → classes_inner.dex'),
    ('jadx-inner', 'jadx 反编译内部 dex → src_inner/sources'),
    ('jadx-outer', 'jadx 反编译外层 dex → src_outer/sources'),
    ('deob',       '去混淆链：字符串/包装内联 → 状态机 → 常量折叠 → 垃圾清理'),
    ('deflat',     '数值状态机反平坦化 → src_deflat/sources'),
    ('decrypt',    'short[] XOR 解码调用 → 明文字面量'),
    ('normalize',  'Cxxxx.mNN 转发调用规范化 + 常量折叠 + 死变量清理'),
    ('report',     '调用点统计 + 分类覆盖率 → _calls_all.txt / _mapping_all.txt'),
]
STAGE_FUNCS = {}


def stage(name):
    def deco(fn):
        STAGE_FUNCS[name] = fn
        return fn

    return deco


# ---------------------------------------------------------------- 基础工具

LOG_FP = None


def log(msg=''):
    print(msg, flush=True)
    if LOG_FP:
        LOG_FP.write(msg + '\n')
        LOG_FP.flush()


def run(cmd, cwd=ROOT, timeout=None, quiet=False):
    """流式执行外部命令；失败抛异常并带最后若干行输出。"""
    log('    $ ' + ' '.join(cmd))
    t0 = time.time()
    p = subprocess.Popen(cmd, cwd=cwd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT,
                         text=True, encoding='utf-8', errors='replace', bufsize=1)
    keep = collections.deque(maxlen=30)
    for line in p.stdout:
        line = line.rstrip()
        if not line.strip():
            continue
        keep.append(line)
        if not quiet:
            log('    | ' + line[:180])
    p.wait()
    dt = time.time() - t0
    if quiet:
        for line in list(keep)[-8:]:
            log('    | ' + line[:180])
    if p.returncode != 0:
        raise RuntimeError('命令失败 (rc=%d): %s\n%s'
                           % (p.returncode, ' '.join(cmd), '\n'.join(list(keep)[-15:])))
    return dt


def java_files(root):
    if not os.path.isdir(root):
        return []
    out = []
    for dp, _d, fs in os.walk(root):
        for f in fs:
            if f.endswith('.java'):
                out.append(os.path.join(dp, f))
    return out


def count_java(root):
    return len(java_files(root))


def count_lines(root):
    n = 0
    for p in java_files(root):
        try:
            with open(p, encoding='utf-8', errors='replace') as fh:
                n += sum(1 for _ in fh)
        except OSError:
            pass
    return n


def grep_count(root, pattern, limit=None):
    """统计目录下匹配总数；limit 用于提前返回。"""
    pat = re.compile(pattern)
    n = 0
    for p in java_files(root):
        try:
            with open(p, encoding='utf-8', errors='replace') as fh:
                n += len(pat.findall(fh.read()))
        except OSError:
            continue
        if limit is not None and n >= limit:
            return n
    return n


def strip_literals(src):
    """去掉字符串/字符字面量与注释，供括号平衡统计。"""
    out = []
    i = 0
    n = len(src)
    while i < n:
        c = src[i]
        if c in '"\'':
            q = c
            i += 1
            while i < n:
                if src[i] == '\\':
                    i += 2
                    continue
                if src[i] == q:
                    i += 1
                    break
                i += 1
            continue
        if c == '/' and i + 1 < n and src[i + 1] == '/':
            j = src.find('\n', i)
            i = n if j < 0 else j
            continue
        if c == '/' and i + 1 < n and src[i + 1] == '*':
            j = src.find('*/', i + 2)
            i = n if j < 0 else j + 2
            continue
        out.append(c)
        i += 1
    return ''.join(out)


def unbalanced(root):
    """返回花括号不平衡的文件名列表。"""
    bad = []
    for p in java_files(root):
        try:
            with open(p, encoding='utf-8', errors='replace') as fh:
                s = strip_literals(fh.read())
        except OSError:
            continue
        if s.count('{') != s.count('}'):
            bad.append(os.path.basename(p))
    return bad


def require(path, hint):
    if not os.path.exists(path):
        raise RuntimeError('缺少 %s，请先运行阶段: %s' % (path, hint))


def ftyfix(data):
    """ftyguard 自逆还原：命中 {1,2,5,6} 的字节异或 7。"""
    return bytes((c ^ 0x07) if c in FTY_TABLE else c for c in data)


def force_rmtree(path):
    """让目录消失（删除失败时改名挪走）。

    本机 IDE 的 sitecustomize 把 shutil.rmtree 重定向成"移到回收站"，大目录上会抛
    FileNotFoundError；逐文件 os.remove 又被同一 shim 拖慢到 ~1.5 s/文件。
    所以：rmtree 尽力而为，删不掉就 rename 成 *.trash（瞬时且必定成功），
    保证后续脚本"目录不存在就跳过 rmtree"的判断成立。
    """
    if not os.path.isdir(path):
        return
    # 先改名：瞬时且必定成功，之后原路径就"不存在"了；.trash 可随时手工删
    trash = path + '.trash'
    n = 0
    while os.path.exists(trash):
        n += 1
        trash = '%s.trash%d' % (path, n)
    try:
        os.rename(path, trash)
        return
    except OSError:
        pass
    try:
        shutil.rmtree(path, ignore_errors=True)
    except Exception:
        pass


def fresh_dir(path, force):
    """force 时清空重建；返回目录是否可用。"""
    if os.path.isdir(path) and os.listdir(path):
        if not force:
            return False
        force_rmtree(path)
    os.makedirs(path, exist_ok=True)
    return True


# ---------------------------------------------------------------- 阶段实现

@stage('unpack')
def stage_unpack(ctx):
    jar = ctx.jar
    require(jar, '(输入文件不存在)')
    os.makedirs(RESP, exist_ok=True)
    if jar.lower().endswith('.dex'):
        dst = INNER_DEX
        shutil.copy2(jar, dst)
        log('    输入是 dex，直接复制到 %s' % dst)
        return

    with zipfile.ZipFile(jar) as z:
        names = z.namelist()
        dexes = [n for n in names if re.match(r'^classes\d*\.dex$', n)]
        assets = [n for n in names if n.startswith('assets/')]
        log('    条目 %d 个：dex %s，assets %d 个' % (len(names), dexes or '无', len(assets)))
        if not dexes:
            raise RuntimeError('jar 内没有 classes*.dex')
        for n in dexes:
            dst = os.path.join(RESP, n)
            with z.open(n) as src, open(dst, 'wb') as out:
                shutil.copyfileobj(src, out)
            log('    -> %s (%d B)' % (n, os.path.getsize(dst)))
        for n in assets:
            dst = os.path.join(RESP, n.replace('/', os.sep))
            os.makedirs(os.path.dirname(dst), exist_ok=True)
            with z.open(n) as src, open(dst, 'wb') as out:
                shutil.copyfileobj(src, out)
            log('    -> %s (%d B)' % (n, os.path.getsize(dst)))

    for n in dexes:
        with open(os.path.join(RESP, n), 'rb') as fh:
            magic = fh.read(8)
        if not magic.startswith(b'dex\n'):
            raise RuntimeError('%s magic 不是 dex（%r）' % (n, magic))


@stage('so')
def stage_so(ctx):
    if not ctx.so:
        log('    跳过（加 --so 才跑；算法已知时无需仿真）')
        return
    script = os.path.join(TOOLS, 'emulate_init.py')
    require(script, '(tools/emulate_init.py 不存在)')
    run([PY, script], timeout=1800)
    out = os.path.join(RESP, 'ghidra_v8', 'decrypted_strings.txt')
    if os.path.exists(out):
        log('    明文串: %s' % out)


@stage('unguard')
def stage_unguard(ctx):
    if not os.path.exists(GUARD):
        log('    没有 assets/ftyshinidie.guard（普通 jar，无加固壳）')
        src = os.path.join(RESP, 'classes.dex')
        if os.path.exists(src) and not os.path.exists(INNER_DEX):
            shutil.copy2(src, INNER_DEX)
            log('    classes.dex → classes_inner.dex (%d B)' % os.path.getsize(INNER_DEX))
        return
    with open(GUARD, 'rb') as fh:
        raw = fh.read()
    fixed = ftyfix(raw)
    log('    guard %d B，^7 修正 %d 字节' % (len(raw), sum(1 for a, b in zip(raw, fixed) if a != b)))

    jar_path = os.path.join(RESP, 'classes_inner.jar')
    with open(jar_path, 'wb') as fh:
        fh.write(fixed)

    with zipfile.ZipFile(jar_path) as z:
        bad = z.testzip()
        if bad:
            raise RuntimeError('还原后的 JAR CRC 校验失败: %s' % bad)
        names = z.namelist()
        log('    还原为合法 JAR，条目: %s' % names)
        for n in names:
            if not re.match(r'^classes\d*\.dex$', n):
                continue
            dst = os.path.join(RESP, 'classes_inner.dex' if n == 'classes.dex'
                               else 'classes_inner' + n[len('classes'):])
            with z.open(n) as src, open(dst, 'wb') as out:
                shutil.copyfileobj(src, out)
            log('    -> %s (%d B)' % (os.path.basename(dst), os.path.getsize(dst)))


def _jadx(dex_paths, outdir, force, label):
    require(JADX_BAT, '(tools/jadx 未解压)')
    for p in dex_paths:
        require(p, '(相应 dex 不存在，先跑 unpack/unguard)')
    if not fresh_dir(outdir, force):
        log('    %s 已存在，跳过（--force 可重跑）' % label)
        return
    cmd = ['cmd', '/c', JADX_BAT, '-d', outdir, '--no-res', '-j', '4'] + dex_paths
    run(cmd, timeout=7200, quiet=True)
    n = count_java(os.path.join(outdir, 'sources'))
    if n == 0:
        raise RuntimeError('jadx 未产出 java 文件: %s' % outdir)
    log('    %s: %d 个 java' % (label, n))


@stage('jadx-inner')
def stage_jadx_inner(ctx):
    require(INNER_DEX, 'unguard')
    _jadx([INNER_DEX], os.path.join(RESP, 'src_inner'), ctx.force, 'src_inner')


@stage('jadx-outer')
def stage_jadx_outer(ctx):
    if not os.path.exists(GUARD):
        log('    普通 jar（无 guard），没有外层壳 dex，跳过')
        return
    dexes = sorted(
        os.path.join(RESP, n) for n in os.listdir(RESP)
        if re.match(r'^classes\d*\.dex$', n) and n != 'classes_inner.dex'
    )
    if not dexes:
        log('    没有外层 dex，跳过')
        return
    _jadx(dexes, os.path.join(RESP, 'src_outer'), ctx.force, 'src_outer')


@stage('deob')
def stage_deob(ctx):
    pkg_root = os.path.join(INNER_SRC, 'com', 'github', 'catvod')
    if not os.path.isdir(pkg_root):
        log('    src_inner 内没有 com/github/catvod（非 fty 结构），跳过去混淆')
        return
    obf = [f for _dp, _d, fs in os.walk(pkg_root) for f in fs
           if re.match(r'^C\d{3}\w*\.java$', f)]
    if not obf:
        log('    未发现混淆类（C0xxx），源码本就干净，跳过去混淆')
        return
    spider = os.path.join(CLEAN_SRC, 'com', 'github', 'catvod', 'spider')
    chain = [
        ('collect_decoders.py', []),      # XOR 解码方法 → decoders.json
        ('build_inline_map.py', []),      # 薄包装 → inlinemap.json
        ('deob_full.py', []),             # 字符串 + 包装内联 → src_clean
        ('finalize_clean.py', []),        # 无用 import / 死 short[] / 冗余括号
        ('remove_accessors.py', []),      # 死表 accessor 与 short[] 字段
        ('deflatten.py', []),             # 字符串状态机（hashCode 分发）线性化
        ('fold_const_guard2.py', [spider]),  # 数值常量守卫折叠（需指定 spider 目录）
        ('remove_junk.py', []),           # Math.random 垃圾行 / 死状态变量
    ]
    for name, extra in chain:
        script = os.path.join(TOOLS, name)
        require(script, '(tools/%s 不存在)' % name)
        if name == 'deob_full.py':
            # deob_full 会 rmtree(src_clean) 再从 src_inner 全量拷贝；
            # 这里先替它删掉，避免被 IDE 的 rmtree shim 打断。
            force_rmtree(os.path.join(RESP, 'src_clean'))
        log('  - %s' % name)
        run([PY, script] + extra, timeout=3600)
    n = count_java(os.path.join(CLEAN_SRC, 'com', 'github', 'catvod', 'spider'))
    left = grep_count(os.path.join(CLEAN_SRC, 'com', 'github', 'catvod', 'spider'), r'\bC0\d{3}\w*\.m\d+\s*\(')
    log('    src_clean spider: %d 个 java，残留 C 类调用 %d 处' % (n, left))


@stage('deflat')
def stage_deflat(ctx):
    if not os.path.isdir(os.path.join(CLEAN_SRC, 'com', 'github', 'catvod')):
        log('    没有 src_clean（去混淆被跳过），跳过反平坦化')
        return
    run([PY, os.path.join(DEFLAT_DIR, 'run.py')], timeout=3600)
    sm = grep_count(DEFLAT_SRC, r'while \(true\) \{\s*\n\s*\w+\s*\^=')
    log('    src_deflat: %d 个 java，线数 %d，状态机残留 %d 处'
        % (count_java(DEFLAT_SRC), count_lines(DEFLAT_SRC), sm))


@stage('decrypt')
def stage_decrypt(ctx):
    if not os.path.isdir(DEFLAT_SRC):
        log('    没有 src_deflat（反平坦化被跳过），跳过明文替换')
        return
    run([PY, os.path.join(DEFLAT_DIR, 'decrypt_all.py')], timeout=3600)


@stage('normalize')
def stage_normalize(ctx):
    if not os.path.isdir(DEFLAT_SRC):
        log('    没有 src_deflat，跳过规范化')
        return
    tpl = os.path.join(ROOT, 'templates', 'utils')
    dst = os.path.join(DEFLAT_SRC, 'com', 'github', 'catvod', 'utils')
    if os.path.isdir(tpl) and not os.path.isdir(dst):
        shutil.copytree(tpl, dst)
        log('    utils 模板 → %s' % dst)
    const_src = os.path.join(CLEAN_SRC, 'com', 'github', 'catvod', 'spider', 'merge', 'C0033.java')
    if not os.path.exists(const_src):
        log('    缺少 %s，跳过规范化（新样本需先补规则表）' % const_src)
        return
    spider = os.path.join(DEFLAT_SRC, 'com', 'github', 'catvod', 'spider')
    if ctx.normalize_all:
        target = spider
    else:
        target = os.path.join(spider, 'Appgz.java')   # 试点文件（规则表仅对它校验过）
        if not os.path.exists(target):
            log('    试点文件 Appgz.java 不存在，跳过（--normalize-all 可全量铺开）')
            return
    run([PY, os.path.join(DEFLAT_DIR, 'normalize.py'), target], timeout=3600)
    left = grep_count(DEFLAT_SRC, r'\bC0\d{3}\w*\.m\d+\s*\(')
    log('    全项目残留 C 类调用: %d 处' % left)


@stage('report')
def stage_report(ctx):
    if not os.path.isdir(DEFLAT_SRC):
        log('    没有 src_deflat，跳过统计（普通 jar 无 C 类调用分析）')
        return
    run([PY, os.path.join(DEFLAT_DIR, 'scan_calls.py')], timeout=1800)
    run([PY, os.path.join(DEFLAT_DIR, 'resolve_all.py')], timeout=1800)
    mapping = os.path.join(DEFLAT_DIR, '_mapping_all.txt')
    if os.path.exists(mapping):
        with open(mapping, encoding='utf-8') as fh:
            log('    映射表: %s（%d 条）' % (mapping, sum(1 for _ in fh)))
    bad = unbalanced(DEFLAT_SRC)
    if bad:
        log('    [warn] 花括号不平衡 %d 个（jadx 原始输出就坏的属正常）: %s'
            % (len(bad), ', '.join(bad[:6])))
    else:
        log('    花括号平衡检查通过')


# ---------------------------------------------------------------- 主流程

def main():
    ap = argparse.ArgumentParser(
        description='jar → dex → so/guard → java 一键流水线',
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog='阶段顺序: ' + ' -> '.join(n for n, _ in STAGES))
    ap.add_argument('jar', nargs='?', default=os.path.join(ROOT, 'tvbox', 'response.jar'),
                    help='输入 jar/dex（默认 tvbox/response.jar）')
    ap.add_argument('--list', action='store_true', help='列出阶段')
    ap.add_argument('--from', dest='from_stage', help='从指定阶段开始')
    ap.add_argument('--only', help='只跑指定阶段')
    ap.add_argument('--force', action='store_true', help='重跑 jadx（清空输出目录）')
    ap.add_argument('--so', action='store_true', help='额外跑 SO 字符串解码')
    ap.add_argument('--normalize-all', action='store_true',
                    help='规范化铺开到整个 spider 目录（默认仅试点文件 Appgz.java）')
    ap.add_argument('--log', help='同时把日志写入指定文件（长任务后台跑时用）')
    args = ap.parse_args()

    global LOG_FP
    if args.log:
        LOG_FP = open(args.log, 'w', encoding='utf-8')
        LOG_FP.write('jar2java %s\n' % time.strftime('%Y-%m-%d %H:%M:%S'))

    names = [n for n, _ in STAGES]
    if args.list:
        for i, (n, d) in enumerate(STAGES, 1):
            log('%2d. %-11s %s' % (i, n, d))
        return 0

    if args.only:
        if args.only not in names:
            log('未知阶段: %s（可用: %s）' % (args.only, ', '.join(names)))
            return 2
        selected = [args.only]
    elif args.from_stage:
        if args.from_stage not in names:
            log('未知阶段: %s（可用: %s）' % (args.from_stage, ', '.join(names)))
            return 2
        selected = names[names.index(args.from_stage):]
    else:
        selected = [n for n in names if n != 'so' or args.so]

    log('输入 : %s' % args.jar)
    log('输出 : %s' % RESP)
    log('阶段 : %s' % ' -> '.join(selected))
    log('')

    t0 = time.time()
    for i, name in enumerate(selected, 1):
        desc = dict(STAGES)[name]
        log('[%d/%d] %s — %s' % (i, len(selected), name, desc))
        try:
            STAGE_FUNCS[name](args)
        except RuntimeError as e:
            log('')
            log('[fail] 阶段 %s 失败: %s' % (name, e))
            return 1
        log('')

    log('=== 完成，总耗时 %.1fs ===' % (time.time() - t0))
    for label, path in (('src_outer ', OUTER_SRC), ('src_inner ', INNER_SRC),
                        ('src_clean ', CLEAN_SRC), ('src_deflat', DEFLAT_SRC)):
        if os.path.isdir(path):
            log('  %s : %4d 个 java' % (label, count_java(path)))
    if os.path.isdir(DEFLAT_SRC):
        log('  残留 C 类调用: %d 处' % grep_count(DEFLAT_SRC, r'\bC0\d{3}\w*\.m\d+\s*\('))
    return 0


if __name__ == '__main__':
    try:
        sys.exit(main())
    except SystemExit:
        raise
    except Exception:
        import traceback
        log(traceback.format_exc())
        sys.exit(1)
