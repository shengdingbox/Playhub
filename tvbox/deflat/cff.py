"""识别和解析数值型控制流平坦化状态机：while(true){ v ^= K; switch(v){ case ... } ... }"""
import re

from jutil import (
    find_close,
    skip_ws,
    strip_comments,
    split_cases,
    split_statements,
    _word_at,
)

HEAD = re.compile(r'while \(true\) \{\s*\n?\s*(\w+) \^= (-?\d+);\s*\n?\s*switch \(\1\) \{')


class Unresolvable(Exception):
    pass


def _find_seed(src, while_start, var):
    """向前查找 `[int] var = N;` 初值声明（可跨过 try{ / { 等块头行）。"""
    pat = re.compile(r'(?:int\s+)?' + re.escape(var) + r'\s*=\s*(-?\d+)\s*;')
    pos = while_start
    while True:
        nl = src.rfind('\n', 0, pos)
        if nl < 0:
            return None
        line_start = nl + 1
        line = src[line_start:pos]
        stripped = strip_comments(line).strip()
        if stripped.endswith('{'):
            if '}' in stripped:
                return None
            pos = line_start
            continue
        if not stripped:
            # 空行/注释行：跳过（pos 已在行首时退一格跳过换行符）
            pos = nl if line_start >= pos else line_start
            continue
        m = re.search(pat.pattern + r'[ \t]*$', line)
        if m:
            return (line_start + m.start(), line_start + m.end(), int(m.group(1)))
        return None


def _const(expr):
    expr = expr.strip()
    if re.fullmatch(r'-?\d+', expr):
        return int(expr)
    return None


class Loop(object):
    def __init__(self, src, m, entry=None, tail_state=None):
        self.src = src
        self.m = m
        self.entry_override = entry
        self.tail_state_override = tail_state
        self.var = m.group(1)
        self.key = int(m.group(2))
        # while(true) 的 '{'
        brace = src.index('{', m.start() + len('while (true)'))
        self.while_start = m.start()
        self.body_start = brace + 1
        self.body_end = find_close(src, brace)
        if self.body_end < 0:
            raise Unresolvable('unbalanced while')
        self.while_end = self.body_end + 1
        sw = src.index('switch', m.start(), self.body_end)
        sb = src.index('{', sw)
        self.sw_body = (sb + 1, find_close(src, sb))
        if self.sw_body[1] < 0:
            raise Unresolvable('unbalanced switch')
        self.sw_end = self.sw_body[1] + 1
        self.tail = (self.sw_end, self.body_end)
        self.seed = None
        self.seed_decl = None
        self.tail_value = None
        self.cases = None
        self.stmt_end = None  # 包含 while 语句自身的结束（可能带分号）
        self._parse_seed_tail()

    def _parse_seed_tail(self):
        found = _find_seed(self.src, self.while_start, self.var)
        if found is None:
            if self.entry_override is None:
                raise Unresolvable('no seed')
            self.seed_decl = None
            self.seed = None
            self.seed_stmt_span = (self.while_start, self.while_start)
        else:
            self.seed_decl = (found[0], found[1])
            self.seed = found[2]
            self.seed_stmt_span = (found[0], self.while_start)
        tail_txt = strip_comments(self.src[self.tail[0]:self.tail[1]]).strip()
        if not tail_txt:
            self.tail_value = None
        else:
            t = re.fullmatch(re.escape(self.var) + r'\s*=\s*(-?\d+)\s*;', tail_txt)
            if not t:
                raise Unresolvable('weird tail: %r' % tail_txt[:60])
            self.tail_value = int(t.group(1))

    def case_map(self):
        """返回 {label: (labels, body_start, body_end)}"""
        if self.cases is None:
            self.cases = split_cases(self.src, self.sw_body[0], self.sw_body[1])
        return self.cases

    def entry(self):
        if self.entry_override is not None:
            return self.entry_override
        return self.seed ^ self.key

    def tail_state(self, label):
        if self.tail_state_override is not None:
            return self.tail_state_override
        if self.tail_value is not None:
            return self.tail_value ^ self.key
        return label ^ self.key

    def label_values(self):
        vals = []
        for labels, bs, be in self.case_map():
            for lb in labels:
                if lb == 'default':
                    continue
                v = _const(lb)
                if v is None:
                    raise Unresolvable('non-const label ' + lb)
                vals.append(v)
        return vals


