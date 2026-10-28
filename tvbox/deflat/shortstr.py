"""求解 short[] 异或字符串解密调用：Cxxxx.mNNN(fNNshort, off, len, key) -> 明文字符串。

用法：
  python shortstr.py scan            # 全项目统计
  python shortstr.py eval <文件>     # 打印某文件中所有解密调用及其明文
"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from jutil import find_close

ROOT = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_clean\sources\com\github\catvod"

ARR_RE = re.compile(r'(?:static|final|\s)+short\[\]\s+(\w+)\s*=\s*\{([^{}]*)\}\s*;')
SIG_RE = re.compile(
    r'static\s+String\s+(\w+)\s*\(\s*short\[\]\s*(\w+)\s*,\s*int\s+(\w+)\s*,\s*int\s+(\w+)\s*,\s*int\s+(\w+)\s*\)\s*\{'
)
CALL_RE = r'(C\d{4}\w*)\.(m\d+)\(\s*([A-Za-z_$][\w$]*)\s*,\s*(-?\d+)\s*,\s*(-?\d+)\s*,\s*(-?\d+)\s*\)'


def java_files(root):
    for dp, _d, fs in os.walk(root):
        for f in sorted(fs):
            if f.endswith('.java'):
                yield os.path.join(dp, f)


class Tables(object):
    def __init__(self, root):
        self.arrays = {}      # (类名, 字段名) -> [int]
        self.decrypts = {}    # (类名, 方法名) -> 参数个数变体
        for p in java_files(root):
            cls = os.path.basename(p)[:-5]
            s = open(p, encoding='utf-8', errors='replace').read()
            for m in ARR_RE.finditer(s):
                vals = [int(x) for x in re.findall(r'-?\d+', m.group(2))]
                self.arrays[(cls, m.group(1))] = vals
            for m in SIG_RE.finditer(s):
                close = find_close(s, m.end() - 1)
                if close < 0:
                    continue
                body = s[m.end():close]
                if re.search(r'\b%s\s*\[' % m.group(2), body) and re.search(r'\^\s*%s\b' % m.group(5), body):
                    self.decrypts[(cls, m.group(1))] = True

    def resolve(self, cls, mname, arrname, off, ln, key):
        if (cls, mname) not in self.decrypts:
            return None
        arr = None
        if (cls, arrname) in self.arrays:
            arr = self.arrays[(cls, arrname)]
        else:
            for (c2, a2), v in self.arrays.items():
                if a2 == arrname:
                    arr = v
                    break
        if arr is None or off < 0 or off + ln > len(arr):
            return None
        try:
            return ''.join(chr(arr[off + i] ^ key) for i in range(ln))
        except ValueError:
            return None


def main():
    t = Tables(ROOT)
    print('short[] 数组: %d 个,  解密方法: %d 个' % (len(t.arrays), len(t.decrypts)))
    if len(sys.argv) > 1 and sys.argv[1] == 'eval':
        p = sys.argv[2]
        s = open(p, encoding='utf-8', errors='replace').read()
        n = ok = 0
        for m in re.finditer(CALL_RE, s):
            n += 1
            v = t.resolve(m.group(1), m.group(2), m.group(3), int(m.group(4)), int(m.group(5)), int(m.group(6)))
            if v is None:
                print('  ?? %s' % m.group(0)[:60])
                continue
            ok += 1
            line = s[:m.start()].count('\n') + 1
            print('  %5d  %-52s -> %r' % (line, m.group(0)[:52], v))
        print('total %d, resolved %d' % (n, ok))
        return
    total = resolved = 0
    files = 0
    for p in java_files(ROOT):
        s = open(p, encoding='utf-8', errors='replace').read()
        c = 0
        r = 0
        for m in re.finditer(CALL_RE, s):
            c += 1
            if t.resolve(m.group(1), m.group(2), m.group(3), int(m.group(4)), int(m.group(5)), int(m.group(6))) is not None:
                r += 1
        if c:
            files += 1
        total += c
        resolved += r
    print('调用点 %d 处, 可求解 %d 处（涉及 %d 个文件）' % (total, resolved, files))


if __name__ == '__main__':
    main()
