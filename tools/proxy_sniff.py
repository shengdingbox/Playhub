"""
极简 HTTP CONNECT 代理：只记录目标域名，不解密流量。

用途：让模拟器里的 App 走这个代理，从而观察到它请求了哪些域名。
对于 mediahub 这类站点，解密后的 ext 里最关键的就是 host，
拿到域名基本就能填进 PlayHub 的 ext 覆盖配置。

不需要安装 CA 证书——因为只统计 CONNECT 的 host:port，不碰报文内容。

用法：
    python proxy_sniff.py            # 默认监听 0.0.0.0:8899
然后在模拟器里把 WLAN 代理设为 <本机IP>:8899
"""
import socket
import sys
import threading
import time
from datetime import datetime

LISTEN_HOST = "0.0.0.0"
LISTEN_PORT = 8899

seen = {}
lock = threading.Lock()
start_time = time.time()


def log(msg):
    stamp = datetime.now().strftime("%H:%M:%S")
    print(f"[{stamp}] {msg}", flush=True)


def record(host, port, via):
    with lock:
        first = host not in seen
        seen.setdefault(host, {"count": 0, "ports": set(), "first": time.time()})
        seen[host]["count"] += 1
        seen[host]["ports"].add(port)
    if first:
        log(f"★ 新域名 {host}:{port}   ({via})")
    return first


def pipe(src, dst):
    try:
        while True:
            data = src.recv(65536)
            if not data:
                break
            dst.sendall(data)
    except Exception:
        pass
    finally:
        for s in (src, dst):
            try:
                s.close()
            except Exception:
                pass


def handle(client, addr):
    try:
        client.settimeout(20)
        head = b""
        while b"\r\n\r\n" not in head and len(head) < 8192:
            chunk = client.recv(4096)
            if not chunk:
                client.close()
                return
            head += chunk

        first_line = head.split(b"\r\n", 1)[0].decode("latin-1", "ignore")
        parts = first_line.split()
        if len(parts) < 2:
            client.close()
            return

        method, target = parts[0].upper(), parts[1]

        if method == "CONNECT":
            host, _, port_s = target.rpartition(":")
            port = int(port_s) if port_s.isdigit() else 443
            record(host, port, "CONNECT")
            upstream = socket.create_connection((host, port), timeout=20)
            client.sendall(b"HTTP/1.1 200 Connection Established\r\n\r\n")
            client.settimeout(None)
            upstream.settimeout(None)
            t = threading.Thread(target=pipe, args=(upstream, client), daemon=True)
            t.start()
            pipe(client, upstream)
        else:
            # 明文 HTTP：从 Host 头拿域名
            host = ""
            for line in head.split(b"\r\n")[1:]:
                if line.lower().startswith(b"host:"):
                    host = line.split(b":", 1)[1].strip().decode("latin-1", "ignore")
                    break
            if not host:
                client.close()
                return
            hostname, _, port_s = host.rpartition(":")
            port = int(port_s) if port_s.isdigit() else 80
            record(hostname or host, port, "HTTP")
            upstream = socket.create_connection((hostname or host, port), timeout=20)
            upstream.sendall(head)
            client.settimeout(None)
            upstream.settimeout(None)
            t = threading.Thread(target=pipe, args=(upstream, client), daemon=True)
            t.start()
            pipe(client, upstream)
    except Exception as ex:
        try:
            client.close()
        except Exception:
            pass
        log(f"连接异常 {addr}: {ex}")


def summarise():
    with lock:
        if not seen:
            log("（还没有捕获到任何域名）")
            return
        log(f"===== 已捕获 {len(seen)} 个域名 =====")
        for host in sorted(seen, key=lambda h: -seen[h]["count"]):
            info = seen[host]
            ports = ",".join(str(p) for p in sorted(info["ports"]))
            print(f"  {host:50s} 次数 {info['count']:3d}  端口 {ports}", flush=True)


def main():
    srv = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    srv.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    srv.bind((LISTEN_HOST, LISTEN_PORT))
    srv.listen(200)
    log(f"代理已启动，监听 {LISTEN_HOST}:{LISTEN_PORT}")
    log("请在模拟器里设置 WLAN 代理指向本机 IP 的这个端口，然后打开目标站点")
    log("输入 s 并回车可随时查看已捕获域名")
    try:
        import select

        while True:
            r, _, _ = select.select([srv], [], [], 5)
            if r:
                client, addr = srv.accept()
                threading.Thread(target=handle, args=(client, addr), daemon=True).start()
            # 非阻塞检查 stdin
            try:
                import msvcrt

                if msvcrt.kbhit():
                    ch = msvcrt.getch()
                    if ch.lower() == b"s":
                        summarise()
            except Exception:
                pass
    except KeyboardInterrupt:
        pass
    finally:
        summarise()
        srv.close()


if __name__ == "__main__":
    main()
