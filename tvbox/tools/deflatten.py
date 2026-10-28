# -*- coding: utf-8 -*-
"""
控制流反平坦化（保守：仅处理“直线型”方法）。

识别模式：
    String str = "<state0>";            // 方法内首次给状态变量赋初值
    ...
    while (true) {
        switch (C0002.m76(str)) {       // C0002.m76(x) == x.hashCode()
            case H1: <纯语句...>; str = "<next1>"; break;
            ...
            default: <纯语句...>; str = "<nextD>"; break;
        }
    }

保守条件（不满足则跳过该方法）：
  - 方法体内无 for；
  - case/default 体内无 if/for/while/switch/continue；
  - case 体以一个 return 结束视为终止块（允许 0..1 个 return）；
  - 状态串 -> hashCode 能命中 case 值或 default，且链不出现环。

处理：按 hashCode 链把 case 语句重排为线性代码，删除状态机脚手架。
"""
import os, re, io, sys
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding="utf-8")
SP = r"decompiled/response/src_clean/sources/com/github/catvod/spider"

def jhash(s):
    h = 0
    for c in s:
        h = (31*h + ord(c)) & 0xffffffff
    return h - 0x100000000 if h >= 0x80000000 else h

def match_brace(src, i):
    d = 0
    while i < len(src):
        if src[i] == '{': d += 1
        elif src[i] == '}':
            d -= 1
            if d == 0: return i
        i += 1
    return -1

disp_re = re.compile(
    r"while\s*\(\s*true\s*\)\s*\{\s*switch\s*\(\s*C0002\.m76\((\w+)\)\s*\)\s*\{")
case_head = re.compile(r"case\s+(-?\d+)\s*:")
sig_re = re.compile(r"((?:public|private|protected|static|final|synchronized|\s)+[\w\.\[\]<>,\s]+?)\s(\w+)\s*\(([^;{}]*)\)\s*\{")

Q = '"'  # 单引号常量，避免字符串嵌套问题

def clean_case(txt, statevar):
    """解析一个 case/default 块 -> (语句列表, 下一状态串或 None, 是否 return 终止)。"""
    nxt_pat = re.compile(r'\b' + re.escape(statevar) + r'\s*=\s*"([^"]*)"\s*;')
    nexts = nxt_pat.findall(txt)
    nxt = nexts[-1] if nexts else None
    t = nxt_pat.sub("", txt)
    t = re.sub(r"\bbreak\s*;", "", t)
    stmts = [x.strip() for x in t.splitlines() if x.strip()]
    isret = any(re.match(r"return\b", x) for x in stmts)
    return stmts, nxt, isret

def parse_cases(swbody, statevar):
    heads = list(case_head.finditer(swbody))
    dm = re.search(r"\bdefault\s*:", swbody)
    marks = [(h.start(), h.end(), int(h.group(1))) for h in heads]
    if dm:
        marks.append((dm.start(), dm.end(), "__default__"))
    marks.sort()
    cases = {}
    default = None
    for k, (s, e, val) in enumerate(marks):
        end = marks[k+1][0] if k+1 < len(marks) else len(swbody)
        txt = swbody[e:end]
        stmts, nxt, isret = clean_case(txt, statevar)
        if val == "__default__":
            default = (stmts, nxt, isret)
        else:
            cases[val] = (stmts, nxt, isret)
    return cases, default

