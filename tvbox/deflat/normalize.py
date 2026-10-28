"""把 src_deflat 里 `Cxxxx.mNN(...)` 混淆转发调用规范化为语义化调用。

流程：合并 w2 响应赋值 -> 重命名调用 -> 修正 import -> 常量折叠 -> 死变量清理。

用法：
  python normalize.py <文件或目录> [更多文件...]
"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from clean_dead import clean as clean_dead
from fold_consts import fold_text, load_fields

# 混淆方法 -> 规范化目标（实参顺序不变）
RENAME = {
    'C0005.m166': 'Pattern.compile',
    'C0055.m2325': 'Strings.map',
    'C0002.m78': 'Store.put',
    'C0003.m88': 'URI.create',
    'C0010.m311': 'Crypto.rsaEncrypt',
    'C0029.m1636': 'Cipher.getInstance',
    'C0041.m1986': 'Crypto.hex',
    'C0052.m2266': 'Crypto.md5',
    'C0013.m400': 'Mac.getInstance',
    'C0034.m1790': 'Base64.encodeToString',
    'C0014.m419': 'Store.get',
    'C0004.m136': 'Settings.Secure.getString',
    'C0008.m234': 'Crypto.rsaDecrypt',
    'C0003.m80': 'Crypto.aesDecrypt',
    'C0031.m1704': 'Crypto.unhex',
    'C0010.m289': 'Filter.blocked',
    'C0041.m1976': 'generateRandomString',
    'C0029.m1662': 'ProxyOrigin.getan',
    'C0048.m2137': 'Proxy.m3u8',
    'C0056.m2351': 'cn.F5',
    'C0033.m1778': 'iX.M',
}

# 需要按内容补 import 的前缀 -> 全限定名
PREFIX_IMPORT = {
    'Base64': 'android.util.Base64',
    'Settings': 'android.provider.Settings',
    'URI': 'java.net.URI',
    'Cipher': 'javax.crypto.Cipher',
    'Mac': 'javax.crypto.Mac',
    'Pattern': 'java.util.regex.Pattern',
    'Store': 'com.github.catvod.utils.Store',
    'Crypto': 'com.github.catvod.utils.Crypto',
    'Http': 'com.github.catvod.utils.Http',
    'Strings': 'com.github.catvod.utils.Strings',
    'Filter': 'com.github.catvod.utils.Filter',
    'Proxy': 'com.github.catvod.utils.Proxy',
    'iX': 'com.github.catvod.spider.merge.iX',
    'cn': 'com.github.catvod.spider.merge.cn',
}

CALL_RE = re.compile(r'\b(C\d{4}\w*)\.(m\d+)\s*\(')


def close_paren(src, open_idx):
    depth = 0
    i = open_idx
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
        elif c == '(':
            depth += 1
        elif c == ')':
            depth -= 1
            if depth == 0:
                return i
        i += 1
    return -1


def merge_responses(src, json_const):
    """合并 `w2 v = C0005.m167(a,b,c); ... t = (v.yq());` 为一条直接赋值。"""
    edits = []
    for m in re.finditer(r'(\w+) = (C0005\.m167\()', src):
        var = m.group(1)
        open_idx = src.index('(', m.start(2))
        end = close_paren(src, open_idx)
        if end < 0:
            continue
        args = src[open_idx:end + 1]
        um = re.search(r'([ \t]*)(\w+) = \(' + re.escape(var) + r'\.yq\(\)\);', src[end + 1:])
        if not um:
            continue
        line_start = src.rfind('\n', 0, m.start()) + 1
        next_line = src.find('\n', end)
        edits.append((line_start, next_line + 1, ''))
        edits.append((end + 1 + um.start(), end + 1 + um.end(),
                      '%s%s = Http.post%s;' % (um.group(1), um.group(2), args)))
    for a, b, txt in sorted(edits, reverse=True):
        src = src[:a] + txt + src[b:]
    return src


def rename_calls(src, json_const):
    out = []
    pos = 0
    hit = 0
    for m in CALL_RE.finditer(src):
        if m.start() < pos:
            continue
        key = '%s.%s' % (m.group(1), m.group(2))
        open_idx = m.end() - 1
        end = close_paren(src, open_idx)
        if end < 0:
            continue
        inner = src[open_idx + 1:end]
        if CALL_RE.search(inner):
            inner, n = rename_calls(inner, json_const)
            hit += n
        args = '(' + inner + ')'
        if key == 'C0005.m167':
            after = end + 1
            if src[after:after + 5] == '.yq()':
                after += 5
            out.append(src[pos:m.start()])
            out.append('Http.post' + args)
            pos = after
            hit += 1
        elif key == 'C0033.m1777':
            out.append(src[pos:m.start()])
            out.append(json_const)
            pos = end + 1
            hit += 1
        elif key in RENAME:
            out.append(src[pos:m.start()])
            out.append(RENAME[key] + args)
            pos = end + 1
            hit += 1
    out.append(src[pos:])
    return ''.join(out), hit


def fix_imports(src):
    lines = src.split('\n')
    imps = [l for l in lines if l.startswith('import ')]
    body = '\n'.join(l for l in lines if not l.startswith('import '))
    have = set(l[len('import '):].rstrip(';') for l in imps)
    simple_have = set(fq.split('.')[-1] for fq in have)
    for im in list(imps):
        fq = im[len('import '):].rstrip(';')
        simple = fq.split('.')[-1]
        if re.match(r'^C\d{4}\w*$', simple) and re.search(r'\b' + simple + r'\.', body) is None:
            imps.remove(im)
        elif simple == 'w2':
            imps.remove(im)
    for simple, fq in PREFIX_IMPORT.items():
        if simple in simple_have:
            continue
        if re.search(r'\b' + re.escape(simple) + r'\.', body):
            imps.append('import %s;' % fq)
    imps = sorted(set(imps))
    out = []
    done = False
    for l in body.split('\n'):
        out.append(l)
        if l.startswith('package ') and not done:
            done = True
            out.append('')
            out.extend(imps)
            out.append('')
    return '\n'.join(out)


def json_constant(path):
    s = open(path, encoding='utf-8', errors='replace').read()
    i = s.find('public static String m1777()')
    if i < 0:
        return '""'
    j = s.find('return', i)
    k = s.find(';', j)
    return s[j + len('return'):k].strip()


def process(path, json_const, fields):
    src = open(path, encoding='utf-8', errors='replace').read()
    before = len(CALL_RE.findall(src))
    if not before:
        return None
    src = merge_responses(src, json_const)
    src, hit = rename_calls(src, json_const)
    src = fix_imports(src)
    src = fold_text(src, fields)
    src, dead = clean_dead(src)
    src = re.sub(r'\n{3,}', '\n\n', src)
    open(path, 'w', encoding='utf-8').write(src)
    left = len(CALL_RE.findall(src))
    return before, hit, dead, left


def main():
    base = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                        'decompiled', 'response')
    json_const = json_constant(os.path.join(base, r"src_clean\sources\com\github\catvod\spider\merge\C0033.java"))
    fields = load_fields()
    targets = []
    for a in sys.argv[1:]:
        if os.path.isdir(a):
            for dp, _d, fs in os.walk(a):
                targets.extend(os.path.join(dp, f) for f in sorted(fs) if f.endswith('.java'))
        else:
            targets.append(a)
    total = 0
    for p in targets:
        r = process(p, json_const, fields)
        if r:
            print('%-40s 调用 %d -> 剩余 %d（归一 %d，死变量 %d）' % (os.path.basename(p), r[0], r[3], r[1], r[2]))
            total += 1
    print('处理 %d 个文件' % total)


if __name__ == '__main__':
    main()
