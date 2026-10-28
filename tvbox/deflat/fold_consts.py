"""常量折叠：把 `(-31) ^ C0006.f6` 之类的 OLLVM 守卫常量求值为直接数值。

静态字段值收集自 src_clean 下的 C 类（public static int fNN = N;）。
"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

BASE = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response"
SRC = os.path.join(BASE, 'src_clean', 'sources', 'com', 'github', 'catvod')
DEFLAT = os.path.join(BASE, 'src_deflat', 'sources', 'com', 'github', 'catvod')


def jint(v):
    v &= 0xFFFFFFFF
    return v - 0x100000000 if v >= 0x80000000 else v


def load_fields():
    fields = {}
    for dp, _d, fs in os.walk(SRC):
        for f in fs:
            if not f.endswith('.java'):
                continue
            p = os.path.join(dp, f)
            cls = f[:-5]
            s = open(p, encoding='utf-8', errors='replace').read()
            for m in re.finditer(r'public static (?:final )?int (f\d+)\s*=\s*(-?\d+)\s*;', s):
                fields['%s.%s' % (cls, m.group(1))] = int(m.group(2))
    return fields


NUM = r'\(\s*(-?\d+)\s*\)|(-?\d+)'
EXPR = re.compile(r'(?:' + NUM + r')\s*\^\s*([A-Za-z_$][\w$]*)\.(f\d+)')


def fold_text(text, fields):
    def repl(m):
        a = m.group(1) if m.group(1) is not None else m.group(2)
        key = '%s.%s' % (m.group(3), m.group(4))
        if key not in fields:
            return m.group(0)
        val = jint(int(a) ^ fields[key])
        return str(val)
    prev = None
    out = text
    while prev != out:
        prev = out
        out = EXPR.sub(repl, out)
    return out


def main():
    fields = load_fields()
    targets = sys.argv[1:] or [os.path.join(DEFLAT, 'spider', 'Appgz.java')]
    for p in targets:
        s = open(p, encoding='utf-8', errors='replace').read()
        n0 = len(EXPR.findall(s))
        s2 = fold_text(s, fields)
        n1 = len(re.findall(r'\^ [A-Za-z_$][\w$]*\.f\d+', s2))
        open(p, 'w', encoding='utf-8').write(s2)
        print('%-40s 折叠 %d 处，剩余 %d 处' % (os.path.basename(p), n0 - n1, n1))


if __name__ == '__main__':
    main()
