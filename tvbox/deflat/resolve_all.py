"""解析全项目 897 种 Cxxxx.mNN 调用的真实实现并分类，供构建映射表。

分类：
  forward-std   转发到标准 API（Pattern/Base64/Cipher/Mac/URI/Settings/...）
  forward-util  转发到项目工具/业务类（V3/Rc/iX/DC/cn/...）
  const         返回常量（数字或字符串字面量）
  xor-dec       short[] 异或解密（decrypt_all.py 已按调用点还原明文）
  cp            十六进制 + 随机异或的混淆串解码（str2/str3 生成器）
  cast-std      强制转型后转发到框架类方法：((StringBuilder) obj).toString()
  cast-util     强制转型后转发到项目类方法：((RQ) obj).W()
  cast-field    强制转型后取字段：((RQ) obj).W
  const-xor     常量与静态字段异或：(-767) ^ C0037.f95
  complex       其它（多语句、多分支等），不动
"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from jutil import find_close, skip_ws, split_statements, strip_comments

BASE = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                    'decompiled', 'response')
CLEAN = os.path.join(BASE, 'src_clean', 'sources')
LIST = os.path.join(os.path.dirname(os.path.abspath(__file__)), '_calls_all.txt')

STD = {'Pattern', 'Base64', 'Cipher', 'Mac', 'URI', 'Settings', 'MessageDigest', 'Integer',
       'Long', 'Double', 'Float', 'String', 'Math', 'TextUtils', 'Arrays', 'URLEncoder',
       'StringBuilder', 'StandardCharsets', 'Charset', 'BigInteger', 'DigestUtils', 'Uri'}
SELF_RE = re.compile(r'^\s*return\s+(.*);\s*$', re.S)
# short[] 异或解密：char[] X = new char[len]; for(...) X[k] = (char) (arr[off + k] ^ key); return new String(X);
XOR_BODY_RE = re.compile(
    r'char\[\]\s+(\w+)\s*=\s*new char\[(\w+)\];\s*'
    r'for\s*\(\s*int\s+(\w+)\s*=\s*0;\s*\3\s*<\s*\2;\s*\3\+\+\s*\)\s*\{\s*'
    r'\1\[\3\]\s*=\s*\(char\)\s*\(\s*\w+\[[^\]]+\]\s*\^\s*\w+\s*\);\s*\}\s*'
    r'return new String\(\1\);')
# 混淆串解码：str2 = 十六进制表，str3 = ((int)(Math.random()*10)) ^ i 拼出的密钥
CP_BODY_RE = re.compile(r'Integer\.toHexString\(\w+\).{0,300}?Math\.random\(\)\s*\*\s*10', re.S)
# 强制转型转发：return ((Type) obj).m(args);   /   ((Type) obj).m(args);
CAST_CALL_RE = re.compile(
    r'^(?:return\s+)?\(\s*\(\s*([\w$.]+)\s*\)\s*[\w$.]+\s*\)\s*\.\s*([\w$]+)\s*\((.*)\)\s*;$', re.S)
# 强制转型取字段：return ((Type) obj).field;
CAST_FIELD_RE = re.compile(
    r'^return\s+\(\s*\(\s*([\w$.]+)\s*\)\s*[\w$.]+\s*\)\s*\.\s*([\w$]+)\s*;$')
# 常量与静态字段异或：return (-767) ^ C0037.f95;
CONST_XOR_RE = re.compile(r'^return\s+(?:\(\s*(-?\d+)\s*\)|(-?\d+))\s*\^\s*([\w$.]+)\s*;$')
# 框架/第三方类（转型转发时据此区分 std 与 util）
REAL = {'String', 'StringBuilder', 'StringBuffer', 'Object', 'Boolean', 'Integer', 'Long',
        'Double', 'Float', 'Character', 'Byte', 'Short', 'Number', 'Math', 'System',
        'List', 'ArrayList', 'LinkedList', 'Map', 'HashMap', 'LinkedHashMap', 'TreeMap',
        'Set', 'HashSet', 'TreeSet', 'Collection', 'Collections', 'Arrays', 'Objects',
        'Iterator', 'Iterable', 'Map.Entry', 'Entry', 'Comparator', 'Date', 'DateFormat',
        'SimpleDateFormat', 'Calendar', 'Random', 'Thread', 'Runnable', 'ExecutorService',
        'ScheduledExecutorService', 'ReentrantLock', 'CountDownLatch', 'AtomicInteger',
        'AtomicBoolean', 'File', 'InputStream', 'OutputStream', 'ByteArrayInputStream',
        'ByteArrayOutputStream', 'ByteBuffer', 'Buffer', 'Charset', 'Pattern', 'Matcher',
        'MessageDigest', 'Runtime', 'Process', 'Throwable', 'Exception', 'RuntimeException',
        'PrintStream', 'JSONObject', 'JSONArray', 'JSONException', 'Context', 'Intent',
        'View', 'ViewGroup', 'ViewGroup.MarginLayoutParams', 'TextView', 'ImageView',
        'Dialog', 'AlertDialog.Builder', 'DialogInterface', 'Window', 'PackageManager',
        'ApplicationInfo', 'Handler', 'Message', 'Bundle', 'Uri', 'Uri.Builder',
        'MediaPlayer', 'SurfaceView', 'KeyEvent', 'MotionEvent'}


def load_class(path):
    return open(path, encoding='utf-8', errors='replace').read()


def find_method(src, meth):
    m = re.search(r'(?:^|\n)[ \t]*(?:public|private|protected)?[ \t]*(?:static[ \t]+)?[^\n]*\b' + meth + r'\([^;{]*\)[^\n{]*\{', src)
    if not m:
        return None
    j = src.find('{', m.start())
    depth = 0
    i = j
    n = len(src)
    while i < n:
        c = src[i]
        if c in '"\'':
            q = c
            i += 1
            while i < n:
                if src[i] == '\\':
                    i += 2
                    continue
                if src[i] == q:
                    break
                i += 1
        elif c == '{':
            depth += 1
        elif c == '}':
            depth -= 1
            if depth == 0:
                return src[j:i + 1]
        i += 1
    return None


def extract_logic(body):
    """去掉恒真守卫，返回真实逻辑语句列表。

    括号/花括号配对标定一律走 jutil（跳过字符串字面量与注释），
    否则 HTML/JS 常量里的 {} 会把守卫体截错。
    """
    inner = body.strip()
    if inner.startswith('{') and inner.endswith('}'):
        inner = inner[1:-1]
    stmts = split_statements(inner, 0, len(inner))
    if not stmts:
        return None, []
    each = [strip_comments(inner[a:b]).strip() for a, b in stmts]
    # 形如：if (guard) { ... }  return X;   /  if (guard) {A} else {B}
    if each and each[0].startswith('if'):
        st, en = stmts[0]
        txt = inner[st:en]
        lp = txt.find('(')
        if lp >= 0:
            cp = find_close(inner, st + lp)
            lb = skip_ws(inner, cp + 1, en) if cp > 0 else -1
            if lb >= 0 and lb < en and inner[lb] == '{':
                rb = find_close(inner, lb)
                if rb > 0:
                    cond = strip_comments(inner[st + lp + 1:cp]).strip()
                    then_txt = inner[lb + 1:rb]
                    tail = inner[rb + 1:en].strip()
                    if tail.startswith('else'):
                        el = skip_ws(inner, rb + 1, en)
                        if el < en and inner[el] == '{':
                            eb = find_close(inner, el)
                            else_txt = inner[el + 1:eb] if eb > 0 else tail[4:].strip()
                        else:
                            else_txt = tail[4:].strip()
                        return cond, [then_txt, else_txt]
                    return cond, [then_txt]
    return None, each


def main():
    combos = []
    for line in open(LIST, encoding='utf-8'):
        k, n = line.rstrip('\n').split('\t')
        combos.append((k, int(n)))
    stat = {}          # 类型 -> [种数, 处数]
    mapping = []
    out_lines = []
    cache = {}
    cur = {}

    def note(kind, cnt):
        s = stat.setdefault(kind, [0, 0])
        s[0] += 1
        s[1] += cnt

    def hit(kind, cnt, target):
        note(kind, cnt)
        mapping.append((cur['key'], cnt, kind, target))

    def complex_(reason):
        note('complex', cur['cnt'])
        if len(out_lines) < 600:
            out_lines.append('--- %s (x%d) [%s]\n%s' % (cur['key'], cur['cnt'], reason, cur['joins'][:600]))

    for key, cnt in combos:
        pkg, cls, meth = key.rsplit('.', 2)
        path = os.path.join(CLEAN, pkg.replace('.', os.sep), cls + '.java')
        if path not in cache:
            cache[path] = load_class(path) if os.path.exists(path) else None
        src = cache[path]
        cur['key'], cur['cnt'], cur['joins'] = key, cnt, ''
        if src is None:
            note('missing', cnt)
            continue
        body = find_method(src, meth)
        if body is None:
            note('no-body', cnt)
            continue
        if XOR_BODY_RE.search(body):
            hit('xor-dec', cnt, 'xorDecode')
            continue
        if CP_BODY_RE.search(body):
            hit('cp', cnt, 'cp')
            continue
        cond, logic = extract_logic(body)
        joins = '\n'.join(x.strip() for x in logic)
        cur['joins'] = joins
        rets = SELF_RE.findall(joins)
        if len(logic) == 1:
            s0 = logic[0].strip()
            mc = CAST_CALL_RE.match(s0)
            if mc:
                kind = 'cast-std' if mc.group(1) in REAL else 'cast-util'
                hit(kind, cnt, mc.group(1) + '.' + mc.group(2))
                continue
            mf = CAST_FIELD_RE.match(s0)
            if mf:
                hit('cast-field', cnt, mf.group(1) + '.' + mf.group(2))
                continue
            mk = CONST_XOR_RE.match(s0)
            if mk:
                hit('const-xor', cnt, mk.group(3) + ' ^ ' + (mk.group(1) or mk.group(2)))
                continue
            if len(rets) == 1:
                expr = rets[0].strip()
                m = re.match(r'([A-Za-z_$][\w$]*)\.([\w$]+)\(', expr)
                if m and m.group(1) in STD:
                    hit('forward-std', cnt, m.group(1) + '.' + m.group(2))
                    continue
                if m:
                    hit('forward-util', cnt, m.group(1) + '.' + m.group(2))
                    continue
                if re.fullmatch(r'-?\d+', expr) or re.fullmatch(r'"(?:[^"\\]|\\.)*"', expr) or expr in ('true', 'false'):
                    hit('const', cnt, expr[:80])
                    continue
                if re.fullmatch(r'[\w$.]+', expr):
                    hit('field', cnt, expr)
                    continue
            else:
                m2 = re.match(r'^([A-Za-z_$][\w$]*)\.([\w$]+)\((.*)\);\s*$', logic[0].strip(), re.S)
                if m2 and m2.group(1) not in ('this', 'super'):
                    kind = 'void-std' if m2.group(1) in STD else 'void-util'
                    hit(kind, cnt, m2.group(1) + '.' + m2.group(2))
                    continue
            complex_('单语句')
            continue
        # 守卫 + 兜底（if (g) {A} else {return null;}) -> 取 A
        if len(logic) == 2:
            a, b = logic[0].strip(), logic[1].strip()
            fb = re.fullmatch(r'return\s+(null|0|false|""|\'\');', b)
            if fb:
                rr = SELF_RE.match(a)
                if rr:
                    expr = rr.group(1).strip()
                    m = re.match(r'([A-Za-z_$][\w$]*)\.([\w$]+)\(', expr)
                    if m:
                        kind = 'forward-std' if m.group(1) in STD else 'forward-util'
                        hit(kind, cnt, m.group(1) + '.' + m.group(2))
                        continue
                    if re.fullmatch(r'-?\d+', expr) or re.fullmatch(r'"(?:[^"\\]|\\.)*"', expr):
                        hit('const', cnt, expr[:80])
                        continue
                else:
                    m2 = re.match(r'^([A-Za-z_$][\w$]*)\.([\w$]+)\((.*)\);\s*$', a, re.S)
                    if m2 and m2.group(1) not in ('this', 'super'):
                        kind = 'void-std' if m2.group(1) in STD else 'void-util'
                        hit(kind, cnt, m2.group(1) + '.' + m2.group(2))
                        continue
            complex_('两语句')
            continue
        complex_('%d 语句' % len(logic))
    print('%-14s %6s %8s' % ('类型', '种数', '处数'))
    for k, (n, c) in sorted(stat.items(), key=lambda kv: -kv[1][1]):
        print('%-14s %3d 种  %5d 处调用' % (k, n, c))
    print('合计 %d 种 %d 处' % (sum(v[0] for v in stat.values()), sum(v[1] for v in stat.values())))
    with open(os.path.join(os.path.dirname(LIST), '_mapping_all.txt'), 'w', encoding='utf-8') as fh:
        for key, cnt, kind, target in mapping:
            fh.write('%s\t%d\t%s\t%s\n' % (key, cnt, kind, target))
    with open(os.path.join(os.path.dirname(LIST), '_complex_all.txt'), 'w', encoding='utf-8') as fh:
        fh.write('\n\n'.join(out_lines))
    print('映射候选 %d 条，复杂样本 %d 个' % (len(mapping), len(out_lines)))


if __name__ == '__main__':
    main()
