"""打印指定文件中所有 Cxxxx.mNN 调用点的上下文（可写入文件避免控制台截断）。

用法：python sites.py <文件> [前后行数] [输出文件]
"""
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

p = sys.argv[1]
before = int(sys.argv[2]) if len(sys.argv) > 2 else 2
after = int(sys.argv[3]) if len(sys.argv) > 3 else 2
outp = sys.argv[4] if len(sys.argv) > 4 else None

src = open(p, encoding='utf-8', errors='replace').read()
lines = src.split('\n')
pat = re.compile(r'\b(C\d{4}\w*)\.(m\d+)\s*\(')
buf = []
for i, l in enumerate(lines, 1):
    for m in pat.finditer(l):
        buf.append('%s.%s @%d' % (m.group(1), m.group(2), i))
    if pat.search(l):
        lo = max(1, i - before)
        hi = min(len(lines), i + after)
        buf.append('--- %d' % i)
        for j in range(lo, hi + 1):
            mark = '>>' if j == i else '  '
            buf.append('%s%5d| %s' % (mark, j, lines[j - 1].strip()[:160]))
text = '\n'.join(buf)
if outp:
    open(outp, 'w', encoding='utf-8').write(text)
    print('written %d lines -> %s' % (len(buf), outp))
else:
    print(text)
