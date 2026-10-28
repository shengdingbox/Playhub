# -*- coding: utf-8 -*-
"""
解析 merge/parser/spider-C00xx 中所有“薄包装”静态方法：
   方法体形如
      if (<常量守卫>) { return ((T)a).m((Cast)b,...); }   或   ((T)a).m(...);
      return <默认值/null/false/0/"">;
提取唯一实质调用  recv.method(args)，记录形参类型与默认值，生成内联映射。
对 0 参方法（如 m1705() 返回 ""）也支持。
"""
import os, re, io, sys, json
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding="utf-8")
ROOT = r"decompiled/response/src_inner/sources/com/github/catvod"

sig_re = re.compile(
    r"public\s+static\s+(?:final\s+)?([\w\.\[\]<>]+)\s+(m\w+)\s*\(([^)]*)\)\s*\{")

def split_top(s):
    parts=[];d=0;cur="";q=False;esc=False;ang=0
    for c in s:
        if q:
            cur+=c
            if esc:esc=False
            elif c=='\\':esc=True
            elif c=='"':q=False
            continue
        if c=='"':q=True;cur+=c;continue
        if c=='<':ang+=1;cur+=c;continue
        if c=='>':ang-=1;cur+=c;continue
        if c in '([{':d+=1
        elif c in ')]}':d-=1
        if c==',' and d==0 and ang==0: parts.append(cur.strip());cur=""
        else:cur+=c
    if s.strip():parts.append(cur.strip())
    return parts

def body_of(src,brace):
    depth=0;i=brace
    while i<len(src):
        if src[i]=='{':depth+=1
        elif src[i]=='}':
            depth-=1
            if depth==0:return src[brace:i+1]
        i+=1
    return src[brace:]

# 实质方法调用：  .NAME(  （含可选强转实参）。找形如 X.method(...) 且 X 是 (Cast)param
call_re = re.compile(r"\(\(([\w\.\[\]]+)\)\s*(\w+)\)\s*\.\s*(\w+)\s*\(")
static_call_re = re.compile(r"(?<![\w.])([A-Z]\w*)\.(\w+)\s*\(")

def strip_cast(e):
    e=e.strip()
    m=re.fullmatch(r"\(([\w\.\[\]]+)\)\s*(\w+)", e)
    if m: return m.group(2), m.group(1)
    return e, None

def parse_formal(argstr):
    fs=[]
    for p in split_top(argstr):
        toks=p.split()
        if len(toks)>=2: fs.append((toks[-1].replace("...",""), toks[0]))
    return fs

def parse_default(rettype, body, guard):
    # 取最后一个 return X;
    rets=re.findall(r"return\s+([^;{}]*);", body)
    if not rets: return None
    # 实质调用所在 return 之后/之外的兜底 return：通常最后一个
    d=rets[-1].strip()
    return d

def analyze_body(rettype, formals, body):
    # 去掉守卫 if 行不影响：直接找所有 cast-call
    calls=list(call_re.finditer(body))
    # 只保留接收者为形参的
    pnames=[n for n,_ in formals]
    good=[]
    for c in calls:
        typ,recv,meth=c.groups()
        if recv not in pnames: continue
        po=body.find("(",c.end()-1)
        # 配对此调用括号
        depth=0;i=po
        while i<len(body):
            if body[i]=='(':depth+=1
            elif body[i]==')':
                depth-=1
                if depth==0:break
            i+=1
        args=split_top(body[po+1:i])
        # 实参归一为形参名（去强转）；若含方法调用/非形参则标记复杂
        norm=[]; complex_=False
        for a in args:
            name,cast=strip_cast(a)
            if re.fullmatch(r"[A-Za-z_$][\w$]*", name) and name in pnames:
                norm.append(name)
            elif re.fullmatch(r"-?\d+[lL]?",name) or name in ("true","false") or (name.startswith('"') and name.endswith('"')):
                norm.append(name)
            else:
                complex_=True; norm.append(a)
        good.append({"kind":"inst","type":typ,"recv":recv,"method":meth,"args":norm,"rawargs":args,"complex":complex_})
    # 静态调用： Class.method(args)
    for sm in static_call_re.finditer(body):
        cls2,meth2=sm.groups()
        po=body.find("(",sm.end()-1)
        depth=0;i=po
        while i<len(body):
            if body[i]=='(':depth+=1
            elif body[i]==')':
                depth-=1
                if depth==0:break
            i+=1
        sargs=split_top(body[po+1:i])
        norm=[];bad=False
        for a in sargs:
            name,cast=strip_cast(a)
            if re.fullmatch(r"[A-Za-z_$][\w$]*",name) and name in pnames: norm.append(name)
            elif re.fullmatch(r"-?\d+[lL]?",name) or name in ("true","false") or (name.startswith('"') and name.endswith('"')): norm.append(name)
            else: bad=True;norm.append(a)
        if cls2 in ("TextUtils","Arrays","Integer","Long","String","Math","Collections","Objects"):
            good.append({"kind":"static","type":cls2,"recv":None,"method":meth2,"args":norm,"rawargs":sargs,"complex":bad})
    # 唯一“实质调用”才接受（忽略纯控制流 m76 那种多分支）
    good=[g for g in good if not (g["complex"])]
    if len(good)!=1: return None
    return good[0]

