# -*- coding: utf-8 -*-
"""
spider 自包含去混淆：
 (1) XOR 字符串解码调用 -> 明文字面量
 (2) merge/parser 薄包装调用 -> 直接的 Java 方法调用（去掉 Cxxxx. 与强转，按形参位置代入）
输出到 src_clean/，不改动原 src_inner。
"""
import os, re, json, io, sys, shutil

ROOT = r"decompiled/response/src_inner/sources/com/github/catvod"
SRC_SPIDER = os.path.join(ROOT, "spider")
DST = r"decompiled/response/src_clean/sources/com/github/catvod/spider"
DECODERS = set(json.load(open(r"decompiled/response/decoders.json", encoding="utf-8")))
IMAP = json.load(open(r"decompiled/response/inlinemap.json", encoding="utf-8"))

def split_top(t):
    parts=[];d=0;cur="";q=False;esc=False;ang=0
    for c in t:
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
    if t.strip():parts.append(cur.strip())
    return parts

def match_paren(s,i):
    d=0
    while i<len(s):
        if s[i]=='(':d+=1
        elif s[i]==')':
            d-=1
            if d==0:return i
        i+=1
    return -1

def short_arrays(src):
    out=[]
    for m in re.finditer(r"short\[\]\s+\w+\s*=\s*\{([^}]*)\}", src, re.S):
        nums=[int(x) for x in re.findall(r"-?\d+", m.group(1))]
        if len(nums)>8: out.append(nums)
    return out

def combine_surrogates(s):
    """Java char 流里的代理对 -> 实际 emoji/增补平面字符。"""
    out=[];i=0
    while i<len(s):
        c=ord(s[i])
        if 0xd800<=c<=0xdbff and i+1<len(s):
            c2=ord(s[i+1])
            if 0xdc00<=c2<=0xdfff:
                cp=0x10000+((c-0xd800)<<10)+(c2-0xdc00)
                out.append(chr(cp));i+=2;continue
        out.append(s[i]);i+=1
    return "".join(out)

def jlit(s):
    s=combine_surrogates(s)
    o=['"']
    for ch in s:
        if ch=='"':o.append('\\"')
        elif ch=='\\':o.append('\\\\')
        elif ch=='\n':o.append('\\n')
        elif ch=='\r':o.append('\\r')
        elif ch=='\t':o.append('\\t')
        elif ord(ch)<0x20:o.append('\\u%04x'%ord(ch))
        else:o.append(ch)
    o.append('"');return "".join(o)

ident = r"[A-Za-z_$][\w$]*"
# Cxxxx.mName(   （可带包前缀）
head = re.compile(r"(?<![\w$])((?:"+ident+r"\.)*?"+ident+r")\.(m\w+)\s*\(")

def param_bind(formal, actual):
    """把内联模板里对形参名的引用替换为实参表达式。形参名取声明的最后一个标识符。"""
    mapping={}
    for f,a in zip(formal, actual):
        name=f.strip().split()[-1].replace("...","")
        mapping[name]=a
    return mapping

def subst(expr, mapping):
    # 仅替换整词形参
    def rep(m):
        w=m.group(0)
        return mapping.get(w,w)
    return re.sub(r"(?<![\w$])[A-Za-z_$][\w$]*(?![\w$])", rep, expr)

