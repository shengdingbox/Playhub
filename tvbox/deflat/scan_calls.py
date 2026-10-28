"""全项目扫描：统计 src_deflat 中所有 Cxxxx.mNN 调用，并按目标文件的 import 解析真实归属类。"""
import os
import re
import sys
from collections import Counter

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

BASE = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                    'decompiled', 'response')
DEFLAT = os.path.join(BASE, 'src_deflat', 'sources')
CLEAN = os.path.join(BASE, 'src_clean', 'sources')
CALL_RE = re.compile(r'\b(C\d{4}\w*)\.(m\d+)\s*\(')


def build_index(root):
    by_simple, by_fqn = {}, {}
    for dp, _d, fs in os.walk(root):
        for f in fs:
            if not f.endswith('.java'):
                continue
            p = os.path.join(dp, f)
            head = open(p, encoding='utf-8', errors='replace').read(400)
            m = re.search(r'package\s+([\w.]+)\s*;', head)
            pkg = m.group(1) if m else ''
            simple = f[:-5]
            by_simple.setdefault(simple, []).append((pkg, p))
            by_fqn['%s.%s' % (pkg, simple)] = p
    return by_simple, by_fqn


def main():
    by_simple, by_fqn = build_index(CLEAN)
    combos = Counter()
    unresolved = Counter()
    files_with = 0
    total = 0
    for dp, _d, fs in os.walk(DEFLAT):
        for f in sorted(fs):
            if not f.endswith('.java'):
                continue
            p = os.path.join(dp, f)
            s = open(p, encoding='utf-8', errors='replace').read()
            if not CALL_RE.search(s):
                continue
            files_with += 1
            head = s[:3000]
            self_pkg = re.search(r'package\s+([\w.]+)\s*;', head).group(1)
            imports = {}
            for m in re.finditer(r'import\s+(?:static\s+)?([\w.]+)\s*;', head):
                imports[m.group(1).split('.')[-1]] = m.group(1)
            for m in CALL_RE.finditer(s):
                total += 1
                cls = m.group(1)
                meth = m.group(2)
                fqn = imports.get(cls)
                path = None
                if fqn:
                    path = by_fqn.get(fqn)
                else:
                    cand = '%s.%s' % (self_pkg, cls)
                    path = by_fqn.get(cand)
                    if path is None:
                        lst = by_simple.get(cls, [])
                        if len(lst) == 1:
                            path = lst[0][1]
                if path is None:
                    unresolved['%s.%s' % (cls, meth)] += 1
                    continue
                pkg = os.path.relpath(os.path.dirname(path), CLEAN).replace('\\', '/')
                combos['%s.%s.%s' % (pkg, cls, meth)] += 1
    print('含调用的文件: %d，调用总数: %d' % (files_with, total))
    print('不同 (包.类.方法) 组合: %d' % len(combos))
    print('未解析: %d 种' % len(unresolved))
    for k, n in unresolved.most_common(10):
        print('   ?? %s x%d' % (k, n))
    out = os.path.join(os.path.dirname(os.path.abspath(__file__)), '_calls_all.txt')
    with open(out, 'w', encoding='utf-8') as fh:
        for k, n in combos.most_common():
            fh.write('%s\t%d\n' % (k, n))
    print('写出', out)


if __name__ == '__main__':
    main()
