"""探查混淆工具方法的真实语义：给定 (类, 方法) 列表，打印其实现骨架。"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

ROOT = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_clean\sources\com\github\catvod"


def index_files():
    files = {}
    for root, _d, fs in os.walk(ROOT):
        for f in fs:
            if f.endswith('.java'):
                files.setdefault(f[:-5], os.path.join(root, f))
    return files


def ascii_safe(s):
    return ''.join(ch if 32 <= ord(ch) < 127 or ch in '\n\t' else '?' for ch in s)


def probe(files, cls, meth, depth=0, seen=None, ctxlen=320):
    seen = seen or set()
    key = (cls, meth)
    if key in seen or depth > 2:
        return
    seen.add(key)
    p = files.get(cls)
    if not p:
        print('%s%s.%s  ?? class not found' % ('  ' * depth, cls, meth))
        return
    s = open(p, encoding='utf-8', errors='replace').read()
    mm = re.search(r'(?:^|\n)[ \t]*(?:public|private|protected)?[ \t]*(?:static[ \t]+)?[^\n]*\b' + meth + r'\([^;{]*\)[^\n{]*\{', s)
    if not mm:
        print('%s%s.%s  ?? method not found' % ('  ' * depth, cls, meth))
        return
    ln = s[:mm.start()].count('\n') + 1
    seg = ascii_safe(s[mm.start():mm.start() + ctxlen]).replace('\n', ' ')
    print('%s%s.%s (line %d): %s' % ('  ' * depth, os.path.basename(p), meth, ln, seg[:300]))
    # 递归探查被调用的其它混淆方法
    for c2, m2 in set(re.findall(r'\b(C\d{4}\w*)\.(m\d+)\(', s[mm.start():mm.start() + ctxlen])):
        probe(files, c2, m2, depth + 1, seen)


if __name__ == '__main__':
    files = index_files()
    pairs = []
    for a in sys.argv[1:]:
        cls, meth = a.split('.')
        pairs.append((cls, meth))
    for cls, meth in pairs:
        probe(files, cls, meth)
        print()
