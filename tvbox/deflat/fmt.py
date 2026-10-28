"""全局重排缩进（基于花括号，忽略字符串/注释）+ 收尾清理。"""
import re

DEAD_GUARD = re.compile(r'^\s*int\s+(\w+)\s*=\s*\(?-?\d+\)?\s*\^\s*C\d+\.f\d+\s*;\s*$')


def final_cleanup(src):
    """删除全文只出现一次的 OLLVM 死状态变量声明，并压缩连续空行。"""
    lines = src.split('\n')
    dead = set()
    for i, l in enumerate(lines):
        m = DEAD_GUARD.match(l)
        if m and len(re.findall(r'\b' + re.escape(m.group(1)) + r'\b', src)) == 1:
            dead.add(i)
    out = []
    blank = 0
    for i, l in enumerate(lines):
        if i in dead:
            continue
        if not l.strip():
            blank += 1
            if blank > 1:
                continue
        else:
            blank = 0
        out.append(l.rstrip())
    return '\n'.join(out)



def _scan(line):
    """返回 (opens, closes, leading_closers)，忽略字符串与注释。"""
    opens = closes = 0
    i = 0
    n = len(line)
    lead = 0
    counting_lead = True
    strmode = None
    while i < n:
        c = line[i]
        if strmode:
            if c == '\\':
                i += 2
                continue
            if c == strmode:
                strmode = None
            i += 1
            continue
        if c == '"' or c == "'":
            strmode = c
            counting_lead = False
            i += 1
            continue
        if c == '/' and i + 1 < n and line[i + 1] == '/':
            counting_lead = False
            break
        if c == '/' and i + 1 < n and line[i + 1] == '*':
            counting_lead = False
            j = line.find('*/', i + 2)
            i = n if j < 0 else j + 2
            continue
        if c in '{([':
            opens += 1
            counting_lead = False
        elif c in '})]':
            closes += 1
            if counting_lead:
                lead += 1
        elif not c.isspace():
            counting_lead = False
        i += 1
    return opens, closes, lead


def reindent(src, unit='    '):
    out = []
    depth = 0
    extra = 0
    in_case = False
    lines = src.split('\n')
    for raw in lines:
        line = raw.strip()
        if not line:
            out.append('')
            continue
        is_case = line.startswith('case ') or line.startswith('default:')
        if line.startswith('/*') or line.startswith('*') or line.startswith('//'):
            # 注释保持与下一/上一行相同的层级
            out.append(unit * max(depth + extra if in_case else depth, 0) + line)
            continue
        if is_case:
            in_case = True
            extra = 0
            out.append(unit * max(depth, 0) + line)
            extra = 1
            continue
        opens, closes, lead = _scan(line)
        indent = depth - lead
        if line.endswith(':') and lead == 0 and opens == 0 and closes == 0:
            indent = max(indent - 1, 0)
        out.append(unit * max(indent, 0) + line)
        depth += opens - closes
        if depth < 0:
            depth = 0
        if closes and not opens and extra:
            extra = 0
            in_case = False
    return '\n'.join(out)
