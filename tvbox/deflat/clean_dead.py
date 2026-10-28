"""删除「只被赋值、从未被读取」的局部变量声明与赋值（作用域限定在所属方法内）。"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from fmt import _scan

DECL = re.compile(r'^[ \t]*int\s+(\w+)\s*(?:=\s*(.*?))?;[ \t]*$')


def depths_of(lines):
    out = []
    d = 0
    for l in lines:
        o, c, _ = _scan(l)
        out.append(d)
        d += o - c
    return out


def method_bounds(depths, i):
    D = depths[i]
    n = len(depths)
    lo = i
    while lo > 0 and depths[lo - 1] >= D:
        lo -= 1
    hi = i
    while hi < n - 1 and depths[hi + 1] >= D:
        hi += 1
    return lo, hi


def is_write_only(line, name):
    t = line.strip()
    # 无初值声明：int x;
    if re.fullmatch(r'int\s+' + re.escape(name) + r';', t):
        return True
    m = re.fullmatch(r'(?:int\s+)?' + re.escape(name) + r'\s*=\s*(.*?);', t)
    if not m:
        return False
    rhs = m.group(1)
    return re.search(r'\b' + re.escape(name) + r'\b', rhs) is None


def clean(text):
    removed = 0
    changed = True
    while changed:
        changed = False
        lines = text.split('\n')
        depths = depths_of(lines)
        for i, l in enumerate(lines):
            m = DECL.match(l)
            if not m:
                continue
            name = m.group(1)
            lo, hi = method_bounds(depths, i)
            uses = [j for j in range(lo, hi + 1) if re.search(r'\b' + re.escape(name) + r'\b', lines[j])]
            if not uses or len(uses) > 4:
                continue
            if all(is_write_only(lines[j], name) for j in uses):
                for j in sorted(uses, reverse=True):
                    del lines[j]
                    removed += 1
                text = '\n'.join(lines)
                changed = True
                break
    return text, removed


def main():
    targets = sys.argv[1:] or [r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_deflat\sources\com\github\catvod\spider\Appgz.java"]
    for p in targets:
        s = open(p, encoding='utf-8', errors='replace').read()
        s2, n = clean(s)
        # 压缩连续空行
        s2 = re.sub(r'\n{3,}', '\n\n', s2)
        open(p, 'w', encoding='utf-8').write(s2)
        print('%-28s 删除死变量语句 %d 行' % (os.path.basename(p), n))


if __name__ == '__main__':
    main()
