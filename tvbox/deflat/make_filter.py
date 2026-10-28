"""从 FO.M 提取关键词黑名单，生成 utils/Filter.java。"""
import os
import re
import sys

sys.stdout.reconfigure(encoding='utf-8', errors='replace')
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from jutil import find_close

SRC = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_clean\sources\com\github\catvod\spider\merge\FO.java"
DST = r"d:\dev-tmp\python\2.3\pydemo\decompiled\response\src_deflat\sources\com\github\catvod\utils\Filter.java"

src = open(SRC, encoding='utf-8', errors='replace').read()
i = src.find('public static boolean M(')
j = src.find('{', i)
close = find_close(src, j)
body = src[j:close + 1]

# 展开唯一的外部依赖：C0051.m2242() -> "蒲团"
body = body.replace('C0051.m2242()', '"蒲团"')

m = re.search(r'Arrays\.asList\((.*)\)\s*\)', body, re.S)
words = re.findall(r'"(?:[^"\\]|\\.)*"', m.group(1))
print('关键词 %d 个' % len(words))

# 每行 8 个，保持可读
lines = []
for k in range(0, len(words), 8):
    lines.append('                ' + ', '.join(words[k:k + 8]) + (',' if k + 8 < len(words) else ''))

out = '''package com.github.catvod.utils;

import java.util.Arrays;

/**
 * 内容过滤：命中成人关键词黑名单时返回 true。
 * <p>对应原来的混淆包装 {@code FO.M}（词表原样取自 {@code C0033.m1777()} 同一套规则）。
 */
public final class Filter {

    private Filter() {
    }

    /** 是否命中关键词黑名单。 */
    public static boolean blocked(String str) {
        for (String word : Arrays.asList(
%s
        )) {
            if (str.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
''' % ('\n'.join(lines))

os.makedirs(os.path.dirname(DST), exist_ok=True)
open(DST, 'w', encoding='utf-8').write(out)
print('written', DST, len(out), 'bytes')
