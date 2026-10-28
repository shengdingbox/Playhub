"""极简 Java 源码结构工具：括号匹配、顶层语句切分（不解析语法，够用即可）。"""

WS = " \t\r\n\f"

STMT_HEADS = ("if", "for", "while", "do", "switch", "try", "synchronized", "else", "catch", "finally")


def find_close(src, open_idx):
    """src[open_idx] 是 '(' 或 '{'，返回配对的 ')'/')' '/'}' 的下标，找不到返回 -1。"""
    pair = {"(": ")", "{": "}"}[src[open_idx]]
    depth = 0
    i = open_idx
    n = len(src)
    while i < n:
        c = src[i]
        if c == '"' or c == "'":
            q = c
            i += 1
            while i < n:
                if src[i] == "\\":
                    i += 2
                    continue
                if src[i] == q:
                    break
                i += 1
        elif c == "/" and i + 1 < n and src[i + 1] == "/":
            j = src.find("\n", i)
            i = n if j < 0 else j
        elif c == "/" and i + 1 < n and src[i + 1] == "*":
            j = src.find("*/", i + 2)
            i = (n if j < 0 else j + 1)
        elif c == "(" or c == "{":
            depth += 1
        elif c in ")}":
            depth -= 1
            if depth == 0:
                return i if src[i] == pair else -1
        i += 1
    return -1


def rfind_open(src, start, close_idx):
    """src[close_idx] 是 '}'，向前找配对的 '{'，返回下标；越界返回 -1。"""
    depth = 0
    i = close_idx
    while i >= start:
        c = src[i]
        if c == "}":
            depth += 1
        elif c == "{":
            depth -= 1
            if depth == 0:
                return i
        i -= 1
    return -1


def rfind_open_paren(src, start, close_idx):
    depth = 0
    i = close_idx
    while i >= start:
        c = src[i]
        if c == ")":
            depth += 1
        elif c == "(":
            depth -= 1
            if depth == 0:
                return i
        i -= 1
    return -1


def skip_ws(src, i, end=None):
    n = len(src) if end is None else end
    while i < n and src[i] in WS:
        i += 1
    return i


def skip_ws_back(src, i, start=0):
    while i >= start and src[i] in WS:
        i -= 1
    return i


def prev_word(src, i):
    """返回位于 i 之前的标识符（跳过空白），以及其起始下标。(None, -1) 表示没有。"""
    j = skip_ws_back(src, i)
    if j < 0:
        return None, -1
    if not (src[j].isalnum() or src[j] in "_$"):
        return None, -1
    k = j
    while k >= 0 and (src[k].isalnum() or src[k] in "_$"):
        k -= 1
    return src[k + 1:j + 1], k + 1


def is_boundary(src, i):
    return i < 0 or not (src[i].isalnum() or src[i] in "_$")


def last_statement(src, start, end):
    """返回 [start,end) 内最后一条顶层语句的 (s, e) 下标；没有语句返回 None。"""
    i = skip_ws_back(src, end - 1, start)
    if i < start:
        return None
    if src[i] == ";":
        j = i - 1
        depth = 0
        while j >= start:
            c = src[j]
            if c in ")}":
                depth += 1
            elif c in "({":
                depth -= 1
                if depth < 0:
                    return j + 1, i + 1
            elif c == ";" and depth == 0:
                return j + 1, i + 1
            elif c in "}{" and depth == 0:
                return j + 1, i + 1
            j -= 1
        return start, i + 1
    if src[i] == "}":
        e = i + 1
        cur = i
        while True:
            o = rfind_open(src, start, cur)
            if o < 0:
                return None
            s = o
            # 向前延伸 analyses: else / catch / finally / do-while
            j = skip_ws_back(src, o - 1, start)
            word, wpos = prev_word(src, j + 1) if j >= 0 else (None, -1)
            if word in ("else", "try", "catch", "finally", "do") or (
                word is None and j >= 0 and src[j] == ";"
            ):
                # do-while: "... } while (cond);"
                if word is None and src[j] == ";":
                    cur = j - 1
                    continue
                # else/catch/finally/try：继续往前找上一条语句的结束
                k = skip_ws_back(src, (wpos if word else j) - 1, start)
                if k < start:
                    return s, e
                if src[k] == "}":
                    cur = k
                    continue
                return start, e
            # 复合头，例如 while (..) { .. } / if (..) { .. }
            k = skip_ws_back(src, o - 1, start)
            if k >= start and src[k] == ")":
                p = rfind_open_paren(src, start, k)
                if p > start:
                    kw = prev_word(src, p)[0]
                    return prev_word(src, p)[1], e
            return start, e


