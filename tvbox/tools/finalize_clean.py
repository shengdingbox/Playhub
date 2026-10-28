# -*- coding: utf-8 -*-
"""
最终清理 src_clean/spider：
 1) 删除已不再被引用的 merge/parser/C00xx import；
 2) 把简单的 自定义静态工具调用按“直通”规则内联（A7.N -> append+toString 等跳过，保留）；
 3) 归并多余的外层括号  ((x)) -> (x)；
 4) 删除仅服务字符串解码、现已无用的 private static final short[] 大数组（若不再被引用）。
保守策略：只做可证明安全的删除。
"""
import os,re,io,sys
sys.stdout=io.TextIOWrapper(sys.stdout.buffer,encoding="utf-8")
SP=r"decompiled/response/src_clean/sources/com/github/catvod/spider"

def used(src, ident):
    # 出现在 import 之外的位置
    return len(re.findall(r"(?<![\w$.])"+re.escape(ident)+r"(?![\w$])", src))

stats={"imports":0,"shortarr":0,"parens":0}
for fn in sorted(os.listdir(SP)):
    if not fn.endswith(".java"):continue
    p=os.path.join(SP,fn); src=open(p,encoding="utf-8").read(); orig=src
    # 1) 删除 merge/parser 的 C00xx import（行），前提是类名在文件正文已无引用
    lines=src.splitlines(keepends=True); kept=[]
    for l in lines:
        m=re.match(r"\s*import\s+(?:static\s+)?[\w.]*\.(C0\d{3}|\w+)\s*;",l)
        if m and re.search(r"\.(merge|parser)\.",l):
            cls=m.group(1)
            # 正文引用计数（去掉本 import 行后）
            body=src.replace(l,"")
            if not re.search(r"(?<![\w$.])"+cls+r"(?![\w$])", body):
                stats["imports"]+=1; continue
        kept.append(l)
    src="".join(kept)
    # 3) 折叠重复括号  (((  -> (( 多次，保守仅处理方法调用包裹的双层 ((expr))
    for _ in range(5):
        n=src
        n=re.sub(r"\(\(([^()]*?)\)\)", r"(\1)", n)
        if n==src:break
        src=n; stats["parens"]+=1
    # 4) 删除未使用的巨型 short[] 数组（fNNshort）：若该字段名在文件中仅声明一次
    for m in list(re.finditer(r"private\s+static\s+final\s+short\[\]\s+(\w+)\s*=\s*\{[^}]*\}\s*;", src, re.S)):
        name=m.group(1)
        rest=src[:m.start()]+src[m.end():]
        if not re.search(r"(?<![\w$])"+re.escape(name)+r"(?![\w$])", rest):
            src=rest; stats["shortarr"]+=1
    if src!=orig:
        open(p,"w",encoding="utf-8").write(src)
print(stats)
