# -*- coding: utf-8 -*-
"""Unicorn 模拟 ftyguard_v8.so 的 .init_array（OLLVM datadiv 字符串解密），转储明文字符串"""
import struct, re
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
from unicorn import *
from unicorn.arm64_const import *

P = r"decompiled/response/assets/ftyguard_v8.so"
f = open(P, "rb"); e = ELFFile(f)
raw = open(P, "rb").read()

uc = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
PAGE = 0x1000
def align_down(x): return x & ~(PAGE-1)
def align_up(x): return (x + PAGE - 1) & ~(PAGE-1)

# 1) 映射 PT_LOAD
loads = []
for s in e.iter_segments():
    if s["p_type"] == "PT_LOAD":
        loads.append((s["p_vaddr"], s["p_offset"], s["p_filesz"], s["p_memsz"], s["p_flags"]))
        v0 = align_down(s["p_vaddr"]); v1 = align_up(s["p_vaddr"] + s["p_memsz"])
        perms = 0
        if s["p_flags"] & 4: perms |= UC_PROT_EXEC
        if s["p_flags"] & 2: perms |= UC_PROT_WRITE
        if s["p_flags"] & 1: perms |= UC_PROT_READ
        try:
            uc.mem_map(v0, v1-v0, UC_PROT_ALL)
        except UcError:
            pass
        uc.mem_write(s["p_vaddr"], raw[s["p_offset"]:s["p_offset"]+s["p_filesz"]])
print("loads:", [(hex(a),hex(fs),hex(ms)) for a,o,fs,ms,fl in loads])

# 2) RELATIVE 重定位（PIE base=0 -> *addr = addend）
nrel = 0
for sec in e.iter_sections():
    if isinstance(sec, RelocationSection):
        for r in sec.iter_relocations():
            if r["r_info_type"] == 1027:  # R_AARCH64_RELATIVE
                uc.mem_write(r["r_offset"], struct.pack("<Q", r["r_addend"] & 0xffffffffffffffff))
                nrel += 1
                if 0x18bd8 <= r["r_offset"] < 0x18c00:
                    print("  RELA %#x -> %#x" % (r["r_offset"], r["r_addend"]))
print("relative relocs:", nrel)

# 3) 栈
STK = 0x2000000; uc.mem_map(STK, 0x200000, UC_PROT_ALL)
uc.reg_write(UC_ARM64_REG_SP, STK + 0x100000)
# tpidr（栈金丝雀）
uc.reg_write(UC_ARM64_REG_TPIDR_EL0, STK + 0x180000)
uc.mem_write(STK + 0x180000 + 0x28, struct.pack("<Q", 0xDEADBEEFCAFEBABE))

# .init_array 为空（保护器改写）；直接执行 Ghidra 标出的 .datadiv_decode 函数
inits = [0x4f78, 0xb39c, 0xce18]
print("datadiv targets:", [hex(x) for x in inits])

def mem_hook(uc, access, addr, size, value, ud):
    print("  ! MEM FAIL access=%d addr=%#x pc=%#x" % (access, addr, uc.reg_read(UC_ARM64_REG_PC)))
    return False
uc.hook_add(UC_HOOK_MEM_UNMAPPED, mem_hook)

# 简单 libc stub：若跳到 PLT/外部地址则直接 ret
def hook_code(uc, addr, size, ud):
    # 外部调用地址范围（.plt 0x19a0..）暂不处理
    pass
uc.hook_add(UC_HOOK_CODE, hook_code)

STOP = 0x3000000
uc.mem_map(STOP, PAGE, UC_PROT_ALL)
for fn in inits:
    uc.reg_write(UC_ARM64_REG_LR, STOP)
    try:
        uc.emu_start(fn, STOP, timeout=20_000_000, count=20_000_000)
        print("init %#x OK" % fn)
    except UcError as ex:
        print("init %#x STOP %s pc=%#x" % (fn, ex, uc.reg_read(UC_ARM64_REG_PC)))

# 4) 转储可写段中的字符串
def dump_strings(buf, baseva, minlen=4):
    out = []
    cur = b""; start = 0
    for i, b in enumerate(buf):
        if 32 <= b < 127:
            if not cur: start = i
            cur += bytes([b])
        else:
            if len(cur) >= minlen:
                out.append((baseva+start, cur.decode("latin1")))
            cur = b""
    return out

results = []
for va, off, fsz, msz, fl in loads:
    if fl & 2:  # writable
        buf = uc.mem_read(va, msz or fsz)
        results += dump_strings(bytes(buf), va)

# 去重
seen = set(); uniq = []
for a, s in results:
    if s not in seen:
        seen.add(s); uniq.append((a, s))
print("\n== decrypted strings in writable segments (%d) ==" % len(uniq))
for a, s in uniq:
    print("%#08x  %s" % (a, s[:120]))
open(r"decompiled/response/ghidra_v8/decrypted_strings.txt", "w", encoding="utf-8").write(
    "\n".join("%#08x  %s" % (a, s) for a, s in uniq))

# 5) 解密后重读 JNI 方法表（file 0x19008 / vaddr 0x19008 since load base=0）
def rdstr_ptr_at(fileva):
    o = fileva
    p = struct.unpack("<Q", bytes(uc.mem_read(o, 8)))[0]
    if not p: return None
    b = bytes(uc.mem_read(p, 96))
    z = b.find(b"\x00")
    return b[:z].decode("latin1","replace")
print("\n== decrypted JNINativeMethod table ==")
for i in range(8):
    b = 0x19008 + i*24
    name = rdstr_ptr_at(b)
    sig = rdstr_ptr_at(b+8)
    fn = struct.unpack("<Q", bytes(uc.mem_read(b+16, 8)))[0]
    print("#%d %-16s %-40s fn=%#x" % (i, name, sig, fn))