def strip_comments(text):
    out = []
    i = 0
    n = len(text)
    while i < n:
        c = text[i]
        if c == '"' or c == "'":
            q = c
            out.append(c)
            i += 1
            while i < n:
                out.append(text[i])
                if text[i] == "\\":
                    if i + 1 < n:
                        out.append(text[i + 1])
                        i += 2
                        continue
                elif text[i] == q:
                    i += 1
                    break
                i += 1
            continue
        if c == "/" and i + 1 < n and text[i + 1] == "/":
            j = text.find("\n", i)
            i = n if j < 0 else j
            continue
        if c == "/" and i + 1 < n and text[i + 1] == "*":
            j = text.find("*/", i + 2)
            i = n if j < 0 else j + 2
            continue
        out.append(c)
        i += 1
    return "".join(out)


HEAD_KEYWORDS = ("if", "for", "while", "do", "switch", "try", "synchronized")


def _word_at(src, i, end):
    if i >= end or not (src[i].isalpha() or src[i] in "_$"):
        return None
    j = i
    while j < end and (src[j].isalnum() or src[j] in "_$"):
        j += 1
    return src[i:j]


def _skip_header(src, i, end):
    """跳过 if/while 等头部，返回第一个 '{' 的位置（找不到返回 -1）。"""
    while i < end:
        c = src[i]
        if c == '"' or c == "'":
            q = c
            i += 1
            while i < end:
                if src[i] == "\\":
                    i += 2
                    continue
                if src[i] == q:
                    break
                i += 1
        elif c == "(":
            r = find_close(src, i)
            if r < 0:
                return -1
            i = r + 1
            continue
        elif c == "{":
            return i
        elif c == ";":
            return -1
        i += 1
    return -1


def parse_statement(src, i, end):
    """解析 start..end 中的一条语句，返回结束下标。"""
    i = skip_ws(src, i, end)
    if i >= end:
        return end
    w = _word_at(src, i, end)
    if w in HEAD_KEYWORDS or (w == "do" and True):
        is_stmt_head = w in HEAD_KEYWORDS and _boundary_after_word(src, i, end, w)
    else:
        is_stmt_head = False
    if not is_stmt_head:
        # 普通语句：找 depth 0 的 ';'（花括号组结束后不必再等 ';'）
        bdepth = 0
        pdepth = 0
        opened = False
        j = i
        while j < end:
            c = src[j]
            if c == '"' or c == "'":
                q = c
                j += 1
                while j < end:
                    if src[j] == "\\":
                        j += 2
                        continue
                    if src[j] == q:
                        break
                    j += 1
            elif c == "/" and j + 1 < end and src[j + 1] == "/":
                k = src.find("\n", j, end)
                j = end if k < 0 else k
            elif c == "/" and j + 1 < end and src[j + 1] == "*":
                k = src.find("*/", j + 2, end)
                j = end if k < 0 else k + 2
                continue
            elif c == "{":
                bdepth += 1
                opened = True
            elif c == "(":
                pdepth += 1
            elif c == ")":
                pdepth -= 1
            elif c == "}":
                bdepth -= 1
                if bdepth <= 0 and opened and pdepth <= 0:
                    bdepth = 0
                    k2 = skip_ws(src, j + 1, end)
                    if k2 >= end:
                        return j + 1
                    if src[k2] == ";":
                        return k2 + 1
                    if src[k2] in ".[(":
                        j = k2
                        continue
                    return j + 1
            elif c == ";" and bdepth == 0 and pdepth == 0:
                return j + 1
            j += 1
        return end
    # 复合语句
    lb = _skip_header(src, i, end)
    if lb < 0:
        j = src.find(";", i, end)
        return end if j < 0 else j + 1
    rb = find_close(src, lb)
    if rb < 0:
        return end
    i = rb + 1
    while True:
        k = skip_ws(src, i, end)
        if k >= end:
            break
        w2 = _word_at(src, k, end)
        if w2 == "else" and _boundary_after_word(src, k, end, w2):
            i = k + 4
            k2 = skip_ws(src, i, end)
            w3 = _word_at(src, k2, end)
            if w3 == "if" and _boundary_after_word(src, k2, end, w3):
                i = parse_statement(src, k2, end)
                break
            lb2 = _skip_header(src, i, end)
            if lb2 < 0:
                break
            rb2 = find_close(src, lb2)
            if rb2 < 0:
                break
            i = rb2 + 1
            continue
        if w2 in ("catch", "finally") and _boundary_after_word(src, k, end, w2):
            lb2 = _skip_header(src, k, end)
            if lb2 < 0:
                break
            rb2 = find_close(src, lb2)
            if rb2 < 0:
                break
            i = rb2 + 1
            continue
        if src[k] == ";" or src[k] == "}":
            break
        # do-while 尾或用 else 的无花括号体：交给下一次循环
        nxt = parse_statement(src, k, end) if w2 in HEAD_KEYWORDS else -1
        if nxt > k and src[k:k + 2] != "if":
            pass
        break
    return i


