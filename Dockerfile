# syntax=docker/dockerfile:1

# ==============================================================================
# PlayHub 运行镜像
#
# 默认使用国内镜像源（Debian apt / PyPI / npm），全部可用 --build-arg 覆盖。
#
# 基础镜像也可走国内加速，例如：
#   docker build \
#     --build-arg NODE_IMAGE=docker.m.daocloud.io/library/node:22-bookworm-slim \
#     -t playhub .
#
# 需要临时切回官方源（海外机器）：
#   docker build --build-arg USE_CN_MIRROR=false -t playhub .
# ==============================================================================

ARG NODE_IMAGE=node:22-bookworm-slim
FROM ${NODE_IMAGE}

# ── 镜像源开关 ────────────────────────────────────────────────────────────────
ARG USE_CN_MIRROR=true
# Debian 源（阿里云；也可用 mirrors.tuna.tsinghua.edu.cn / mirrors.ustc.edu.cn）
ARG APT_MIRROR=mirrors.aliyun.com
# PyPI 源（阿里云；也可用 https://pypi.tuna.tsinghua.edu.cn/simple）
ARG PIP_INDEX=https://mirrors.aliyun.com/pypi/simple/
# npm 源
ARG NPM_REGISTRY=https://registry.npmmirror.com
# GitHub 加速前缀（容器首次运行时会用到，见 app.spider-jar-url）
ARG GITHUB_PROXY=https://gh-proxy.com

LABEL org.opencontainers.image.title="playhub"
LABEL org.opencontainers.image.description="TVBox Web frontend/backend runtime image"

# 容器默认 POSIX locale，中文日志会变成 "??"，显式指定 UTF-8
ENV LANG=C.UTF-8 \
    LANGUAGE=C.UTF-8 \
    LC_ALL=C.UTF-8 \
    APP_PORT=18080 \
    APP_CACHE_DIR=/opt/playhub/data/cache \
    APP_LOG_FILE=/opt/playhub/logs/playhub.log \
    DEX2JAR_COMMAND=__AUTO__ \
    NODE_COMMAND=node \
    PYTHON_COMMAND=python3 \
    JAVA_OPTS="-Xms64m -Xmx384m -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/playhub/logs/" \
    APP_SPIDER_OPERATION_MAX_CONCURRENCY=2 \
    APP_SCRIPT_MAX_CONCURRENCY=2 \
    PIP_INDEX_URL=${PIP_INDEX} \
    PIP_DISABLE_PIP_VERSION_CHECK=1 \
    PIP_NO_INPUT=1 \
    NPM_CONFIG_REGISTRY=${NPM_REGISTRY}

# ── 1) 换 apt 源 + 安装运行时依赖 ─────────────────────────────────────────────
RUN set -eux; \
    if [ "${USE_CN_MIRROR}" = "true" ]; then \
        for f in /etc/apt/sources.list \
                 /etc/apt/sources.list.d/*.sources \
                 /etc/apt/sources.list.d/*.list; do \
            if [ -f "$f" ]; then \
                sed -i \
                    -e "s|deb.debian.org|${APT_MIRROR}|g" \
                    -e "s|security.debian.org|${APT_MIRROR}|g" \
                    -e "s|ftp.debian.org|${APT_MIRROR}|g" \
                    "$f"; \
            fi; \
        done; \
    fi; \
    apt-get update; \
    apt-get install -y --no-install-recommends \
        bash \
        ca-certificates \
        curl \
        openjdk-17-jre-headless \
        procps \
        python3 \
        python3-pip \
        python3-venv \
        tzdata; \
    rm -rf /var/lib/apt/lists/*

# ── 2) pip 源（apt 装的 pip 可能不读 PIP_INDEX_URL，显式写一份全局配置）───────
RUN set -eux; \
    if [ "${USE_CN_MIRROR}" = "true" ]; then \
        mkdir -p /etc/pip; \
        printf '[global]\nindex-url = %s\ntimeout = 60\n' "${PIP_INDEX}" > /etc/pip.conf; \
        host="$(echo "${PIP_INDEX}" | sed -E 's#^https?://([^/]+).*#\1#')"; \
        if [ -n "$host" ] && [ "$host" != "${PIP_INDEX}" ]; then \
            printf 'trusted-host = %s\n' "$host" >> /etc/pip.conf; \
        fi; \
    fi; \
    cat /etc/pip.conf 2>/dev/null || true

# ── 3) Python 爬虫运行时依赖（少了这些，py 源会直接失败）────────────────────
# 注意：这里不使用 `RUN --mount=type=cache`，因为老版本 Docker（legacy builder，
# 未安装 buildx）不支持该语法，会让构建在中途直接失败。
# `--break-system-packages` 仅在 pip>=23 可用，因此保留一条不带该参数的兜底。
RUN pip3 install --no-cache-dir --break-system-packages \
        "requests>=2.31" \
        "beautifulsoup4>=4.12" \
        "lxml>=5.0" \
    || pip3 install --no-cache-dir \
        "requests>=2.31" \
        "beautifulsoup4>=4.12" \
        "lxml>=5.0"

# ── 4) npm 源（前端已预构建，此处仅保证运行时/将来装包走国内源）─────────────
RUN if [ "${USE_CN_MIRROR}" = "true" ]; then \
        npm config set registry "${NPM_REGISTRY}"; \
        npm config get registry; \
    fi

# GitHub 加速前缀：容器内下载 spider jar / dex2jar 时可用
ENV GITHUB_PROXY=${GITHUB_PROXY} \
    APP_GITHUB_PROXY=${GITHUB_PROXY}

WORKDIR /opt/playhub

COPY target/playhub-*.jar app/playhub.jar
COPY scripts/ scripts/
COPY tools/dex-tools-v2.4/ tools/dex-tools-v2.4/
COPY docker/application.yml config/application.yml

RUN mkdir -p data/cache logs run .cache/android-cache .cache/android-external .cache/android-files \
    && chmod +x tools/dex-tools-v2.4/*.sh \
    && find scripts -type d -name __pycache__ -prune -exec rm -rf {} + \
    && find scripts -type f -name "*.pyc" -delete \
    && groupadd -r playhub \
    && useradd -r -g playhub -d /opt/playhub playhub \
    && chown -R playhub:playhub /opt/playhub

USER playhub

EXPOSE 18080

HEALTHCHECK --interval=30s --timeout=5s --start-period=40s --retries=3 \
    CMD curl -fsS "http://127.0.0.1:${APP_PORT}/api/health" >/dev/null || exit 1

ENTRYPOINT ["sh", "-c", "exec java ${JAVA_OPTS} -jar app/playhub.jar --spring.config.additional-location=file:config/application.yml \"$@\"", "--"]