def replace_all(src, arrmap, stats):
    """从右到左替换一轮（保证偏移稳定），返回 (新src, 本轮替换数)。"""
    matches=list(head.finditer(src))
    n=0
    for m in reversed(matches):
        cls=m.group(1).split(".")[-1]; meth=m.group(2); full="%s.%s"%(cls,meth)
        po=src.find("(",m.end()-1); pc=match_paren(src,po)
        if pc<0: continue
        inner=src[po+1:pc]
        args=split_top(inner)
        start=m.start()
        # (1) XOR 字符串解码（第一参解析数组，后3参常量）
        if meth in DECODERS and len(args)==4:
            arr=resolve_arr(arrmap, args[0])
            try:
                st=int(args[1]);ln=int(args[2]);key=int(args[3])&0xffff
            except ValueError:
                st=None
            if st is None:
                pass
            else:
                cands=[arr] if arr is not None else list(arrmap["_all"])
                placed=False
                for arr in cands:
                    if not(0<=st and 0<ln and st+ln<=len(arr)): continue
                    raw="".join(chr((arr[st+i]&0xffff)^key) for i in range(ln))
                    dec=combine_surrogates(raw)  # 合并 emoji 代理对
                    has_iso=any(0xd800<=ord(c)<=0xdfff or ord(c)==0xfffd for c in dec)
                    if dec and all((c.isprintable() or c in "\n\r\t") for c in dec) and not has_iso:
                        src=src[:start]+jlit(raw)+src[pc+1:]; stats["str"]+=1; n+=1; placed=True; break
                if placed: continue
        # (2) 薄包装常量
        if full in IMAP and "const" in IMAP[full]:
            src=src[:start]+IMAP[full]["const"]+src[pc+1:]; stats["wrap"]+=1; n+=1; continue
        # (3) 薄包装方法：实参原样代入（即使含未处理调用，也先解开外层）
        if full in IMAP:
            v=IMAP[full]; formal=v["params"]
            if len(args)==len(formal):
                mapping=dict(zip(formal,args))
                if v.get("kind")=="static":
                    base=v.get("staticClass",v["recvType"])
                    expr=subst("%s.%s(%s)"%(base,v["method"],",".join(v["args"])),mapping)
                else:
                    expr=subst("%s.%s(%s)"%(v["recv"],v["method"],",".join(v["args"])),mapping)
                src=src[:start]+"("+expr+")"+src[pc+1:]; stats["wrap"]+=1; n+=1; continue
    return src,n

def named_arrays(src):
    """返回 {字段名: [...]}，含匿名(键 '')。支持同类多个 short[]。"""
    out={"_all":[]}
    # 具名字段： [mods] short[] NAME = { ... };
    for m in re.finditer(r"short\[\]\s+(\w+)\s*=\s*\{([^}]*)\}", src, re.S):
        nums=[int(x) for x in re.findall(r"-?\d+", m.group(2))]
        if len(nums)>8:
            out[m.group(1)]=nums; out["_all"].append(nums)
    return out

def resolve_arr(arrmap, firstarg):
    """根据解码调用的第一参数表达式选出正确数组。"""
    fa=firstarg.strip()
    # 直接字段名
    if fa in arrmap: return arrmap[fa]
    # this.field / Class.field
    mm=re.match(r"(?:this\.)?\w+\.(\w+)$", fa)
    if mm and mm.group(1) in arrmap: return arrmap[mm.group(1)]
    # 全限定 ...Class.A 形式：取最后标识符
    tok=fa.split(".")[-1]
    if tok in arrmap: return arrmap[tok]
    # 无参访问器 mNNN() / 局部 sArr / 其它：文件内仅一个数组时用它，否则按 None
    if len(arrmap["_all"])==1: return arrmap["_all"][0]
    return None

def deob(src):
    arrmap=named_arrays(src)
    stats={"str":0,"wrap":0}
    for _ in range(200):
        src,n=replace_all(src,arrmap,stats)
        if n==0: break
    return src, stats

def main():
    os.makedirs(os.path.dirname(DST), exist_ok=True)
    if os.path.exists(r"decompiled/response/src_clean"):
        shutil.rmtree(r"decompiled/response/src_clean")
    shutil.copytree(r"decompiled/response/src_inner", r"decompiled/response/src_clean")
    tot={"str":0,"wrap":0}
    only=sys.argv[1] if len(sys.argv)>1 else None
    for fn in sorted(os.listdir(SRC_SPIDER)):
        if not fn.endswith(".java"):continue
        if only and only not in fn:continue
        p=os.path.join(SRC_SPIDER,fn)
        s=open(p,encoding="utf-8").read()
        out,st=deob(s)
        tot["str"]+=st["str"]; tot["wrap"]+=st["wrap"]
        open(os.path.join(DST,fn),"w",encoding="utf-8").write(out)
        if st["str"] or st["wrap"]:
            print("%-20s str=%-4d wrap=%-4d"%(fn,st["str"],st["wrap"]))
    print("TOTAL",tot)

if __name__=="__main__":
    main()
