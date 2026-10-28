package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public enum YU implements gs {
    /* JADX INFO: Fake field, exist only in values array */
    SWITCH_PROTOCOL(101, "Switching Protocols"),
    OK(200, "OK"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATED(201, "Created"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCEPTED(202, "Accepted"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_CONTENT(204, "No Content"),
    /* JADX INFO: Fake field, exist only in values array */
    PARTIAL_CONTENT(206, "Partial Content"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_STATUS(207, "Multi-Status"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT(301, "Moved Permanently"),
    /* JADX INFO: Fake field, exist only in values array */
    FOUND(302, "Found"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SEE_OTHER(303, "See Other"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_MODIFIED(304, "Not Modified"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(307, "Temporary Redirect"),
    BAD_REQUEST(400, "Bad Request"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(401, "Unauthorized"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(405, "Method Not Allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(406, "Not Acceptable"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(408, "Request Timeout"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(409, "Conflict"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(410, "Gone"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(411, "Length Required"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(412, "Precondition Failed"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(413, "Payload Too Large"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(415, "Unsupported Media Type"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(416, "Requested Range Not Satisfiable"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(417, "Expectation Failed"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(500, "Internal Server Error"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IMPLEMENTED(501, "Not Implemented"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");
    
    private final String SN;
    private final int yq;

    YU(int i, String str) {
        this.yq = i;
        this.SN = str;
    }

    public static YU SN(int i) {
        YU[] values;
        for (YU yu : values()) {
            if (yu.yq == i) {
                return yu;
            }
        }
        return null;
    }

    public final String yq() {
        StringBuilder yq = by.yq("");
        yq.append(this.yq);
        yq.append(" ");
        yq.append(this.SN);
        return yq.toString();
    }
}
