"""对还原结果做静态健全性检查：花括号平衡、label 引用、残留量。"""
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from fmt import _scan

_RESP = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                     'decompiled', 'response')
ROOT = sys.argv[1] if len(sys.argv) > 1 else os.path.join(_RESP, 'src_deflat', 'sources')

OLD = os.path.join(_RESP, 'src_clean', 'sources')

files = 0
bal = 0
bad_labels = []
tot_old_lines = tot_new_lines = 0
tot_cff = tot_loop = tot_switch = 0

for dirpath, _, filenames in os.walk(ROOT):
    rel = os.path.relpath(dirpath, ROOT)
    for fn in sorted(filenames):
        if not fn.endswith('.java'):
            continue
        files += 1
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read()
        o = c = 0
        for ln in src.split('\n'):
            a, b, _x = _scan(ln)
            o += a
            c += b
        if o != c:
            bal += 1
            print('UNBALANCED', p, o - c)
        used = set(re.findall(r'\b(?:break|continue) ([A-Za-z_$][\w$]*);', src))
        defined = set(re.findall(r'^\s*([A-Za-z_$][\w$]*):(?:\s*\{|\s*while\b|\s*do\b|\s*for\b)', src, re.M))
        missing = used - defined
        if missing:
            bad_labels.append((p, sorted(missing)))
        tot_cff += len(re.findall(r'\b(cff\d+): \{', src))
        tot_loop += len(re.findall(r'\bL\d+: while \(true\) \{', src))
        tot_switch += src.count('switch (')
        tot_new_lines += src.count('\n')

for dirpath, _, filenames in os.walk(OLD):
    for fn in filenames:
        if fn.endswith('.java'):
            tot_old_lines += open(os.path.join(dirpath, fn), encoding='utf-8', errors='replace').read().count('\n')

print('files=%d unbalanced=%d bad_labels=%d' % (files, bal, len(bad_labels)))
print('label blocks=%d  generated loops=%d  remaining switch=%d' % (tot_cff, tot_loop, tot_switch))
print('lines %d -> %d (%.1f%%)' % (tot_old_lines, tot_new_lines, 100.0 * tot_new_lines / max(tot_old_lines, 1)))
for p, m in bad_labels[:10]:
    print('BAD LABEL', p, m)
