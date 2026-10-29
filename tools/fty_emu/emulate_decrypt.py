"""
用 Unicorn 在 x86 上模拟执行 ftyguard_v7.so 的 decrypt。

思路：不逆向算法，而是把 .so 加载进 Unicorn，伪造 JNIEnv 和 libc 导入，
直接调用 decrypt 让它自己算出结果。

关键技巧：.data 段的字符串在设备上是由 .datadiv_decode 运行时解密的，
我们手里有运行时 dump（runtime.bin），直接把它覆盖进内存，绕开解密步骤。

用法：
    python emulate_decrypt.py <密文字符串>
"""
import os
import struct
import sys

from capstone import Cs, CS_ARCH_ARM, CS_MODE_THUMB
from unicorn import (
    Uc, UC_ARCH_ARM, UC_MODE_ARM, UC_MODE_THUMB, UC_HOOK_CODE, UC_HOOK_MEM_UNMAPPED,
    UC_HOOK_MEM_WRITE, UC_HOOK_MEM_READ, UcError,
)
from unicorn.arm_const import *

HERE = os.path.dirname(os.path.abspath(__file__))
SO_PATH = os.path.join(HERE, "ftyguard_v7.so")
RT_PATH = os.path.join(HERE, "runtime.bin")

BASE = 0x40000000          # .so 加载基址
STACK_TOP = 0x70100000     # 栈顶
STACK_SIZE = 0x100000
JNI_ENV = 0x60000000       # JNIEnv* 指向这里（内容 = 函数表指针）
JNI_TABLE = 0x60000010     # JNINativeInterface 函数表
JNI_TRAP = 0x50000000      # JNI 函数陷阱区（每函数 4 字节）
IMP_TRAP = 0x51000000      # libc 导入函数陷阱区
HEAP = 0x52000000          # 简易堆
HEAP_SIZE = 0x100000
JSTR = 0x53000000          # 伪造 jstring 对象
STRBUF = 0x53100000        # 字符串缓冲区

DECRYPT_FN = 0xc349        # JNI 方法表里查到的 decrypt 地址（奇数=Thumb）


