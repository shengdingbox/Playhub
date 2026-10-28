"""统计 src_deflat 中 Cxxxx.mNN 调用的参数形态，定位解密调用漏匹配原因。"""
import os
import re
import sys
from collections import Counter

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

DEFLAT = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_deflat\sources"
ANY = re.compile(r'\b(C\d{4}\w*)\.(m\d+)\s*\(')
DEC = re.compile(r'\b(C\d{4}\w*)\.(m\d+)\(\s*((?:[\w$]+\.)?[\w$]+)\s*,\s*(-?\d+)\s*,\s*(-?\d+)\s*,\s*(-?\d+)\s*\)')

total = 0
dec = 0
files = 0
samples = []
argshapes = Counter()
for dp, _d, fs in os.walk(DEFLAT):
    for f in sorted(fs):
        if not f.endswith('.java'):
            continue
        p = os.path.join(dp, f)
        s = open(p, encoding='utf-8', errors='replace').read()
        hits = list(ANY.finditer(s))
        if not hits:
            continue
        files += 1
        total += len(hits)
        dec += len(DEC.findall(s))
        for m in hits:
            j = m.end() - 1
            depth = 0
            k = j
            while k < len(s):
                if s[k] == '(':
                    depth += 1
                elif s[k] == ')':
                    depth -= 1
                    if depth == 0:
                        break
                k += 1
            args = s[j + 1:k]
            top = 0
            depth = 0
            for ch in args:
                if ch in '([{':
                    depth += 1
                elif ch in ')]}':
                    depth -= 1
                elif ch == ',' and depth == 0:
                    top += 1
            shape = 'args%d:%s' % (top + 1 if args.strip() else 0, 'num' if args.strip().replace(' ', '').replace('-', '').replace(',', '').isdigit() else 'expr')
            argshapes[shape] += 1
            if len(samples) < 6 and top == 3 and not DEC.match(s[m.start():k + 1]):
                samples.append('%s: %s' % (os.path.basename(p), s[m.start():k + 1][:120].replace('\n', ' ')))
print('文件 %d，C 调用总数 %d，其中解密形态匹配 %d' % (files, total, dec))
print('参数形态分布（前 12）:')
for k, v in argshapes.most_common(12):
    print('   %-22s %d' % (k, v))
print('未被匹配的 4 参样例:')
for t in samples:
    print('   ', t)