methods={}
for d in ("spider/merge","parser","spider"):
    dp=os.path.join(ROOT,d)
    if not os.path.isdir(dp):continue
    for fn in os.listdir(dp):
        if not fn.endswith(".java"):continue
        cls=fn[:-5]
        # 只处理 C00xx 工具类（spider 根目录下避开真实爬虫）
        if d=="spider" and not re.fullmatch(r"C0\d{3}", cls): continue
        src=open(os.path.join(dp,fn),encoding="utf-8").read()
        for mm in sig_re.finditer(src):
            ret,name,argstr=mm.groups()
            brace=src.find("{",mm.end()-1)
            body=body_of(src,brace)
            formals=parse_formal(argstr)
            methods["%s.%s"%(cls,name)]=(ret,formals,body)

imap={}
for key,(ret,formals,body) in methods.items():
    g=analyze_body(ret,formals,body)
    if g and not g["complex"]:
        entry={"ret":ret,"kind":g["kind"],"recvType":g["type"],"recv":g["recv"],
               "method":g["method"],"args":g["args"],
               "params":[n for n,_ in formals],
               "argTypes":[t for _,t in formals]}
        if g["kind"]=="static":
            entry["staticClass"]=g["type"]
        imap[key]=entry
# 0 参常量方法： public static String m(){ if(g) return X; return default;}
const0_re=re.compile(r"public\s+static\s+(?:final\s+)?([\w\.\[\]<>]+)\s+(m\w+)\s*\(\s*\)\s*\{(.*?)\n\s*\}",re.S)
for d in ("spider/merge","parser","spider"):
    dp=os.path.join(ROOT,d)
    if not os.path.isdir(dp):continue
    for fn in os.listdir(dp):
        if not fn.endswith(".java"):continue
        cls=fn[:-5]
        if d=="spider" and not re.fullmatch(r"C0\d{3}",cls):continue
        src=open(os.path.join(dp,fn),encoding="utf-8").read()
        for mm in const0_re.finditer(src):
            ret,name,bd=mm.groups()
            key="%s.%s"%(cls,name)
            if key in imap:continue
            rets=re.findall(r"return\s+([^;{}]*);",bd)
            # 选一个非 null 的字面量
            lit=next((r.strip() for r in rets if r.strip() not in ("null",) and r.strip().startswith('"')), None)
            if lit is None:
                lit=next((r.strip() for r in rets if r.strip()!="null"), None)
            if lit is not None:
                imap[key]={"ret":ret,"const":lit}

print("inline map:",len(imap))
for k in ["C0032.m1746","C0022.m1450","C0005.m159","C0031.m1705","C0037.m1888",
          "C0036.m1852","C0010.m316","C0042.m1999","C0035.m1823","C0020.m1370"]:
    print(" ",k,imap.get(k))
json.dump(imap, open(r"decompiled/response/inlinemap.json","w",encoding="utf-8"), ensure_ascii=False)
