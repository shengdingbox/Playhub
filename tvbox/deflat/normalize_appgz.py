"""把 Appgz.java 里的 Cxxxx.mNN(...) 混淆转发调用规范化为语义化调用。

- 转发到 JDK/Android 标准 API 的 -> 直接调用（Pattern/URI/Cipher/Mac/Base64/Settings）
- 转发到自实现工具的 -> com.github.catvod.utils.*（Store/Crypto/Http/Strings/Filter/Proxy）
- 常量返回值 -> 直接内联
"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

BASE = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response"
TARGET = os.path.join(BASE, r"src_deflat\sources\com\github\catvod\spider\Appgz.java")
C0033 = os.path.join(BASE, r"src_clean\sources\com\github\catvod\spider\merge\C0033.java")

# 方法名 -> 规范化目标（实参顺序不变）
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

CALL_RE = re.compile(r'\b(C\d{4}\w*)\.(m\d+)\s*\(')


def close_paren(src, open_idx):
    """src[open_idx] == '('，返回配对 ')' 的下标。"""
    depth = 0
    i = open_idx
    n = len(src)
    while i < n:
        c = src[i]
        if c == '"' or c == "'":
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


def json_constant():
    """从 C0033.m1777() 提取返回的 JSON 常量字面量。"""
    s = open(C0033, encoding='utf-8', errors='replace').read()
    i = s.find('public static String m1777()')
    j = s.find('return', i)
    k = s.find(';', j)
    return s[j + len('return'):k].strip()


def merge_responses(src):
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
        use_start = end + 1 + um.start()
        use_end = end + 1 + um.end()
        edits.append((line_start, next_line + 1, ''))
        edits.append((use_start, use_end, '%s%s = Http.post%s;' % (um.group(1), um.group(2), args)))
    for a, b, txt in sorted(edits, reverse=True):
        src = src[:a] + txt + src[b:]
    return src


def normalize(src):
    out = []
    pos = 0
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
            inner = normalize(inner)          # 先规范化嵌套调用
        args = '(' + inner + ')'
        if key == 'C0005.m167':
            # 消费紧随的 .yq()
            after = end + 1
            if src[after:after + 5] == '.yq()':
                after += 5
            out.append(src[pos:m.start()])
            out.append('Http.post' + args)
            pos = after
            continue
        if key == 'C0033.m1777':
            out.append(src[pos:m.start()])
            out.append(json_constant())
            pos = end + 1
            continue
        if key in RENAME:
            out.append(src[pos:m.start()])
            out.append(RENAME[key] + args)
            pos = end + 1
            continue
    out.append(src[pos:])
    return ''.join(out)


IMPORT_ADD = [
    'android.provider.Settings',
    'android.util.Base64',
    'com.github.catvod.spider.ProxyOrigin',
    'com.github.catvod.spider.merge.cn',
    'com.github.catvod.spider.merge.iX',
    'com.github.catvod.utils.Crypto',
    'com.github.catvod.utils.Filter',
    'com.github.catvod.utils.Http',
    'com.github.catvod.utils.Proxy',
    'com.github.catvod.utils.Store',
    'com.github.catvod.utils.Strings',
    'java.net.URI',
]


def fix_imports(src):
    lines = src.split('\n')
    imps = [l for l in lines if l.startswith('import ')]
    body = '\n'.join(l for l in lines if not l.startswith('import '))
    have = set(l[len('import '):].rstrip(';') for l in imps)
    # 删除不再使用的 C 类 import
    for im in list(imps):
        fq = im[len('import '):].rstrip(';')
        simple = fq.split('.')[-1]
        if re.match(r'^C\d{4}\w*$', simple):
            if re.search(r'\b' + simple + r'\.', body) is None:
                imps.remove(im)
                continue
        if simple == 'w2':
            imps.remove(im)
    for fq in IMPORT_ADD:
        if fq not in have:
            imps.append('import %s;' % fq)
    imps = sorted(set(imps))
    head = []
    pkg_done = False
    for l in body.split('\n'):
        head.append(l)
        if l.startswith('package ') and not pkg_done:
            pkg_done = True
            head.append('')
            head.extend(imps)
            head.append('')
            # 跳过原有 import 后的空行处理：body 已无 import，直接继续
    return '\n'.join(head)


def main():
    src = open(TARGET, encoding='utf-8', errors='replace').read()
    n0 = len(CALL_RE.findall(src))
    lines0 = src.count('\n')
    src = merge_responses(src)
    print('merge_responses: %d -> %d 行' % (lines0, src.count('\n')))
    src = normalize(src)
    print('normalize:       -> %d 行' % src.count('\n'))
    src = fix_imports(src)
    print('fix_imports:     -> %d 行' % src.count('\n'))
    left = CALL_RE.findall(src)
    open(TARGET, 'w', encoding='utf-8').write(src)
    print('原调用 %d 处；替换后仍剩 %d 处：%s' % (n0, len(left), sorted(set('%s.%s' % t for t in left))))


if __name__ == '__main__':
    main()