def switch_const_labels(src, m):
    """解析状态机 switch 的全部 case 常量值（不依赖 seed）。"""
    brace = src.index('{', m.start() + len('while (true)'))
    body_end = find_close(src, brace)
    if body_end < 0:
        return None
    try:
        sw = src.index('switch', m.start(), body_end)
        sb = src.index('{', sw)
    except ValueError:
        return None
    se = find_close(src, sb)
    if se < 0:
        return None
    out = []
    for labels, bs, be in split_cases(src, sb + 1, se):
        for lb in labels:
            if lb == 'default':
                continue
            v = _const(lb)
            if v is None:
                return None
            out.append(v)
    return out


# ---------------- 流分析 ----------------

ASSIGN_RE_CACHE = {}


def analyze_seq(src, stmts, ctx):
    """返回 (body_spans, flow)；flow ∈ ('goto',v)/('exit',)/('if',cond,f1,f2)"""
    body = []
    last_assign = None
    term = None
    if_flow = None
    for idx, (s, e) in enumerate(stmts):
        t = strip_comments(src[s:e]).strip()
        if not t:
            continue
        w = _word_at(t, 0, len(t))
        m = re.fullmatch(re.escape(ctx['var']) + r'\s*=\s*(.*);', t, re.S)
        if m:
            last_assign = m.group(1).strip()
            rest = [strip_comments(src[a:b]).strip() for a, b in stmts[idx + 1:]]
            rest = [r for r in rest if r]
            if rest:
                kinds = [_term_kind(r) for r in rest]
                if all(k is not None for k in kinds):
                    term = kinds[0]
                else:
                    raise Unresolvable('assign followed by code')
            break
        if w == 'return' or w == 'throw':
            body.append((s, e))
            term = 'exit'
            break
        if t == 'break;':
            term = 'break'
            break
        if t == 'continue;':
            term = 'continue'
            break
        if w == 'if':
            is_last = idx == len(stmts) - 1
            if not (is_last and looks_like_dispatcher(src[s:e], ctx['var'])):
                # 业务 if（多由内层状态机还原而来），不属于分发控制流
                body.append((s, e))
                continue
            cond, b1, b2 = parse_if(src, s, e)
            sub = dict(ctx)
            sub['tail_state'] = ctx['tail_state']
            bd1, f1 = analyze_seq(src, b1, sub)
            if b2 is None:
                bd2, f2 = [], ('goto', ctx['tail_state'])
            else:
                bd2, f2 = analyze_seq(src, b2, sub)
            if_flow = ('if', cond, (bd1, f1), (bd2, f2))
            term = 'if'
            break
        body.append((s, e))
    if term == 'exit':
        return body, ('exit',)
    if term == 'if':
        return body, if_flow
    if last_assign is not None:
        tm = split_ternary(last_assign)
        if tm:
            c, a, b = tm
            return body, ('if', c, ([], ('goto', _st(ctx, a))), ([], ('goto', _st(ctx, b))))
        if term != 'continue' and ctx['tail_value'] is not None:
            return body, ('goto', ctx['tail_state'])
        return body, ('goto', _st(ctx, last_assign))
    # 未赋值
    if term == 'continue':
        return body, ('goto', ctx['label'] ^ ctx['key'])
    if ctx['tail_value'] is not None:
        return body, ('goto', ctx['tail_state'])
    return body, ('goto', ctx['label'] ^ ctx['key'])


DISPATCH_RE = None


def _term_kind(text):
    """若该语句是纯控制流终结语句，返回其类型。"""
    t = text.strip()
    if t == 'break;':
        return 'break'
    if t == 'continue;':
        return 'continue'
    if re.match(r'^(return|throw)\b.*;$', t, re.S):
        return 'exit'
    return None


def looks_like_dispatcher(text, var):
    """判别一条 if 语句是否属于分发器（内含 break/continue/return/throw/状态赋值）。"""
    t = strip_comments(text)
    pat = re.compile(r'\b(break|continue)\s*;|\breturn\b|\bthrow\b|\b' + re.escape(var) + r'\s*=')
    return pat.search(t) is not None


