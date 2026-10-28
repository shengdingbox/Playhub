import sys
import os

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from deflat import deflate_file

src = open(sys.argv[1], encoding='utf-8', errors='replace').read()
out, stats = deflate_file(src)
print('stats', {k: v for k, v in stats.items() if k != 'exc'}, 'exc', len(stats['exc']))
for e in stats['exc'][:5]:
    print('  EXC', e)
if len(sys.argv) > 2:
    os.makedirs(os.path.dirname(sys.argv[2]), exist_ok=True)
    open(sys.argv[2], 'w', encoding='utf-8').write(out)
else:
    print(out)
