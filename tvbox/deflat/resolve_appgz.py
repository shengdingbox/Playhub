"""按 Appgz.java 的 import/包规则，精确解析它用到的混淆方法，输出实现摘要。

混淆类名在多个包中重复（parser.C0002 与 merge.C0002 并非同一个类），
因此必须按目标文件的 import + 同包规则解析。
"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from jutil import find_close

ROOT = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_clean\sources"
TARGET = sys.argv[1] if len(sys.argv) > 1 else os.path.join(ROOT, 'com/github/catvod/spider/Appgz.java')
OUT = sys.argv[2] if len(sys.argv) > 2 else None


def build_index():
    """简单类名 -> [(包名, 路径)]，以及 全限定名 -> 路径。"""
    by_simple = {}
    by_fqn = {}
    for dp, _d, fs in os.walk(ROOT):
        for f in fs:
            if not f.endswith('.java'):
                continue
            p = os.path.join(dp, f)
            head = open(p, encoding='utf-8', errors='replace').read(400)
            m = re.search(r'package\s+([\w.]+)\s*;', head)
            pkg = m.group(1) if m else ''
            simple = f[:-5]
            by_simple.setdefault(simple, []).append((pkg, p))
            by_fqn['%s.%s' % (pkg, simple)] = p
    return by_simple, by_fqn


def resolve_class(name, imports, self_pkg, by_simple, by_fqn):
    if name in imports:
        return by_fqn.get(imports[name])
    fqn = '%s.%s' % (self_pkg, name)
    if fqn in by_fqn:
        return by_fqn[fqn]
    cands = by_simple.get(name, [])
    if len(cands) == 1:
        return cands[0][1]
    return None


def method_body(src, meth):
    m = re.search(r'(?:^|\n)[ \t]*(?:public|private|protected)?[ \t]*(?:static[ \t]+)?[^\n]*\b' + meth + r'\([^;{]*\)[^\n{]*\{', src)
    if not m:
        return None, ''
    j = src.find('{', m.start())
    close = find_close(src, j)
    if close < 0:
        return None, ''
    ln = src[:m.start()].count('\n') + 1
    return ln, src[m.start():close + 1]


def main():
    src = open(TARGET, encoding='utf-8', errors='replace').read()
    self_pkg = re.search(r'package\s+([\w.]+)\s*;', src).group(1)
    imports = {}
    for m in re.finditer(r'import\s+(?:static\s+)?([\w.]+)\s*;', src):
        imports[m.group(1).split('.')[-1]] = m.group(1)
    by_simple, by_fqn = build_index()

    seen = {}
    order = []
    for m in re.finditer(r'\b(C\d{4}\w*)\.(m\d+)\s*\(', src):
        key = (m.group(1), m.group(2))
        if key not in seen:
            seen[key] = src[:m.start()].count('\n') + 1
            order.append(key)

    buf = []
    buf.append('目标: %s  (package %s)' % (TARGET, self_pkg))
    buf.append('调用 ${} 处不同方法 %d 个' % len(order))
    for cls, meth in order:
        path = resolve_class(cls, imports, self_pkg, by_simple, by_fqn)
        pkg = ''
        if path:
            head = open(path, encoding='utf-8', errors='replace').read(400)
            mm = re.search(r'package\s+([\w.]+)\s*;', head)
            pkg = mm.group(1) if mm else ''
        buf.append('')
        buf.append('=' * 72)
        buf.append('%s.%s   @Appgz:%d' % (cls, meth, seen[(cls, meth)]))
        buf.append('  class -> %s' % (path or '?? 未解析'))
        if not path:
            continue
        s = open(path, encoding='utf-8', errors='replace').read()
        ln, body = method_body(s, meth)
        buf.append('  定义于 %s:%s' % (os.path.basename(path), ln))
        txt = body
        if len(txt) > 1200:
            txt = txt[:1000] + '\n    ... [共 %d 字符]' % len(body)
        buf.append(txt)

    text = '\n'.join(buf)
    if OUT:
        open(OUT, 'w', encoding='utf-8').write(text)
        print('written', OUT, len(text))
    else:
        print(text)


if __name__ == '__main__':
    main()