def try_deflatten_method(src, disp_m):
    """返回 (status, payload)。status: OK / SKIP / None(结构不完整)。"""
    statevar = disp_m.group(1)
    # switch 体范围
    swb = src.find("{", disp_m.end()-1)
    swe = match_brace(src, swb)
    if swe < 0:
        return None
    # 外层 while 的结束（switch 结束后的 '}'）
    wclose = src.find("}", swe+1)
    if wclose < 0:
        return None
    # 向前找方法签名
    pre = src[:disp_m.start()]
    sigm = None
    for sm in sig_re.finditer(pre):
        sigm = sm
    if sigm is None:
        return None
    mb = src.find("{", sigm.end()-1)
    me = match_brace(src, mb)
    mbody = src[mb+1:me]

    # 安全检查：方法体内不允许 for（业务循环信号）
    if re.search(r"\bfor\s*\(", mbody):
        return ("SKIP", "for-loop")

    cases, default = parse_cases(src[swb+1:swe], statevar)
    for val, (stmts, nxt, isret) in cases.items():
        joined = " ".join(stmts)
        if re.search(r"\b(if|for|while|switch|continue)\b", joined):
            return ("SKIP", "branch-in-case:%d" % val)
    if default is not None:
        ds, dn, dret = default
        if re.search(r"\b(if|for|while|switch|continue)\b", " ".join(ds)):
            return ("SKIP", "branch-in-default")
    else:
        ds, dn, dret = [], None, False

    # 入口状态：方法体内 statevar 首次赋字符串
    im = re.search(r'\b' + re.escape(statevar) + r'\s*=\s*"([^"]*)"\s*;', mbody)
    if not im:
        return ("SKIP", "no-init")
    # 初值必须出现在 switch 之前（在 mbody 的 disp 之前）
    if mbody.find(im.group(0)) > (disp_m.start() - mb - 1):
        return ("SKIP", "init-inside")

    entry = jhash(im.group(1))
    order = []
    cur = entry
    seen = set()
    guard = 0
    while guard < 5000:
        guard += 1
        if cur is not None and cur in cases:
            if cur in seen:
                return ("SKIP", "cycle")
            seen.add(cur)
            stmts, nxt, isret = cases[cur]
            order.extend(stmts)
            if isret:
                return ("OK", (order, mb, me+1, sigm.group(0)))
            tgt = jhash(nxt) if nxt is not None else None
            cur = tgt  # 若不命中 case，下一轮自然落入 default 分支
        elif default is not None:
            if "__default__" in seen:
                return ("SKIP", "default-cycle")
            seen.add("__default__")
            order.extend(ds)
            if dret:
                return ("OK", (order, mb, me+1, sigm.group(0)))
            cur = jhash(dn) if dn is not None else None
            if cur is None:
                return ("SKIP", "dangling-in-default")
        else:
            return ("SKIP", "no-case-for-entry")
    return ("SKIP", "iter-limit")

def apply_deflatten(path, dry=False):
    src = open(path, encoding="utf-8").read()
    done = 0
    skipped = {}
    while True:
        replaced = False
        for m in list(disp_re.finditer(src)):
            r = try_deflatten_method(src, m)
            if r is None:
                continue
            if r[0] == "SKIP":
                key = r[1].split(":")[0]
                skipped[key] = skipped.get(key, 0) + 1
                continue
            order, mb, me, sigtext = r[1]
            if not order:
                continue
            # 计算分发块范围：while(true){ switch(){...} }
            swb = src.find("{", m.end()-1)
            swe = match_brace(src, swb)
            while_close = src.find("}", swe+1) + 1  # while 的 '}'
            # 方法体起点 mb（'{'），前言 = (mb+1 .. m.start())
            prologue = src[mb+1:m.start()]
            # while 结束后到方法体 '}' 前只允许空白
            rest = src[while_close:me-1]
            if rest.strip():
                skipped["tail-content"] = skipped.get("tail-content", 0) + 1
                continue
            # 前言里删掉状态变量的声明/初始化（String str = "..."），已无意义
            statevar = m.group(1)
            prologue2 = re.sub(
                r"^[ \t]*(?:final\s+)?String\s+" + re.escape(statevar) +
                r'\s*=\s*"[^"]*"\s*;[ \t]*\r?\n', '', prologue, flags=re.M)
            body = prologue2
            body += "        // [deflattened] 控制流平坦化已还原为线性代码\n"
            for s in order:
                body += "        " + s + "\n"
            # dry 也替换内存（否则外层循环反复命中同一处），只是不写文件
            src = src[:mb+1] + body + src[me-1:]
            done += 1
            replaced = True
            break
        if not replaced:
            break
    if not dry and done:
        open(path, "w", encoding="utf-8").write(src)
    return done, skipped

if __name__ == "__main__":
    only = sys.argv[1] if len(sys.argv) > 1 else None
    dry = "--dry" in sys.argv
    total = 0
    allskip = {}
    for fn in sorted(os.listdir(SP)):
        if not fn.endswith(".java") or re.fullmatch(r"C0\d{3}", fn[:-5]):
            continue
        if only and only not in fn:
            continue
        d, sk = apply_deflatten(os.path.join(SP, fn), dry=dry)
        if d or sk:
            print("%-22s deflattened=%d skip=%s" % (fn, d, sk))
        total += d
        for k, v in sk.items():
            allskip[k] = allskip.get(k, 0) + v
    print("TOTAL deflattened:", total)
    print("SKIP reasons:", allskip)
