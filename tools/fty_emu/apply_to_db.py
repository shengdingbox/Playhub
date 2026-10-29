"""
把 batch_decrypt.py 的解密结果写进 PlayHub 的 SQLite 库。

用法：
    python apply_to_db.py <playhub.db> [decrypted.json]

说明：
- 按站点名称匹配 sources.name，命中就替换 ext 列
- 只动 ext，不动其他字段
- 写前自动备份为 <db>.bak-<时间戳>
"""
import json
import os
import shutil
import sqlite3
import sys
import time

HERE = os.path.dirname(os.path.abspath(__file__))


def main():
    if len(sys.argv) < 2:
        print("用法: python apply_to_db.py <playhub.db> [decrypted.json]")
        sys.exit(1)
    db = sys.argv[1]
    dec_path = sys.argv[2] if len(sys.argv) > 2 else os.path.join(HERE, "decrypted.json")

    if not os.path.exists(db):
        print(f"库不存在: {db}")
        sys.exit(1)
    if not os.path.exists(dec_path):
        print(f"解密结果不存在: {dec_path}")
        sys.exit(1)

    items = json.load(open(dec_path, encoding="utf-8"))
    backup = f"{db}.bak-{int(time.time())}"
    shutil.copy2(db, backup)
    print(f"已备份: {backup}\n")

    con = sqlite3.connect(db)
    con.execute("PRAGMA journal_mode=WAL")
    cur = con.cursor()

    ok = skip = miss = 0
    now = int(time.time() * 1000)
    for it in items:
        name = it.get("name")
        plain = it.get("plain")
        if not plain:
            skip += 1
            continue
        cur.execute("SELECT id, ext FROM sources WHERE name = ?", (name,))
        row = cur.fetchone()
        if not row:
            print(f"  ✗ 未找到站点: {name}")
            miss += 1
            continue
        sid, old = row
        cur.execute("UPDATE sources SET ext = ?, updated_at = ? WHERE id = ?", (plain, now, sid))
        old_s = (old or "")[:36]
        print(f"  ✓ {name[:20]:22s} id={sid}")
        print(f"      旧: {old_s}{'...' if len(old or '') > 36 else ''}")
        print(f"      新: {plain[:80]}{'...' if len(plain) > 80 else ''}")
        ok += 1

    con.commit()
    con.close()
    print(f"\n完成：更新 {ok} 个 / 跳过 {skip} / 未找到 {miss}")
    print("重启应用（或重新导入片源）后生效")


if __name__ == "__main__":
    main()
