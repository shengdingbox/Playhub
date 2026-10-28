import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from cff import HEAD, Loop, Unresolvable, build_cfg, reachable
from render import Renderer
from deflat import seed_start, line_indent

target = sys.argv[1]
needle = sys.argv[2]
src = open(target, encoding='utf-8', errors='replace').read()


def brief_flow(f):
    k = f[0]
    if k == 'goto':
        return 'goto %s' % f[1]
    if k == 'exit':
        return 'exit'
    if k == 'if':
        return 'if(%s) then[%s] else[%s]' % (f[1][:40], brief_flow(f[2][1]), brief_flow(f[3][1]))
    return str(f)[:40]


while True:
    matches = list(HEAD.finditer(src))
    if not matches:
        break
    hit = False
    for i in range(len(matches) - 1, -1, -1):
        m = matches[i]
        try:
            loop = Loop(src, m)
            raw = src[loop.seed_stmt_span[0]:loop.while_end]
            if needle in raw:
                print('>>> raw contains needle, seed=%s' % loop.seed)
            states = build_cfg(loop)
            if loop.entry() not in states:
                raise Unresolvable('entry missing')
            r = Renderer(loop, states, line_indent(src, loop.while_start))
            lines = r.render()
            s0 = seed_start(loop)
            e0 = loop.while_end
        except Unresolvable as ex:
            if needle in src[m.start():m.start() + 4000]:
                print('   .. unrenderable here: %s' % ex)
            continue
        except Exception as ex:
            continue
        raw = src[s0:e0]
        if needle in raw:
            print('=== seed=%s key=%s entry=%s tail=%s' % (loop.seed, loop.key, loop.entry(), loop.tail_value))
            print(raw)
            vis = set(reachable(states, loop.entry()))
            print('--- states (reachable=%s) ---' % sorted(vis))
            for v in sorted(states):
                blk = states[v]
                body = ' || '.join(src[a:b].strip().replace('\n', ' ')[:60] for a, b in blk['body'])
                print('  %-8s %-34s body=%s' % (v, brief_flow(blk['flow']), body[:200]))
            print('--- out ---')
            print('\n'.join(lines))
            sys.exit(0)
        src = src[:s0] + '\n'.join(lines) + src[e0:]
        hit = True
        break
    if not hit:
        break
print('not found')
