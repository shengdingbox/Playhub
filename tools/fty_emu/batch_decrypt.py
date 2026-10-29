"""
批量解密 mediahub 配置里所有加密的 ext。

用法：
    python batch_decrypt.py [config.json]
不传参数则使用同目录下的 ph-conf.json。
"""
import json
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from emulate_decrypt import Emu  # noqa: E402

HERE = os.path.dirname(os.path.abspath(__file__))


def is_encrypted(ext):
    if not ext:
        return False
    e = ext.strip()
    if e.startswith("{") or e.startswith("[") or e.startswith("http"):
        return False
    return True


def main():
    conf_path = sys.argv[1] if len(sys.argv) > 1 else os.path.join(HERE, "ph-conf.json")
    conf = json.load(open(conf_path, encoding="utf-8"))
    sites = conf.get("sites", [])

    targets = []
    for s in sites:
        ext = s.get("ext")
        if isinstance(ext, dict):
            continue
        ext = (ext or "").strip()
        if is_encrypted(ext):
            targets.append((s, ext))

    print(f"配置里共有 {len(targets)} 个加密 ext，开始解密\n")

    results = []
    for site, cipher in targets:
        name = site.get("name", "?")
        api = site.get("api", "?")
        print(f"--- {name}  ({api})  密文 {cipher[:40]}{'...' if len(cipher) > 40 else ''}")
        emu = Emu(verbose=False)
        got = emu.call_decrypt(cipher)
        plain = None
        if got:
            plain = list(got.values())[0]
        print(f"    解密结果: {plain!r}\n")
        results.append({
            "name": name,
            "api": api,
            "cipher": cipher,
            "plain": plain,
        })

    out = os.path.join(HERE, "decrypted.json")
    json.dump(results, open(out, "w", encoding="utf-8"), ensure_ascii=False, indent=2)
    print(f"=== 汇总（已写入 {out}）===")
    ok = 0
    for r in results:
        flag = "✓" if r["plain"] else "✗"
        if r["plain"]:
            ok += 1
        print(f"  {flag} {r['name'][:20]:22s} {r['plain']}")
    print(f"\n成功 {ok} / {len(results)}")


if __name__ == "__main__":
    main()
