import re
import sys

sys.path.insert(0, __import__('os').path.dirname(__import__('os').path.abspath(__file__)))
from cff import HEAD, Loop, Unresolvable, build_cfg, successors, switch_const_labels
from render import Renderer
from fmt import final_cleanup, reindent


def _simplify_cond(c):
    c = c.strip()
    while c.startswith('!(') and c.endswith(')') and _balanced(c[1:]):
        inner = c[2:-1].strip()
        if '(' not in inner:
            c = '!' + inner if not _is_simple(inner) else _negate_simple(inner)
            break
        break
    return c


def _balanced(s):
    d = 0
    for ch in s:
        if ch == '(':
            d += 1
        elif ch == ')':
            d -= 1
            if d < 0:
                return False
    return d == 0


def _is_simple(s):
    return re.fullmatch(r'!?[A-Za-z_$][\w$.]*', s or '') is not None


def _negate_simple(s):
    return s[1:] if s.startswith('!') else '!' + s


def seed_start(loop):
    seg = loop.src[loop.seed_stmt_span[0]:loop.seed_stmt_span[1]]
    mm = re.search(r'(?:int\s+)?' + re.escape(loop.var) + r'\s*=\s*-?\d+\s*;', seg)
    if mm is None:
        raise Unresolvable('seed locate')
    return loop.seed_stmt_span[0] + mm.start()


def line_indent(src, idx):
    ls = src.rfind('\n', 0, idx)
    seg = src[ls + 1:idx]
    return re.match(r'[ \t]*', seg).group(0)


def _replace_range(src, loop, lines):
    ds = loop.seed_decl
    e0 = loop.while_end
    if src[e0:e0 + 1] == ';':
        e0 += 1
    new = '\n'.join(lines)
    if ds:
        # 删除初值声明（可能被 try{ 等块头与 while 隔开），替换整个状态机
        return src[:ds[0]] + src[ds[1]:loop.while_start] + new + src[e0:]
    return src[:loop.while_start] + new + src[e0:]


PURE_EXIT = re.compile(r'^(return|throw)\b')


def _try_no_seed(src, m):
    """初值声明缺失：枚举 (入口, 出口) 组合；入口无关且结果唯一（或唯一非空且为纯 return/<throw>）时采用。"""
    vals = switch_const_labels(src, m)
    if not vals:
        return None
    indent = line_indent(src, m.start())
    found = {}
    ent_ok = set()
    for ent in vals:
        for tl in list(vals) + [None]:
            try:
                loop = Loop(src, m, entry=ent, tail_state=tl)
                states = build_cfg(loop)
                if ent not in states:
                    continue
                r = Renderer(loop, states, indent)
                txt = '\n'.join(r.render()).strip()
            except Unresolvable:
                continue
            except Exception:
                continue
            found.setdefault(txt, loop)
            ent_ok.add(ent)
    if not found or len(ent_ok) != len(set(vals)):
        return None
    if len(found) == 1:
        txt = next(iter(found))
    else:
        # 允许“空 / 纯 return”的差异（不可达桩）
        nonempty = [t for t in found if t]
        if len(nonempty) != 1:
            return None
        txt = nonempty[0]
        lines = [ln.strip() for ln in txt.split('\n') if ln.strip()]
        if not lines or not all(PURE_EXIT.match(ln) and ln.endswith(';') for ln in lines):
            return None
    loop = found[txt]
    return _replace_range(src, loop, txt.split('\n'))


def try_deflate(src, stats):
    """一轮：处理最靠后（最内层）的可处理状态机，返回新文本或 None。"""
    matches = list(HEAD.finditer(src))
    if not matches:
        return None
    for i in range(len(matches) - 1, -1, -1):
        m = matches[i]
        try:
            loop = Loop(src, m)
            states = build_cfg(loop)
            if loop.entry() not in states:
                raise Unresolvable('entry missing')
            r = Renderer(loop, states, line_indent(src, loop.while_start))
            lines = r.render()
            out = _replace_range(src, loop, lines)
            stats['ok'] += 1
            return out
        except Unresolvable as ex:
            if str(ex) == 'no seed':
                out = _try_no_seed(src, m)
                if out is not None:
                    stats['ok'] += 1
                    stats['inferred'] = stats.get('inferred', 0) + 1
                    return out
            continue
        except Exception as ex:
            stats.setdefault('exc', []).append('%s: %s' % (type(ex).__name__, ex))
            continue
    return None


def deflate_file(src, max_rounds=20000):
    stats = {'ok': 0, 'exc': []}
    rounds = 0
    while rounds < max_rounds:
        rounds += 1
        out = try_deflate(src, stats)
        if out is None:
            break
        src = out
    stats['remaining'] = len(list(HEAD.finditer(src)))
    if stats['ok']:
        src = final_cleanup(reindent(src))
    return src, stats
