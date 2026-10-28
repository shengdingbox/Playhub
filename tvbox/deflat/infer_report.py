"""列出所有通过"入口推断"还原的位置，便于抽样核对。"""
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import deflat
from fmt import reindent

ROOT = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_clean\sources\com\github\catvod"
OUT = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_deflat\sources\com\github\catvod"

show = int(sys.argv[1]) if len(sys.argv) > 1 else 3
total = 0
files = []
for dirpath, _, filenames in os.walk(ROOT):
    for fn in sorted(filenames):
        if not fn.endswith('.java'):
            continue
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read()
        out, stats = deflat.deflate_file(src)
        inf = stats.get('inferred', 0)
        if inf:
            total += inf
            files.append((p, inf, stats))
print('inferred total =', total)
for p, inf, st in files:
    print('  %-60s inferred=%d ok=%d remaining=%d' % (os.path.basename(p), inf, st['ok'], st['remaining']))
