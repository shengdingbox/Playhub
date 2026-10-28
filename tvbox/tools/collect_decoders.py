# -*- coding: utf-8 -*-
"""从 merge/parser 源码精确收集所有 XOR 字符串解码方法：
   匹配 'String NAME(short[] .., int..){... new char/^ ...}'，用括号配对取完整方法体。"""
import os, re, io, sys, json
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding="utf-8")
ROOT = r"decompiled/response/src_inner/sources/com/github/catvod"

def methods_of(src):
    # 找形如  String  mXXXX(short[] a, int b, int c, int d)  的方法签名位置
    for m in re.finditer(r"String\s+(m\w+)\s*\(\s*short\[\]\s*\w+\s*,\s*int\s+\w+\s*,\s*int\s+\w+\s*,\s*int\s+\w+\s*\)\s*\{", src):
        name=m.group(1)
        brace=m.end()-1
        depth=0; i=brace
        while i<len(src):
            if src[i]=='{':depth+=1
            elif src[i]=='}':
                depth-=1
                if depth==0: break
            i+=1
        body=src[brace:i+1]
        yield name, body

names=set()
for d in ("spider/merge","parser","spider"):
    dp=os.path.join(ROOT,d)
    for fn in os.listdir(dp):
        if not fn.endswith(".java"):continue
        src=open(os.path.join(dp,fn),encoding="utf-8").read()
        for name,body in methods_of(src):
            # XOR 解码特征： 对 sArr[...] ^ 某参数 生成 char[]
            if re.search(r"\]\s*\^\s*\w+", body) and "char" in body and "new String" in body:
                names.add(name)
print(len(names))
print(sorted(names))
json.dump(sorted(names), open(r"decompiled/response/decoders.json","w"))
