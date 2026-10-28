# -*- coding: utf-8 -*-
"""
稳健的常量守卫折叠（每个方法体内迭代，直到没有可折叠 if）。

只处理形态：
    if (VAR OP NUM) { THEN } [else { ELSE }]
其中 VAR 在该方法内是  int VAR = <可常量折叠表达式>; 且之后未被重新赋值。
恒真→替换为 THEN；恒假→替换为 ELSE（无 else 则整体删除）。

不处理嵌套 if 的条件（条件里含 if 的方法调用等不做）。
"""
import os, re, io, sys, glob
if sys.stdout and hasattr(sys.stdout, "buffer"):
    try:
        sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding="utf-8")
    except Exception:
        pass

FIELDS = {}

def load_fields(sp):
    # sp 是 spider/ 目录；同时加载 spider/C0*.java、spider/merge/C0*.java、
    # 以及同级的 parser/C0*.java（C0000-C00xx 分布在这三个包）
    import glob as _g
    roots = [sp, os.path.join(sp, "merge"),
             os.path.join(os.path.dirname(sp.rstrip("/\\")), "parser")]
    for root in roots:
        for p in _g.glob(os.path.join(root, "C0*.java")):
            cls = os.path.basename(p)[:-5]
            for m in re.finditer(r"\b(f\w+)\s*=\s*(-?\d+)\s*;",
                                 open(p, encoding="utf-8").read()):
                FIELDS["%s.%s" % (cls, m.group(1))] = int(m.group(2))

def const_xor(expr, table):
    expr = expr.strip()
    if re.fullmatch(r"-?\d+", expr): return int(expr)
    m = re.fullmatch(r"\(?(-?\d+)\)?\s*\^\s*(C\w+)\.(f\w+)", expr)
    if m:
        k = "%s.%s" % (m.group(2), m.group(3))
        if k in FIELDS: return int(m.group(1)) ^ FIELDS[k]
    m = re.fullmatch(r"(C\w+)\.(f\w+)", expr)
    if m and ("%s.%s" % (m.group(1), m.group(2))) in FIELDS:
        return FIELDS["%s.%s" % (m.group(1), m.group(2))]
    if expr in table: return table[expr]
    return None

def cmpv(a, op, b):
    return {"<": a < b, ">": a > b, "<=": a <= b, ">=": a >= b, "==": a == b, "!=": a != b}[op]

def match_brace(s, i):
    d = 0
    while i < len(s):
        if s[i] == '{': d += 1
        elif s[i] == '}':
            d -= 1
            if d == 0: return i
        i += 1
    return -1

sig_re = re.compile(
    # 语句边界起锚（避免长文本上每字符都尝试匹配导致灾难性回溯）；
    # 普通方法： mods type name(args) { ；构造器： mods name(args) {（无返回类型）
    r"(?m)(?:^|[;}])\s*"
    r"(?:@\w+(?:\([^)]*\))?\s*)*"
    r"(?:(?:public|private|protected|static|final|synchronized|native|abstract|strictfp)\s+)*"
    r"(?:[\w.$\[\]<>,]+[ \t]+)?"
    r"(\w+)\s*\(([^;{}]*)\)\s*\{")
cond_re = re.compile(r"\bif\s*\(\s*(\w+)\s*(<|>|<=|>=|==|!=)\s*(-?\d+)\s*\)\s*\{")

def fold_body(body):
    """返回 (新body, 折叠数)。body 是方法体内容（不含外层 {}）。"""
    table = {}
    for dm in re.finditer(r"\bint\s+(\w+)\s*=\s*([^;]+);", body):
        v = const_xor(dm.group(2), table)
        if v is not None:
            table[dm.group(1)] = v
    # 删除之后被重新赋值的变量
    for name in list(table):
        n = len(re.findall(r"(?<![\w<>=!])" + re.escape(name) + r"\s*=[^=]", body))
        if n > 1:
            table.pop(name, None)
    if not table:
        return body, 0
    folded = 0
    out = body
    # 单遍：候选 if 位置在 body 上一次算好，从后往前替换（前面的偏移不受影响）
    for m in reversed(list(cond_re.finditer(body))):
        var, op, num = m.group(1), m.group(2), int(m.group(3))
        if var not in table:
            continue
        cond = cmpv(table[var], op, num)
        s = m.start()
        bo = m.end() - 1          # cond_re 末尾就是 '{'
        bc = match_brace(out, bo)
        if bc < 0:
            continue
        then_b = out[bo+1:bc]
        rest = out[bc+1:]
        else_b = None
        em = re.match(r"\s*else\s*\{", rest)
        if em:
            eo = bc + 1 + rest.find("{")
            ec = match_brace(out, eo)
            if ec < 0:
                continue
            else_b = out[eo+1:ec]
            after = out[ec+1:]
        else:
            after = rest
        keep = then_b if cond else (else_b if else_b is not None else "")
        out = out[:s] + keep + after
        folded += 1
    return out, folded

def process_file(path):
    src = open(path, encoding="utf-8").read()
    if "if" not in src:      # 无 if 必无可折叠守卫，直接跳过（大文件剪枝）
        return 0
    total = 0
    # 每轮把所有"互不嵌套"的方法一起折叠，从后往前替换（偏移安全）；
    # 嵌套内部类的方法被外层覆盖，留到下一轮再处理。
    for _ in range(200):
        edits = []
        covered = -1
        for sm in sig_re.finditer(src):
            if sm.start() < covered:
                continue
            bo = src.find("{", sm.end()-1)
            bc = match_brace(src, bo) if bo >= 0 else -1
            if bc < 0:
                continue
            covered = bc
            nb, f = fold_body(src[bo+1:bc])
            if f:
                edits.append((bo+1, bc, nb, f))
        if not edits:
            break
        for bo, bc, nb, f in reversed(edits):
            src = src[:bo] + nb + src[bc:]
            total += f
    if total:
        open(path, "w", encoding="utf-8").write(src)
    return total

def _worker(args):
    sp, fn = args
    return fn, process_file(os.path.join(sp, fn))

if __name__ == "__main__":
    sp = sys.argv[1]
    load_fields(sp)
    files = [fn for fn in sorted(os.listdir(sp))
             if fn.endswith(".java") and not re.fullmatch(r"C0\d{3}", fn[:-5])]
    total = 0
    # 逐文件独立，多进程并行（单进程在 5000 行级文件上要 5~10 分钟）
    from multiprocessing import Pool, cpu_count
    nproc = min(8, cpu_count() or 1)
    with Pool(nproc, initializer=load_fields, initargs=(sp,)) as pool:
        for fn, c in pool.imap_unordered(_worker, [(sp, f) for f in files]):
            if c:
                print("%-22s folded=%d" % (fn, c), flush=True)
            total += c
    print("TOTAL:", total)