def _st(ctx, expr):
    v = _const(expr) if isinstance(expr, str) else expr
    if v is None:
        raise Unresolvable('bad state expr')
    return v ^ ctx['key']


def split_ternary(expr):
    """拆分最外层三元表达式 'c ? a : b'，非三元或含嵌套三元返回 None。"""
    depth = 0
    q = -1
    c = -1
    i = 0
    n = len(expr)
    strmode = None
    while i < n:
        ch = expr[i]
        if strmode:
            if ch == '\\':
                i += 2
                continue
            if ch == strmode:
                strmode = None
            i += 1
            continue
        if ch in '"\'':
            strmode = ch
        elif ch == '(':
            depth += 1
        elif ch == ')':
            depth -= 1
        elif ch == '?' and depth == 0:
            if q >= 0:
                return None
            q = i
        elif ch == ':' and depth == 0:
            if q < 0:
                continue
            if c >= 0:
                return None
            c = i
        i += 1
    if q > 0 and c > q:
        return expr[:q].strip(), expr[q + 1:c].strip(), expr[c + 1:].strip()
    return None


def parse_if(src, s, e):
    """解析一条 if 语句 → (cond, [stmts1], [stmts2]|None)"""
    try:
        lp = src.index('(', s, e)
    except ValueError:
        raise Unresolvable('if without paren')
    rp = find_close(src, lp)
    if rp < 0:
        raise Unresolvable('if without paren 2')
    cond = strip_comments(src[lp + 1:rp]).strip()
    k = skip_ws(src, rp + 1, e)
    if k < e and src[k] == '{':
        close = find_close(src, k)
        b1 = split_statements(src, k + 1, close)
        i = close + 1
    else:
        end1 = parse_statement_end(src, k, e)
        b1 = [(k, end1)]
        i = end1
    b2 = None
    while True:
        j = skip_ws(src, i, e)
        if j >= e:
            break
        w = _word_at(src, j, e)
        if w == 'else':
            k2 = skip_ws(src, j + 4, e)
            if k2 < e and src[k2] == '{':
                close = find_close(src, k2)
                b2 = split_statements(src, k2 + 1, close)
                i = close + 1
            elif _word_at(src, k2, e) == 'if':
                sub_end = statement_end_from(src, k2, e)
                b2 = [(k2, sub_end)]
                i = sub_end
            else:
                raise Unresolvable('bad else')
            break
        if w == 'catch' or w == 'finally':
            raise Unresolvable('try in block')
        break
    return cond, b1, b2


def statement_end_from(src, i, e):
    from jutil import parse_statement
    return parse_statement(src, i, e)


def parse_statement_end(src, i, e):
    from jutil import parse_statement
    return parse_statement(src, i, e)


def build_cfg(loop):
    """返回 states: {label: {'body': spans, 'flow': flow}}"""
    states = {}
    for labels, bs, be in loop.case_map():
        if bs is None:
            for lb in labels:
                if lb == 'default':
                    continue
                lv = _const(lb)
                span, fl = [], ('unres', 'empty case')
                states[lv] = {'body': span, 'flow': fl}
            continue
        stmts = split_statements(loop.src, bs, be)
        for lb in labels:
            if lb == 'default':
                continue
            lv = _const(lb)
            if lv is None:
                raise Unresolvable('label')
            ctx = {'var': loop.var, 'key': loop.key, 'label': lv,
                   'tail_state': loop.tail_state(lv), 'tail_value': loop.tail_value}
            span, fl = analyze_seq(loop.src, stmts, ctx)
            states[lv] = {'body': span, 'flow': fl}
    return states


def reachable(states, entry):
    seen = []
    stack = [entry]
    targets = {}
    while stack:
        cur = stack.pop()
        if cur in targets:
            continue
        targets[cur] = True
        blk = states.get(cur)
        if blk is None:
            continue
        seen.append(cur)
        for t in successors(blk['flow']):
            if t not in targets:
                stack.append(t)
    return seen


def successors(flow):
    out = []

    def walk(f):
        k = f[0]
        if k == 'goto':
            out.append(f[1])
        elif k == 'if':
            walk(f[2][1])
            walk(f[3][1])
        elif k == 'exit' or k == 'unres':
            pass
    walk(flow)
    return out
