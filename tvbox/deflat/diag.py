"""诊断：还原结束后仍残留的状态机，按失败原因分类。"""
import os
import sys
from collections import Counter

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from cff import HEAD, Loop, Unresolvable, build_cfg
from deflat import deflate_file

ROOT = sys.argv[1] if len(sys.argv) > 1 else r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_clean\sources\com\github\catvod"

reasons = Counter()
samples = {}
files_with = []

for dirpath, _, filenames in os.walk(ROOT):
    for fn in sorted(filenames):
        if not fn.endswith('.java'):
            continue
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read()
        out, stats = deflate_file(src)
        left = stats['remaining']
        if not left:
            continue
        files_with.append((p, left, stats['ok']))
        for m in HEAD.finditer(out):
            try:
                loop = Loop(out, m)
                build_cfg(loop)
                rsn = 'ok-but-skipped'
            except Unresolvable as ex:
                rsn = str(ex)
                loop = None
            except Exception as ex:
                rsn = '%s: %s' % (type(ex).__name__, ex)
                loop = None
            key = rsn.split(':')[0][:60]
            reasons[key] += 1
            if key not in samples:
                ln = out[:m.start()].count('\n') + 1
                samples[key] = (p, ln, out[m.start():m.start() + 400])

print('files with leftovers:', len(files_with))
print('total leftover blocks:', sum(c for c in reasons.values()))
for k, c in reasons.most_common():
    print('  %-46s %d   e.g. %s:%d' % (k, c, os.path.basename(samples[k][0]), samples[k][1]))
print()
for k, c in reasons.most_common(6):
    p, ln, txt = samples[k]
    print('===== %s (%d)  %s:%d' % (k, c, p, ln))
    print(txt)
    print()
