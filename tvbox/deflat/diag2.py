"""按原因列出若干残留块全文。用法: python diag2.py "no seed" 8 30"""
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from cff import HEAD, Loop, Unresolvable, build_cfg
from deflat import deflate_file

ROOT = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_clean\sources\com\github\catvod"
want = sys.argv[1] if len(sys.argv) > 1 else 'no seed'
limit = int(sys.argv[2]) if len(sys.argv) > 2 else 5
maxlines = int(sys.argv[3]) if len(sys.argv) > 3 else 30

shown = 0
for dirpath, _, filenames in os.walk(ROOT):
    for fn in sorted(filenames):
        if not fn.endswith('.java'):
            continue
        p = os.path.join(dirpath, fn)
        out, stats = deflate_file(open(p, encoding='utf-8', errors='replace').read())
        if not stats['remaining']:
            continue
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
            if rsn.split(':')[0][:60] != want:
                continue
            ln = out[:m.start()].count('\n') + 1
            txt = out[m.start():]
            cut = txt.find('\n        }\n')
            print('######## %s:%d (seed=%s key=%s)' % (p, ln, loop.seed if loop else '?', loop.key if loop else '?'))
            print('\n'.join(txt.split('\n')[:maxlines]))
            print('   ...')
            shown += 1
            if shown >= limit:
                sys.exit(0)
print('shown', shown)