def _boundary_after_word(src, i, end, w):
    j = i + len(w)
    return j >= end or not (src[j].isalnum() or src[j] in "_$")


def split_statements(src, start, end):
    """切分 [start,end) 内的顶层语句，返回 [(s,e)]。"""
    out = []
    i = skip_ws(src, start, end)
    while i < end:
        if src[i] == ";":
            i += 1
            continue
        if src[i] == "}":
            break
        nxt = parse_statement(src, i, end)
        if nxt <= i:
            break
        if src[i:nxt].strip():
            out.append((i, nxt))
        i = nxt
    return out


def split_cases(src, body_start, body_end):
    """切分 switch 体。返回 [([标签...], body_start, body_end)]，body 为空时 body_start 为 None。"""
    out = []
    i = body_start
    depth = 0
    cur_labels = None
    cur_body = None

    def flush(end):
        nonlocal cur_labels, cur_body
        if cur_labels is None:
            return
        s = cur_body
        if s is not None:
            probe = skip_ws(src, s, end)
            w = _word_at(src, probe, end)
            if w in ("case", "default") and src[skip_ws(src, probe + len(w), end):skip_ws(src, probe + len(w), end) + 1] == ":":
                s = None
            elif s >= end:
                s = None
        out.append((cur_labels, s, end))
        cur_labels = None
        cur_body = None

    while i < body_end:
        c = src[i]
        if c == '"' or c == "'":
            q = c
            i += 1
            while i < body_end:
                if src[i] == "\\":
                    i += 2
                    continue
                if src[i] == q:
                    break
                i += 1
        elif c == "/" and i + 1 < body_end and src[i + 1] == "/":
            j = src.find("\n", i, body_end)
            i = body_end if j < 0 else j
        elif c == "/" and i + 1 < body_end and src[i + 1] == "*":
            j = src.find("*/", i + 2, body_end)
            i = body_end if j < 0 else j + 2
            continue
        elif depth == 0 and src.startswith("case", i) and is_boundary(src, i - 1):
            j = i + 4
            if j < body_end and src[j] in " \t":
                j = skip_ws(src, j, body_end)
                k = j
                while k < body_end and (src[k].isalnum() or src[k] in "_$"):
                    k += 1
                if k < body_end and src[k] == ":":
                    flush(i)
                    cur_labels = [src[j:k].strip()]
                    cur_body = k + 1
                    i = k + 1
                    continue
        elif depth == 0 and src.startswith("default", i) and is_boundary(src, i - 1):
            j = skip_ws(src, i + 7, body_end)
            if j < body_end and src[j] == ":":
                flush(i)
                cur_labels = ["default"]
                cur_body = j + 1
                i = j + 1
                continue
        elif c == "{":
            depth += 1
        elif c == "}":
            depth -= 1
        i += 1
    flush(body_end)
    return out
