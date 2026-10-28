#!/bin/sh
# ==============================================================================
# PlayHub 容器入口
#
# 以 root 启动 → 修正 bind mount 目录的属主 → 降权到 playhub 运行 Java。
#
# 为什么需要这一步：用 docker compose 把 ./data、./logs 等目录挂进容器时，
# 宿主机上这些目录的属主通常是 root 或创建它的用户，而应用是以 playhub（非 root）
# 运行的，直接写会失败（SQLite 建库失败、日志写不进去）。
# 这里在启动前统一 chown 一次，用户就不必手动改权限了。
# ==============================================================================
set -e

APP_JAR="app/playhub.jar"
APP_CONFIG="--spring.config.additional-location=file:config/application.yml"

run_java() {
    # JAVA_OPTS 故意不加引号：它本身就是「多个参数」的字符串
    exec java ${JAVA_OPTS} -jar "$APP_JAR" "$APP_CONFIG" "$@"
}

if [ "$(id -u)" = "0" ]; then
    for dir in /opt/playhub/data /opt/playhub/db /opt/playhub/logs /opt/playhub/.cache /opt/playhub/run; do
        if [ -d "$dir" ]; then
            chown -R playhub:playhub "$dir" 2>/dev/null || true
        fi
    done
    # setpriv 由 util-linux 提供；--clear-groups 避免带上 root 的附加组
    if command -v setpriv >/dev/null 2>&1; then
        exec setpriv --reuid playhub --regid playhub --clear-groups \
            java ${JAVA_OPTS} -jar "$APP_JAR" "$APP_CONFIG" "$@"
    fi
    # 兜底：没有 setpriv 时用 su
    exec su playhub -s /bin/sh -c \
        "exec java ${JAVA_OPTS} -jar ${APP_JAR} ${APP_CONFIG} \"\$@\"" sh "$@"
fi

# 已经是非 root（例如 compose 里指定了 user:），直接运行
run_java "$@"
