import os
import re
import sys
from collections import Counter

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from cff import HEAD, Loop, Unresolvable, build_cfg, reachable, successors

ROOT = sys.argv[1] if len(sys.argv) > 1 else r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_clean\sources\com\github\catvod"

reasons = Counter()
ok = Counter()
examples = {}


def brief(flow):
    k = flow[0]
    if k == 'goto':
        return 'goto %s' % flow[1]
    if k == 'exit':
        return 'exit'
    if k == 'if':
        return 'if(%s) then[%s] else[%s]' % (flow[1][:40], brief(flow[2][1]), brief(flow[3][1]))
    return str(flow)[:60]


def has_cycle(states, entry):
    """DFS 检测回边"""
    color = {}

    def dfs(u):
        color[u] = 1
        blk = states.get(u)
        if blk is not None:
            for v in successors(blk['flow']):
                if v not in states:
                    continue
                if color.get(v, 0) == 1:
                    return True
                if color.get(v, 0) == 0:
                    if dfs(v):
                        return True
        color[u] = 2
        return False

    sys.setrecursionlimit(10000)
    return dfs(entry)


nfiles = 0
nloops = 0
for dirpath, _, filenames in os.walk(ROOT):
    for fn in sorted(filenames):
        if not fn.endswith('.java'):
            continue
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read()
        nfiles += 1
        for m in HEAD.finditer(src):
            nloops += 1
            try:
                loop = Loop(src, m)
                states = build_cfg(loop)
            except Unresolvable as ex:
                reasons[str(ex)[:60]] += 1
                examples.setdefault(str(ex)[:60], (p, src[m.start():m.start() + 200]))
                continue
            except Exception as ex:
                reasons['EXC:' + type(ex).__name__ + ':' + str(ex)[:50]] += 1
                examples.setdefault('EXC:' + type(ex).__name__, (p, str(ex)[:200]))
                continue
            entry = loop.entry()
            if entry not in states:
                reasons['entry missing'] += 1
                examples.setdefault('entry missing', (p, 'seed=%s key=%s' % (loop.seed, loop.key)))
                continue
            vis = reachable(states, entry)
            missing = set()
            for v in vis:
                for t in successors(states[v]['flow']):
                    if t not in states:
                        missing.add(t)
            if missing:
                reasons['missing target (%d)' % len(missing)] += 1
                if 'missing target' not in examples:
                    try:
                        frag = src[m.start():loop.while_end]
                        frag = re.sub(r'\n\s*\n', '\n', frag)[:900]
                    except Exception:
                        frag = '?'
                    ind = {v: i for i, v in enumerate(sorted(states))}
                    lines = []
                    for v in sorted(states):
                        blk = states[v]
                        body = ' '.join(loop.src[a:b].strip() for a, b in blk['body'])[:80]
                        lines.append('   %-8s body=%-80s flow=%s' % (v, body, brief(blk['flow'])))
                    examples['missing target'] = (p, 'entry=%s missing=%s keys=%s\n%s\n%s' % (
                        entry, sorted(missing), sorted(states)[:12], frag, '\n'.join(lines)))
                continue
            ok['analyzed'] += 1
            ok['blocks<=%d' % min(len(vis), 20)] += 1
            if has_cycle(states, entry):
                ok['has_cycle'] += 1
            else:
                ok['acyclic'] += 1

print('files', nfiles, 'loops', nloops)
print('--- OK')
for k, v in sorted(ok.items()):
    print('  %-24s %d' % (k, v))
print('--- FAILURES')
for k, v in reasons.most_common(40):
    print('  %-40s %d' % (k, v))
print('--- EXAMPLES')
for k, (p, ex) in list(examples.items())[:20]:
    print('###', k)
    print('   ', p)
    print('   ', str(ex)[:300].replace('\n', ' | '))
