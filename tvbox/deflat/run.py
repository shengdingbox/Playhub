import os
import sys
import time

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from deflat import deflate_file

RESP = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                    'decompiled', 'response')
ROOT = os.path.join(RESP, 'src_clean', 'sources')
OUT = os.path.join(RESP, 'src_deflat', 'sources')

only = sys.argv[1] if len(sys.argv) > 1 else None

total_ok = total_left = 0
files = 0
bad = []
t0 = time.time()
for dirpath, _, filenames in os.walk(ROOT):
    rel = os.path.relpath(dirpath, ROOT)
    for fn in sorted(filenames):
        if not fn.endswith('.java'):
            continue
        if only and only not in fn:
            continue
        src = open(os.path.join(dirpath, fn), encoding='utf-8', errors='replace').read()
        out, stats = deflate_file(src)
        total_ok += stats['ok']
        total_left += stats['remaining']
        files += 1
        if stats['exc']:
            bad.append((fn, stats['exc'][:2]))
        od = os.path.join(OUT, rel)
        os.makedirs(od, exist_ok=True)
        open(os.path.join(od, fn), 'w', encoding='utf-8').write(out)

print('files=%d ok=%d remaining=%d  %.1fs' % (files, total_ok, total_left, time.time() - t0))
for fn, ex in bad[:10]:
    print('EXC', fn, ex)
