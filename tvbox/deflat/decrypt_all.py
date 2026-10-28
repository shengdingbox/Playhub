"""把 short[] 异或解密调用（Cxxxx.mNN(fNNshort, off, len, key)）替换为明文字符串常量。

- 按 包.类 索引数组与解密函数（同名类存在于多个包，必须按包区分）
- 数组名可带类前缀（C0044.f67short）
"""
import os
import re
import sys
from collections import Counter

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

BASE = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                    'decompiled', 'response')
DEFLAT = os.path.join(BASE, 'src_deflat', 'sources')
CLEAN = os.path.join(BASE, 'src_clean', 'sources')

ARR_HEAD = re.compile(r'short\[\]\s+(\w+)\s*=\s*\{')


def find_arrays(s):
    """线性扫描 short[] 数组定义（数组内部无嵌套花括号）。"""
    out = {}
    for m in ARR_HEAD.finditer(s):
        j = m.end() - 1
        k = s.find('}', j)
        if k < 0:
            continue
        out[m.group(1)] = [int(x) for x in re.findall(r'-?\d+', s[j:k])]
    return out
SIG_RE = re.compile(
    r'static\s+String\s+(\w+)\s*\(\s*short\[\]\s*(\w+)\s*,\s*int\s+(\w+)\s*,\s*int\s+(\w+)\s*,\s*int\s+(\w+)\s*\)\s*\{'
)
CALL_RE = re.compile(
    r'\b(C\d{4}\w*)\.(m\d+)\(\s*((?:[\w$]+\.)?[\w$]+)\s*,\s*(-?\d+)\s*,\s*(-?\d+)\s*,\s*(-?\d+)\s*\)'
)


def find_close(src, j):
    depth = 0
    i = j
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
                    break
                i += 1
        elif c == '{':
            depth += 1
        elif c == '}':
            depth -= 1
            if depth == 0:
                return i
        i += 1
    return -1


def build_class_index():
    by_fqn, by_simple = {}, {}
    for dp, _d, fs in os.walk(CLEAN):
        for f in fs:
            if not f.endswith('.java'):
                continue
            p = os.path.join(dp, f)
            head = open(p, encoding='utf-8', errors='replace').read(400)
            m = re.search(r'package\s+([\w.]+)\s*;', head)
            pkg = m.group(1) if m else ''
            fqn = '%s.%s' % (pkg, f[:-5])
            by_fqn[fqn] = p
            by_simple.setdefault(f[:-5], []).append(p)
    return by_fqn, by_simple


class Decrypt(object):
    def __init__(self):
        self.arrays = {}   # (类名, 字段) -> [int]
        self.methods = {}  # (类名, 方法) -> True
        self.by_fqn, self.by_simple = build_class_index()
        print('索引完成: %d 个类文件' % len(self.by_fqn), flush=True)
        self.cache = {}
        for i, (fqn, p) in enumerate(self.by_fqn.items()):
            if i % 200 == 0:
                print('  ... 扫描类 %d/%d' % (i, len(self.by_fqn)), flush=True)
            cls = fqn.split('.')[-1]
            s = open(p, encoding='utf-8', errors='replace').read()
            self.cache[cls] = s
            for name, vals in find_arrays(s).items():
                self.arrays[(cls, name)] = vals
            for m in SIG_RE.finditer(s):
                close = find_close(s, m.end() - 1)
                if close < 0:
                    continue
                body = s[m.end():close]
                if re.search(r'\b%s\s*\[' % m.group(2), body) and re.search(r'\^\s*%s\b' % m.group(5), body):
                    self.methods[(cls, m.group(1))] = True

    def resolve_class(self, name, imports, self_pkg):
        if name in imports:
            return imports[name].split('.')[-1]
        cand = '%s.%s' % (self_pkg, name)
        if cand in self.by_fqn:
            return name
        lst = self.by_simple.get(name, [])
        if len(lst) == 1:
            return name
        return None

    def value(self, cls, meth, arrname, off, ln, key, imports, self_pkg):
        if (cls, meth) not in self.methods:
            return None
        if '.' in arrname:
            owner, field = arrname.split('.', 1)
            arr_cls = self.resolve_class(owner, imports, self_pkg)
            if arr_cls is None:
                return None
        else:
            arr_cls, field = cls, arrname
        arr = self.arrays.get((arr_cls, field))
        if arr is None:
            for (c2, f2), v in self.arrays.items():
                if f2 == field:
                    arr = v
                    break
        if arr is None or off < 0 or off + ln > len(arr):
            return None
        try:
            return ''.join(chr(arr[off + i] ^ key) for i in range(ln))
        except ValueError:
            return None


def java_str(s):
    out = []
    for ch in s:
        if ch == '"':
            out.append('\\"')
        elif ch == '\\':
            out.append('\\\\')
        elif ch == '\n':
            out.append('\\n')
        elif ch == '\r':
            out.append('\\r')
        elif ch == '\t':
            out.append('\\t')
        elif ord(ch) < 32 or ord(ch) == 127:
            out.append('\\u%04x' % ord(ch))
        else:
            out.append(ch)
    return '"' + ''.join(out) + '"'


def main():
    dry = '--dry' in sys.argv
    d = Decrypt()
    print('解密方法: %d 个，short[] 数组: %d 个' % (len(d.methods), len(d.arrays)))
    samples = []
    stats = Counter()
    nfile = 0
    for dp, _d, fs in os.walk(DEFLAT):
        for f in sorted(fs):
            if not f.endswith('.java'):
                continue
            nfile += 1
            if nfile % 100 == 0:
                print('  ... 已处理 %d 个文件（替换 %d 处）' % (nfile, stats['ok']), flush=True)
            p = os.path.join(dp, f)
            s = open(p, encoding='utf-8', errors='replace').read()
            if not CALL_RE.search(s):
                continue
            head = s[:4000]
            self_pkg = re.search(r'package\s+([\w.]+)\s*;', head).group(1)
            imports = {}
            for m in re.finditer(r'import\s+(?:static\s+)?([\w.]+)\s*;', head):
                imports[m.group(1).split('.')[-1]] = m.group(1)

            def repl(m):
                cls = m.group(1)
                meth = m.group(2)
                v = d.value(cls, meth, m.group(3), int(m.group(4)), int(m.group(5)), int(m.group(6)), imports, self_pkg)
                if v is None:
                    stats['miss'] += 1
                    return m.group(0)
                stats['ok'] += 1
                if not v:
                    stats['empty'] += 1
                if len(samples) < 25:
                    samples.append('%-58s -> %s' % (m.group(0)[:58], java_str(v)[:60]))
                return java_str(v)

            s2 = CALL_RE.sub(repl, s)
            if s2 != s:
                if not dry:
                    open(p, 'w', encoding='utf-8').write(s2)
                stats['files'] += 1
    if samples:
        print('样例:')
        for t in samples:
            print('   ', t)
    print('%s替换成功 %d 处（空串 %d），未解析 %d 处，涉及文件 %d 个' % (
        '[dry] ' if dry else '', stats['ok'], stats['empty'], stats['miss'], stats['files']))


if __name__ == '__main__':
    main()
