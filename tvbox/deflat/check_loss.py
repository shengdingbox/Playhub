"""质量检查：还原后是否丢失了原有业务语句（逐轮比对）。"""
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from cff import HEAD, Loop, Unresolvable, build_cfg
from render import Renderer
from deflat import seed_start, line_indent

CTRL = [
    re.compile(r'^\w+ \^= -?\d+;$'),
    re.compile(r'^int \w+ = -?\d+;$'),
    re.compile(r'^\w+ = -?\d+;$'),
    re.compile(r'^switch \(\w+\) \{$'),
    re.compile(r'^while \(true\) \{$'),
    re.compile(r'^\w+ = .*\?.*: -?\d+;$'),
    re.compile(r'^\w+ = -?\d+;$'),
]


def business(text):
    out = []
    for raw in text.split('\n'):
        t = raw.strip()
        if not t:
            continue
        if t in ('break;', 'continue;', '}', '{', 'default:', 'default: continue;'):
            continue
        if t.startswith('case ') or t.startswith('default:'):
            rest = t.split(':', 1)[1].strip()
            if rest and rest not in ('break;', 'continue;'):
                out.append(rest)
            continue
        if any(p.match(t) for p in CTRL):
            continue
        if t.endswith('{') and (t.startswith(('if ', 'if(', 'while ', 'while(', 'for ', 'for(',
                                              'try', 'catch', 'finally', 'synchronized', 'do ',
                                              'switch ', 'switch('))):
            continue
        if t.endswith('else {') or t == '}':
            continue
        out.append(t)
    return out


def check(src, path=''):
    lost = []
    rounds = 0
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
                lost.append((path, 'EXC %s' % ex))
                continue
            before = business(src[s0:e0])
            after = business('\n'.join(lines))
            # 只关心"可达 case"里的语句
            from cff import reachable
            vis = set(reachable(states, loop.entry()))
            spans = [(bs, be, set(int(x) for x in labs if x != 'default'))
                     for labs, bs, be in loop.case_map() if bs is not None]

            def reachable_line(text):
                hits = []
                for bs, be, vals in spans:
                    if text in src[bs:be]:
                        hits.append(bool(vals & vis))
                        if not (vals & vis):
                            return False
                if not hits:
                    return True
                return True

            missing = [b for b in before if b not in after and reachable_line(b)]
            if missing:
                lost.append((path, 'seed=%s key=%s\n     MISSING: %s\n     was: %s' % (
                    loop.seed, loop.key, ' || '.join(missing)[:300], before[:6])))
            rounds += 1
            src = src[:s0] + '\n'.join(lines) + src[e0:]
            hit = True
            break
        if not hit:
            break
    return rounds, lost


if __name__ == '__main__':
    target = sys.argv[1]
    total = 0
    all_lost = []
    if os.path.isdir(target):
        files = []
        for dirpath, _, filenames in os.walk(target):
            for fn in sorted(filenames):
                if fn.endswith('.java'):
                    files.append(os.path.join(dirpath, fn))
    else:
        files = [target]
    sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
    from fmt import _scan

    def balance(text):
        o = c = 0
        for ln in text.split('\n'):
            a, b, _x = _scan(ln)
            o += a
            c += b
        return o - c

    for p in files:
        src = open(p, encoding='utf-8', errors='replace').read()
        rounds, lost = check(src, p)
        total += rounds
        all_lost.extend(lost)
        b0 = balance(src)
        nb = len(list(__import__('re').finditer(r'while \(true\)', src)))
        print('%-50s rounds=%-5d lost=%-3d braces=%d' % (os.path.basename(p), rounds, len(lost), b0))
    print('rounds', total, 'problems', len(all_lost))
    for p, msg in all_lost[:15]:
        print('###', p)
        print(msg[:900])
