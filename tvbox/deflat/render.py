"""把已解析的平坦化状态机渲染成结构化 Java 语句（树 -> 缩进文本）。"""
import re

from cff import successors, Unresolvable


class Node(object):
    __slots__ = ('kind', 'lines', 'children', 'cond', 'label', 'a', 'b')

    def __init__(self, kind, **kw):
        self.kind = kind          # 'seq' | 'lines' | 'if' | 'loop' | 'exit' | 'cont'
        self.lines = kw.get('lines', [])
        self.children = kw.get('children', [])
        self.cond = kw.get('cond')
        self.label = kw.get('label')
        self.a = kw.get('a')
        self.b = kw.get('b')


class Renderer(object):
    def __init__(self, loop, states, base_indent):
        self.loop = loop
        self.states = states
        self.base = base_indent
        self.budget = 600
        self.cycles = self._headers()
        seed = loop.seed if loop.seed is not None else loop.while_start
        self.label = 'cff%d' % (abs(seed) % 100000)
        self.need_label = False

    def _headers(self):
        out = set()
        for v in list(self.states):
            seen = set()
            stack = [t for t in successors(self.states[v]['flow']) if t in self.states]
            found = False
            while stack:
                x = stack.pop()
                if x == v:
                    found = True
                    break
                if x in seen:
                    continue
                seen.add(x)
                for t in successors(self.states[x]['flow']):
                    if t in self.states:
                        stack.append(t)
            if found:
                out.add(v)
        return out

    # ---------------- 文本 ----------------
    def _text(self, spans):
        lines = []
        for s, e in spans:
            for ln in self.loop.src[s:e].split('\n'):
                ln = ln.strip()
                if ln:
                    lines.append(ln)
        return lines

    def render(self):
        entry = self.loop.entry()
        root = self.emit_block(entry, [], set())
        lines = []
        self.write(root, lines, self.base, True)
        self.strip_empty_blocks(lines)
        if self.need_label:
            pad = self.base + '    '
            inner = [pad + l if l.strip() else l for l in lines]
            lines = [self.base + '%s: {' % self.label] + inner + [self.base + '}']
        return lines

    def strip_empty_blocks(self, lines):
        """删掉空 if 分支：连续出现的 '}' + '} else {' 之类由 builder 已避免；这里清多余的空行。"""
        out = []
        for i, l in enumerate(lines):
            if not l.strip():
                continue
            out.append(l)
        lines[:] = out

    # ---------------- 构造树 ----------------
    def emit_block(self, v, stack, loops):
        self.budget -= 1
        if self.budget < 0:
            raise Unresolvable('budget')
        blk = self.states[v]
        kids = []
        if blk['body']:
            kids.append(Node('lines', lines=self._text(blk['body'])))
        is_loop = v in self.cycles
        if is_loop:
            loops = set(loops) | {v}
            flow_node = self.emit_flow(blk['flow'], stack + [v], loops, own=v)
            lbl = 'L%d' % v
            if self._has_cont(flow_node, lbl):
                kids.append(Node('loop', label=lbl, children=[Node('seq', children=[flow_node])]))
            else:
                kids.append(flow_node)
            return Node('seq', children=kids)
        kids.append(self.emit_flow(blk['flow'], stack + [v], loops, own=v))
        return Node('seq', children=kids)

    @staticmethod
    def _has_cont(node, label):
        if node is None:
            return False
        if node.kind == 'cont':
            return node.label == label
        if node.kind == 'seq':
            return any(Renderer._has_cont(c, label) for c in node.children)
        if node.kind == 'if':
            return Renderer._has_cont(node.a, label) or Renderer._has_cont(node.b, label)
        return False

    def emit_flow(self, flow, stack, loops, own=None):
        k = flow[0]
        if k == 'exit':
            return Node('exit')
        if k == 'unres':
            raise Unresolvable('unres flow')
        if k == 'goto':
            v = flow[1]
            if v not in self.states:
                return Node('exit')
            if v == own:
                return Node('exit')
            if v in stack:
                if v in loops:
                    return Node('cont', label='L%d' % v)
                raise Unresolvable('goto into middle %s' % v)
            return self.emit_block(v, stack, loops)
        cond = flow[1]
        t_node = self.emit_branch(flow[2], stack, loops)
        f_node = self.emit_branch(flow[3], stack, loops)
        return Node('if', cond=cond, a=t_node, b=f_node)

    def emit_branch(self, branch, stack, loops):
        spans, flow = branch
        kids = []
        if spans:
            kids.append(Node('lines', lines=self._text(spans)))
        kids.append(self.emit_flow(flow, stack, loops))
        if len(kids) == 1:
            return kids[0]
        return Node('seq', children=kids)

    # ---------------- 输出 ----------------
    @staticmethod
    def falls_through(node):
        k = node.kind
        if k in ('lines',):
            return True
        if k == 'seq':
            if not node.children:
                return True
            return Renderer.falls_through(node.children[-1])
        if k == 'if':
            return Renderer.falls_through(node.a) or Renderer.falls_through(node.b)
        if k == 'loop':
            return False
        return False  # exit / cont

    def write(self, node, out, indent, is_tail):
        k = node.kind
        if k == 'lines':
            for l in node.lines:
                out.append(indent + l)
            return
        if k == 'seq':
            kids = node.children
            dead = False
            for i, c in enumerate(kids):
                if dead:
                    continue
                before = len(out)
                self.write(c, out, indent, is_tail and (i == len(kids) - 1))
                emitted = out[before:]
                if emitted:
                    last = emitted[-1].strip()
                    if re.match(r'^(return|throw|break|continue)\b', last) and last.endswith(';'):
                        dead = True
            return
        if k == 'exit':
            if not is_tail:
                self.need_label = True
                out.append(indent + 'break %s;' % self.label)
            return
        if k == 'cont':
            out.append(indent + 'continue %s;' % node.label)
            return
        if k == 'loop':
            out.append(indent + '%s: while (true) {' % node.label)
            for c in node.children:
                self.write(c, out, indent + '    ', False)
            out.append(indent + '}')
            return
        if k == 'if':
            cond = node.cond.strip()
            save = self.need_label
            ta = []
            self.write(node.a, ta, indent + '    ', is_tail)
            na = self.need_label
            self.need_label = save
            tb = []
            self.write(node.b, tb, indent + '    ', is_tail)
            nb = self.need_label
            if not ta:
                self.need_label = save
            if not tb:
                self.need_label = save
            a_empty = not ta
            b_empty = not tb
            if a_empty and b_empty:
                return
            if b_empty:
                out.append(indent + 'if (%s) {' % cond)
                out.extend(ta)
                out.append(indent + '}')
                self.need_label = na
                return
            if a_empty:
                out.append(indent + 'if (%s) {' % self._neg(cond))
                out.extend(tb)
                out.append(indent + '}')
                self.need_label = nb
                return
            out.append(indent + 'if (%s) {' % cond)
            out.extend(ta)
            out.append(indent + '} else {')
            out.extend(tb)
            out.append(indent + '}')
            self.need_label = na or nb
            return
        raise Unresolvable('bad node')

    @staticmethod
    def _empty(node):
        k = node.kind
        if k == 'lines':
            return not node.lines
        if k == 'seq':
            return all(Renderer._empty(c) for c in node.children)
        if k == 'if':
            return Renderer._empty(node.a) and Renderer._empty(node.b)
        return False

    @staticmethod
    def _neg(cond):
        c = cond.strip()
        if c.startswith('!'):
            inner = c[1:].lstrip()
            if inner.startswith('('):
                close = inner.find(')')
                # 找到与首个 '(' 配对的 ')'，且它是最后一个字符
                depth = 0
                for i, ch in enumerate(inner):
                    if ch == '(':
                        depth += 1
                    elif ch == ')':
                        depth -= 1
                        if depth == 0 and i == len(inner) - 1:
                            return inner[1:-1].strip()
                        if depth == 0:
                            break
            elif re.fullmatch(r'[\w$.]+(\s*\.\s*[\w$]+)*', inner):
                return inner
        return '!(%s)' % c