class Emu:
    def __init__(self, verbose=False):
        self.verbose = verbose
        self.uc = Uc(UC_ARCH_ARM, UC_MODE_THUMB)
        self.heap_ptr = HEAP
        self.decrypted = {}
        self.load_so()
        self.setup_jni()
        self.hook()

    # ---------- 加载 ----------
    def load_so(self):
        d = open(SO_PATH, "rb").read()
        self.data = d
        phoff = struct.unpack_from("<I", d, 0x1C)[0]
        phentsize = struct.unpack_from("<H", d, 0x2A)[0]
        phnum = struct.unpack_from("<H", d, 0x2C)[0]

        segs = []
        for i in range(phnum):
            o = phoff + i * phentsize
            (p_type, p_offset, p_vaddr, _paddr, p_filesz, p_memsz,
             _flags, _align) = struct.unpack_from("<IIIIIIII", d, o)
            if p_type == 1:
                segs.append((p_vaddr, p_memsz, p_filesz, p_offset))

        # 覆盖整个镜像范围
        lo = min(s[0] for s in segs)
        hi = max(s[0] + s[1] for s in segs)
        size = (hi - lo + 0xFFF) & ~0xFFF
        self.image_lo = BASE + lo
        self.image_hi = self.image_lo + size
        self.uc.mem_map(self.image_lo, size, 7)

        for vaddr, memsz, filesz, offset in segs:
            self.uc.mem_write(BASE + vaddr, d[offset:offset + filesz])

        self.segs = segs
        self.apply_runtime_data()
        self.apply_relocations()

    def apply_runtime_data(self):
        """用运行时 dump 覆盖 .data 段：磁盘上是密文，设备上已解密。"""
        if not os.path.exists(RT_PATH):
            print("[!] 没有 runtime.bin，.data 里的字符串将是密文")
            return
        rt = open(RT_PATH, "rb").read()
        # dump 布局: 0x0..0x13000 -> vaddr 0x0..0x13000 ; 0x13000.. -> off 0x12000..
        # 简化：把 dump 中 0x14000 起的 0x6d0 字节覆盖到 vaddr 0x14000
        self.uc.mem_write(BASE + 0x14000, rt[0x14000:0x14000 + 0x6d0])
        self.uc.mem_write(BASE + 0x13000, rt[0x12000:0x12000 + 0x1000])
        if self.verbose:
            print("[*] 已用运行时数据覆盖 .data")

    def apply_relocations(self):
        d = self.data
        shoff = struct.unpack_from("<I", d, 0x20)[0]
        shent = struct.unpack_from("<H", d, 0x2E)[0]
        shnum = struct.unpack_from("<H", d, 0x30)[0]
        shstrndx = struct.unpack_from("<H", d, 0x32)[0]
        secs = []
        for i in range(shnum):
            o = shoff + i * shent
            nm, st, fl, ad, of, sz, lk, inf, al, es = struct.unpack_from("<IIIIIIIIII", d, o)
            secs.append(dict(nm=nm, type=st, addr=ad, off=of, sz=sz, link=lk, es=es))
        sh = secs[shstrndx]
        def sname(n):
            p = sh["off"] + n
            e = d.index(b"\0", p)
            return d[p:e].decode("utf-8", "ignore")
        for s in secs:
            s["name"] = sname(s["nm"])

        dynsym = next(s for s in secs if s["name"] == ".dynsym")
        dynstr = next(s for s in secs if s["name"] == ".dynstr")
        ent = dynsym["es"] or 16

        def symname(i):
            nm = struct.unpack_from("<I", d, dynsym["off"] + i * ent)[0]
            p = dynstr["off"] + nm
            e = d.index(b"\0", p)
            return d[p:e].decode("utf-8", "ignore")

        # --- 统一处理重定位 ---
        # 2  = R_ARM_ABS32
        # 21 = R_ARM_GLOB_DAT   (符号绝对地址)
        # 22 = R_ARM_JUMP_SLOT  (PLT 跳转槽)
        # 23 = R_ARM_RELATIVE   (相对基址)
        self.imports = {}
        self.data_syms = {}
        self.reloc_log = []

        def sym_value(symidx, rtype):
            """返回该符号应写入的地址。"""
            base_off = dynsym["off"] + symidx * ent
            st_name, st_value, _sz, _info, _other, st_shndx = struct.unpack_from("<IIIBBH", d, base_off)
            name = symname(symidx)
            if st_shndx == 0:  # 未定义 -> 导入
                sym_type = _info & 0xF
                if sym_type == 1:  # OBJECT（数据符号）：要给真实内存
                    if name not in self.data_syms:
                        # __sF 是 stdio 文件数组，给大一点
                        size = 0x1000 if name == "__sF" else 0x40
                        ptr = self.heap_alloc(size)
                        try:
                            self.uc.mem_write(ptr, b"\x00" * size)
                        except UcError:
                            pass
                        self.data_syms[name] = ptr
                    return self.data_syms[name]
                if name not in self.imports:
                    self.imports[name] = IMP_TRAP + len(self.imports) * 4
                return self.imports[name]
            if st_value:
                return (BASE + st_value) & 0xFFFFFFFF
            return 0

        for secname in (".rel.dyn", ".rel.plt"):
            rel = next((x for x in secs if x["name"] == secname), None)
            if not rel:
                continue
            for i in range(rel["sz"] // 8):
                o = rel["off"] + i * 8
                r_off, r_info = struct.unpack_from("<II", d, o)
                rtype = r_info & 0xFF
                symidx = r_info >> 8
                try:
                    if rtype == 23:  # RELATIVE
                        cur = struct.unpack("<I", self.uc.mem_read(BASE + r_off, 4))[0]
                        newv = (cur + BASE) & 0xFFFFFFFF
                        self.reloc_log.append((r_off, rtype, "", newv))
                    elif rtype == 2:  # ABS32
                        cur = struct.unpack("<I", self.uc.mem_read(BASE + r_off, 4))[0]
                        newv = (cur + BASE) & 0xFFFFFFFF
                        self.reloc_log.append((r_off, rtype, "", newv))
                    elif rtype in (21, 22):  # GLOB_DAT / JUMP_SLOT
                        newv = sym_value(symidx, rtype)
                        self.reloc_log.append((r_off, rtype, symname(symidx), newv))
                    else:
                        continue
                    self.uc.mem_write(BASE + r_off, struct.pack("<I", newv))
                except (UcError, Exception):
                    pass

        if self.verbose:
            print(f"[*] 重定位 {len(self.reloc_log)} 项 / 导入函数 {len(self.imports)} / 数据符号 {len(self.data_syms)}")

    # ---------- JNI ----------
    def setup_jni(self):
        self.uc.mem_map(JNI_ENV, 0x1000, 7)
        self.uc.mem_map(JNI_TRAP, 0x1000, 7)
        self.uc.mem_map(IMP_TRAP, 0x1000, 7)
        self.uc.mem_map(HEAP, HEAP_SIZE, 7)
        self.uc.mem_map(JSTR, 0x2000, 7)
        self.uc.mem_map(STRBUF, 0x10000, 7)
        # JNIEnv* 指向的这个槽位存放「函数表指针」
        self.uc.mem_write(JNI_ENV, struct.pack("<I", JNI_TABLE))
        # 200 个 vtable 槽位，全部指向陷阱（按索引区分）
        table = b"".join(struct.pack("<I", JNI_TRAP + i * 4) for i in range(200))
        self.uc.mem_write(JNI_TABLE, table)

    def hook(self):
        self.uc.hook_add(UC_HOOK_CODE, self.on_code, begin=JNI_TRAP, end=JNI_TRAP + 0x800)
        self.uc.hook_add(UC_HOOK_CODE, self.on_import, begin=IMP_TRAP, end=IMP_TRAP + 0x800)

    def on_code(self, uc, address, size, _):
        """JNI vtable 调用。"""
        idx = (address - JNI_TRAP) // 4
        lr = uc.reg_read(UC_ARM_REG_LR)
        args = [uc.reg_read(r) for r in (UC_ARM_REG_R0, UC_ARM_REG_R1, UC_ARM_REG_R2, UC_ARM_REG_R3)]
        if self.verbose:
            print(f"    [JNI #{idx}] args={[hex(a) for a in args]}")
        # 常见索引
        # 167 GetStringUTFChars(JNIEnv*, jstring, jboolean*)
        # 169 ReleaseStringUTFChars
        # 163 NewStringUTF
        ret = 0
        if idx == 169:      # GetStringUTFChars(env, jstring, jboolean*)
            jstr, out_is_copy = args[1], args[2]
            ret = self.jstr_buf
            self.current_jstr = jstr
            if out_is_copy:
                uc.mem_write(out_is_copy, b"\x00\x00\x00\x00")
        elif idx == 170:    # ReleaseStringUTFChars
            ret = 0
        elif idx == 167:    # NewStringUTF(env, const char*)
            ptr = args[1] if len(args) > 1 else 0
            try:
                s = self.read_cstr(ptr)
            except Exception:
                s = b""
            # 记录解出的明文
            self.decrypted[len(self.decrypted)] = s
            print(f"    ★ NewStringUTF -> {s!r}")
            ret = JSTR + 0x100
        elif idx == 163:    # NewString(env, const jchar* unicode, jsize len)
            ptr, length = args[1], args[2]
            text = ""
            if ptr and length:
                try:
                    raw = bytes(uc.mem_read(ptr, length * 2))
                    text = raw.decode("utf-16-le", "ignore")
                except UcError:
                    text = ""
            self.decrypted[len(self.decrypted)] = text
            print(f"    ★ NewString(len={length}) -> {text!r}")
            ret = JSTR + 0x100
        else:
            if self.verbose:
                print(f"    [JNI #{idx}] 未处理，返回 0")
        uc.reg_write(UC_ARM_REG_R0, ret)
        uc.reg_write(UC_ARM_REG_PC, lr)

    def on_import(self, uc, address, size, _):
        """libc 导入函数。"""
        name = next((n for n, a in self.imports.items() if a == address), None)
        lr = uc.reg_read(UC_ARM_REG_LR)
        a0, a1, a2 = (uc.reg_read(UC_ARM_REG_R0), uc.reg_read(UC_ARM_REG_R1),
                      uc.reg_read(UC_ARM_REG_R2))
        ret = 0
        if name in ("malloc",):
            ret = self.heap_alloc(a0)
        elif name == "free":
            ret = 0
        elif name == "strlen":
            p = a0
            n = 0
            while True:
                try:
                    b = uc.mem_read(p + n, 1)[0]
                except UcError:
                    break
                if b == 0:
                    break
                n += 1
            ret = n
        elif name == "strcpy":
            src = self.read_cstr(a1)
            uc.mem_write(a0, src + b"\x00")
            ret = a0
        elif name == "strcat":
            dst = self.read_cstr(a0)
            src = self.read_cstr(a1)
            uc.mem_write(a0, dst + src + b"\x00")
            ret = a0
        elif name == "strdup":
            s = self.read_cstr(a0)
            p = self.heap_alloc(len(s) + 1)
            uc.mem_write(p, s + b"\x00")
            ret = p
        elif name in ("__aeabi_memcpy", "memcpy"):
            if a2:
                data = bytes(uc.mem_read(a1, a2))
                uc.mem_write(a0, data)
            ret = a0
        elif name in ("__aeabi_memclr", "__aeabi_memclr4", "__aeabi_memclr8"):
            if a1:
                uc.mem_write(a0, b"\x00" * a1)
            ret = a0
        elif name in ("__aeabi_idiv", "__aeabi_idivmod"):
            if a1:
                q = int(a0 / a1) if a1 else 0
                ret = q & 0xFFFFFFFF
                if name == "__aeabi_idivmod":
                    uc.reg_write(UC_ARM_REG_R1, a0 % a1)
        elif name == "atoi":
            s = self.read_cstr(a0)
            try:
                ret = int(s.decode().strip() or "0")
            except Exception:
                ret = 0
        elif name == "mbrtowc":
            # size_t mbrtowc(wchar_t *pwc, const char *s, size_t n, mbstate_t *ps)
            pwc, src, n = a0, a1, a2
            ps = uc.reg_read(UC_ARM_REG_R3)
            if src == 0:
                ret = 0
            elif n == 0:
                ret = 0xFFFFFFFE  # -2 incomplete
            else:
                try:
                    data = bytes(uc.mem_read(src, min(n, 4)))
                except UcError:
                    data = b""
                if not data:
                    ret = 0xFFFFFFFF
                else:
                    b0 = data[0]
                    if b0 == 0:
                        if pwc:
                            uc.mem_write(pwc, struct.pack("<I", 0))
                        ret = 0
                    else:
                        cp, used = b0, 1
                        if b0 >= 0xF0 and len(data) >= 4:
                            cp = ((b0 & 0x07) << 18) | ((data[1] & 0x3F) << 12) | ((data[2] & 0x3F) << 6) | (data[3] & 0x3F)
                            used = 4
                        elif b0 >= 0xE0 and len(data) >= 3:
                            cp = ((b0 & 0x0F) << 12) | ((data[1] & 0x3F) << 6) | (data[2] & 0x3F)
                            used = 3
                        elif b0 >= 0xC0 and len(data) >= 2:
                            cp = ((b0 & 0x1F) << 6) | (data[1] & 0x3F)
                            used = 2
                        if pwc:
                            uc.mem_write(pwc, struct.pack("<I", cp))
                        ret = used
        elif name == "wcrtomb":
            # size_t wcrtomb(char *s, wchar_t wc, mbstate_t *ps)
            if a0:
                cp = a1
                if cp < 0x80:
                    uc.mem_write(a0, bytes([cp]))
                    ret = 1
                elif cp < 0x800:
                    uc.mem_write(a0, bytes([0xC0 | (cp >> 6), 0x80 | (cp & 0x3F)]))
                    ret = 2
                elif cp < 0x10000:
                    uc.mem_write(a0, bytes([0xE0 | (cp >> 12), 0x80 | ((cp >> 6) & 0x3F), 0x80 | (cp & 0x3F)]))
                    ret = 3
                else:
                    uc.mem_write(a0, bytes([0xF0 | (cp >> 18), 0x80 | ((cp >> 12) & 0x3F),
                                            0x80 | ((cp >> 6) & 0x3F), 0x80 | (cp & 0x3F)]))
                    ret = 4
            else:
                ret = 1
        elif name == "strstr":
            hay = self.read_cstr(a0)
            needle = self.read_cstr(a1)
            i = hay.find(needle)
            ret = (a0 + i) if i >= 0 else 0
        elif name in ("time",):
            ret = 1700000000
        elif name in ("localtime", "localtime_r"):
            ret = HEAP  # 假 struct tm
        elif name == "strftime":
            # strftime(buf, max, fmt, tm) -> 写入个固定串
            fmt = self.read_cstr(a2)
            out = b"20261028"
            uc.mem_write(a0, out + b"\x00")
            ret = len(out)
        elif name in ("sprintf", "snprintf"):
            ret = 0
        elif name in ("abort", "raise", "__stack_chk_fail"):
            print(f"    [!] 调用了 {name} —— 可能是算法检测到异常")
            uc.emu_stop()
            return
        else:
            if self.verbose:
                print(f"    [libc {name}] 未实现，返回 0")
        uc.reg_write(UC_ARM_REG_R0, ret & 0xFFFFFFFF)
        uc.reg_write(UC_ARM_REG_PC, lr)

    # ---------- 工具 ----------
    def heap_alloc(self, n):
        p = self.heap_ptr
        self.heap_ptr += (n + 15) & ~15
        return p

    def read_cstr(self, p, limit=4096):
        out = bytearray()
        for i in range(limit):
            try:
                b = self.uc.mem_read(p + i, 1)[0]
            except UcError:
                break
            if b == 0:
                break
            out.append(b)
        return bytes(out)

    # ---------- 调用 ----------
    def call_decrypt(self, cipher):
        uc = self.uc
        uc.mem_map(STACK_TOP - STACK_SIZE, STACK_SIZE, 7)
        sp = STACK_TOP - 0x1000

        # 把密文写进 jstring 缓冲
        self.jstr_buf = STRBUF
        uc.mem_write(self.jstr_buf, cipher.encode() + b"\x00")
        self.current_jstr = JSTR

        # r0=JNIEnv*, r1=jclass, r2=jstring
        uc.reg_write(UC_ARM_REG_R0, JNI_ENV)
        uc.reg_write(UC_ARM_REG_R1, 0)
        uc.reg_write(UC_ARM_REG_R2, JSTR)
        uc.reg_write(UC_ARM_REG_SP, sp)
        uc.reg_write(UC_ARM_REG_LR, 0xDEAD0000)  # 返回地址
        uc.reg_write(UC_ARM_REG_PC, BASE + DECRYPT_FN)
        uc.reg_write(UC_ARM_REG_CPSR, uc.reg_read(UC_ARM_REG_CPSR) | 0x20)  # Thumb

        try:
            uc.emu_start(BASE + DECRYPT_FN, 0xDEAD0000, count=2000000)
        except UcError as e:
            pc = uc.reg_read(UC_ARM_REG_PC)
            print(f"    [!] 执行异常: {e}  PC={pc:#x}")
            for regname, reg in (("r0", UC_ARM_REG_R0), ("r1", UC_ARM_REG_R1), ("r2", UC_ARM_REG_R2),
                                 ("r3", UC_ARM_REG_R3), ("sp", UC_ARM_REG_SP), ("lr", UC_ARM_REG_LR)):
                print(f"        {regname}={uc.reg_read(reg):#010x}")
            try:
                code = bytes(uc.mem_read(pc - 8, 24))
                md = Cs(CS_ARCH_ARM, CS_MODE_THUMB)
                print("        附近指令:")
                for ins in md.disasm(code, pc - 8):
                    mark = " <<<" if ins.address == pc else ""
                    print(f"          {ins.address:#08x}: {ins.mnemonic:9s} {ins.op_str}{mark}")
            except Exception:
                pass
        return self.decrypted


if __name__ == "__main__":
    cipher = sys.argv[1] if len(sys.argv) > 1 else "uqGL1bNENExT7/hGxpSE5qU="
    print(f"目标密文: {cipher}")
    emu = Emu(verbose=True)
    got = emu.call_decrypt(cipher)
    print(f"\n捕获到 {len(got)} 个 NewStringUTF 结果:")
    for k, v in got.items():
        print(f"  [{k}] {v!r}")
