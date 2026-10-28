# -*- coding: utf-8 -*-
"""
清理反分析垃圾与死状态变量：
 1) 删除  System.out.println(<...Math.random()...>);  整行（OLLVM bogus junk，无副作用）。
 2) 删除已无引用的状态变量声明  int i = (N) ^ Cxxxx.fNN; / int i2 = 1616; 等——
    若该变量名在方法体内除了这条声明外不再出现（折叠守卫后 i 往往死掉）。
    保守：只删  ^ Cxxxx.fNN  形式的（显然是混淆器插入的），普通 int i2=1616 不删。
"""
import os, re, io, sys, glob
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding="utf-8")
SP = r"decompiled/response/src_clean/sources/com/github/catvod/spider"

def match_brace(s, i):
    d = 0
    while i < len(s):
        if s[i] == '{': d += 1
        elif s[i] == '}':
            d -= 1
            if d == 0: return i
        i += 1
    return -1

sig_re = re.compile(r"([A-Za-z_][\w\[\]<>, .]*?)\s+(\w+)\s*\(([^;{}]*)\)\s*\{")
junk_re = re.compile(r"^[ \t]*System\.out\.println\([^;]*Math\.random[^;]*\);\s*\r?\n", re.M)
state_decl_re = re.compile(r"^[ \t]*int\s+(\w+)\s*=\s*\(?-?\d+\)?\s*\^\s*C\w+\.f\w+\s*;\s*\r?\n", re.M)

stats = {"junk": 0, "statedecl": 0}
for fn in sorted(os.listdir(SP)):
    if not fn.endswith(".java") or re.fullmatch(r"C0\d{3}", fn[:-5]):
        continue
    p = os.path.join(SP, fn)
    src = open(p, encoding="utf-8").read()
    orig = src
    # 1) 垃圾 println
    src, nj = junk_re.subn("", src)
    stats["junk"] += nj
    # 2) 死状态变量声明（在每个方法体内判定）
    for sm in sig_re.finditer(src):
        bo = src.find("{", sm.end()-1)
        bc = match_brace(src, bo)
        if bc < 0:
            continue
        body = src[bo+1:bc]
        removed = 0
        for dm in list(state_decl_re.finditer(body)):
            name = dm.group(1)
            rest = body[:dm.start()] + body[dm.end():]
            # 声明外不再出现该变量
            if not re.search(r"(?<![\w$])" + re.escape(name) + r"(?![\w$])", rest):
                body = rest
                removed += 1
        if removed:
            src = src[:bo+1] + body + src[bc:]
            stats["statedecl"] += removed
    if src != orig:
        open(p, "w", encoding="utf-8").write(src)
print(stats)
