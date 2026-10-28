import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from cff import HEAD, Loop, Unresolvable, build_cfg
from render import Renderer
from deflat import seed_start, line_indent

src = open(sys.argv[1], encoding='utf-8', errors='replace').read()
arg = sys.argv[2] if len(sys.argv) > 2 else '1'
if arg.startswith('s'):
    want_seed = int(arg[1:])
    want_n = None
else:
    want_seed = None
    want_n = int(arg)


def brief_lines(spans, s):
    return ' | '.join(s[a:b].strip().replace('\n', ' ')[:70] for a, b in spans)


def brief_flow(f):
    k = f[0]
    if k == 'goto':
        return 'goto %s' % f[1]
    if k == 'exit':
        return 'exit'
    if k == 'if':
        return 'if(%s) then[%s] else[%s]' % (f[1][:40], brief_flow(f[2][1]), brief_flow(f[3][1]))
    return str(f)[:40]


n = 0
while True:
    matches = list(HEAD.finditer(src))
    if not matches:
        break
    hit = False
    for i in range(len(matches) - 1, -1, -1):
        m = matches[i]
        try:
            loop = Loop(src, m)
            states = build_cfg(loop)
            if loop.entry() not in states:
                raise Unresolvable('entry missing')
            r = Renderer(loop, states, line_indent(src, loop.while_start))
            lines = r.render()
            s0 = seed_start(loop)
            e0 = loop.while_end
        except Unresolvable:
            continue
        except Exception as ex:
            print('EXC', ex)
            continue
        n += 1
        show = (want_seed is not None and loop.seed == want_seed) or (want_n is not None and n == want_n)
        if show:
            print('=== #%d var=%s key=%s seed=%s entry=%s tail=%s' % (n, loop.var, loop.key, loop.seed, loop.entry(), loop.tail_value))
            print('--- raw ---')
            print(src[s0:e0])
            print('--- states ---')
            for v in sorted(states):
                blk = states[v]
                print('  %-8s %-34s body=%s' % (v, brief_flow(blk['flow']), brief_lines(blk['body'], src)[:200]))
            print('--- cycles ---', sorted(r.cycles))
            print('--- out ---')
            print('\n'.join(lines))
            if want_n is not None:
                sys.exit(0)
            print()
        src = src[:s0] + '\n'.join(lines) + src[e0:]
        hit = True
        break
    if not hit:
        break
print('only %d loops' % n)
