# -*- coding: utf-8 -*-
"""
单遍、线性：删除已无调用的 short[] 字符串表 accessor 方法，再删除随之无引用的 short[] 字段。
- 用括号配对定位方法体（不做可能回溯爆炸的贪婪正则）。
- 只删：返回类型为 short[]、方法体内引用了 fNNshort、且方法名在全文无其它调用 的方法。
"""
import os, re, io, sys
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding="utf-8")
SP = r"decompiled/response/src_clean/sources/com/github/catvod/spider"

def match_brace(src, i):
    d = 0
    while i < len(src):
        if src[i] == '{': d += 1
        elif src[i] == '}':
            d -= 1
            if d == 0: return i
        i += 1
    return -1

# 方法签名起点（含修饰符），捕获 short[] name(
sig = re.compile(r"(?m)^[ \t]*(?:public|private|protected|static|final|synchronized|@\w+|[ \t])*?\bstatic\b[^\n;{}]*?\bshort\[\]\s+(\w+)\s*\(")
# 字段： short[] NAME = { ... };  （跨行）
fld_start = re.compile(r"\bshort\[\]\s+(\w+)\s*=\s*\{")

def called(src, name):
    # 方法名( 的调用（定义处是 short[] name(，不算调用）
    cnt = 0
    for m in re.finditer(r"(?<![\w$])" + re.escape(name) + r"\s*\(", src):
        seg = src[max(0, m.start()-40):m.start()]
        if "short[]" in seg:   # 这是定义
            continue
        cnt += 1
    return cnt

def strip_dead_short_locals(src):
    """删除 short[] 局部变量：若该变量只被赋值（= xxx）、从未在右侧/参数中被读取。
    处理声明 `short[] NAME = null;` 与赋值 `NAME = <expr>;`（整行/整语句移除）。"""
    changed = 0
    # 候选局部名：short[] NAME = ...（含 = null / = accessor()）
    locals_ = set(re.findall(r"\bshort\[\]\s+(\w+)\s*[;=]", src))
    for name in list(locals_):
        # 读取出现：排除 声明 / 赋值左值 / “short[] 变量间互赋值”的右值
        read = 0
        for m in re.finditer(r"(?<![\w$])" + re.escape(name) + r"(?![\w$])", src):
            pre = src[:m.start()].rstrip()
            post = src[m.end():].lstrip()
            is_decl = pre.endswith("short[]")
            is_lhs = post.startswith("=") and not post.startswith("==")
            if is_decl or is_lhs:
                continue
            # 所在语句若形如  <shortLocal> = name ;  则只是局部互赋值，不算读
            ls = src.rfind("\n", 0, m.start())+1
            le = src.find(";", m.end())
            stmt = src[ls: le if le >= 0 else m.end()].strip()
            mm = re.fullmatch(r"(\w+)\s*=\s*" + re.escape(name), stmt)
            if mm and mm.group(1) in locals_:
                continue
            read += 1
        if read == 0:
            src2 = src
            # 删除声明语句（整行）： short[] name = null;  或  short[] name = fNNshort/accessor();
            src2 = re.sub(r"^[ \t]*short\[\]\s+" + re.escape(name) +
                          r"\s*=\s*[^;{}]*;\s*\r?\n?", "", src2, flags=re.M)
            # 删除赋值语句（整行）： name = <不含 ; { } 的表达式>;
            src2 = re.sub(r"^[ \t]*" + re.escape(name) +
                          r"\s*=\s*[^;{}]*;\s*\r?\n?", "", src2, flags=re.M)
            if src2 != src:
                src = src2; changed += 1
    return src, changed

tot = {"locals": 0, "methods": 0, "fields": 0}
for fn in sorted(os.listdir(SP)):
    if not fn.endswith(".java"): continue
    p = os.path.join(SP, fn)
    src = open(p, encoding="utf-8").read()

    # 迭代到稳定：死局部 -> 无调用 accessor -> 无引用字段
    for _ in range(20):
        before = src
        src, c = strip_dead_short_locals(src)
        if c: tot["locals"] += c

        # 删除无调用的 short[] accessor 方法
        spans = []
        for m in sig.finditer(src):
            name = m.group(1)
            brace = src.find("{", m.end())
            end = match_brace(src, brace)
            if end < 0: continue
            body = src[m.start():end+1]
            if re.search(r"\bf\d+short\b", body) and called(src, name) == 0:
                ls = src.rfind("\n", 0, m.start()) + 1
                cut = ls
                while True:  # 吞并紧邻的 @注解 / 块注释 / renamed 行
                    head = src[:cut].rstrip()
                    line = head[head.rfind("\n")+1:].strip()
                    if line.startswith("@") or (line.startswith("/*") and "renamed" in line):
                        cut = head.rfind("\n")+1; continue
                    break
                spans.append((cut, end+1))
        for s, e in sorted(spans, reverse=True):
            src = src[:s] + src[e:]; tot["methods"] += 1

        # 删除无引用 short[] 字段
        m0 = fld_start.search(src)
        if m0:
            name = m0.group(1)
            rest = src[:m0.start()] + src[m0.end():]
            if not re.search(r"(?<![\w$])" + re.escape(name) + r"(?![\w$])", rest):
                bo = src.find("{", m0.end()-1)
                bc = match_brace(src, bo)
                semi = src.find(";", bc)
                if semi >= 0:
                    ls = src.rfind("\n", 0, m0.start()) + 1
                    cut = ls
                    head = src[:cut].rstrip()
                    line = head[head.rfind("\n")+1:].strip()
                    if line.startswith("/*") and line.endswith("*/"):
                        cut = head.rfind("\n")+1
                    src = src[:cut] + src[semi+1:]; tot["fields"] += 1

        if src == before:
            break
    src = re.sub(r"\n{3,}", "\n\n", src)
    open(p, "w", encoding="utf-8").write(src)
print(tot)
