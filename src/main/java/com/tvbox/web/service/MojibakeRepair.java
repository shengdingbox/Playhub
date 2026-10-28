package com.tvbox.web.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 修复「UTF-8 字节被当 GBK 解码」造成的乱码。
 *
 * <p>部分 TVBox 爬虫的 Http 工具对没有 charset 的响应统一按 GBK 解码，
 * 而服务端实际返回 UTF-8，于是 "后会友期" 变成 "鍚庝細鍙嬫湡"。
 *
 * <p>修复是精确可逆的：把字符串按 GBK 还原成原始字节，再按 UTF-8 解码。
 * 只有当「还原后的字节是合法 UTF-8」时才采用结果，因此正常中文
 * （其 GBK 字节不是合法 UTF-8 序列）不会被误伤。
 */
public final class MojibakeRepair {

    private static final Charset GBK = Charset.forName("GBK");
    private static final char REPLACEMENT = '\uFFFD';

    private MojibakeRepair() {
    }

    /** 递归修复 JSON 所有文本节点（对象字段、数组元素）。 */
    public static JsonNode repair(JsonNode node) {
        if (node == null) {
            return null;
        }
        if (node.isTextual()) {
            String original = node.asText();
            String fixed = repairText(original);
            return fixed.equals(original) ? node : TextNode.valueOf(fixed);
        }
        if (node.isObject()) {
            ObjectNode object = (ObjectNode) node;
            java.util.List<String> names = new java.util.ArrayList<>();
            object.fieldNames().forEachRemaining(names::add);
            for (String name : names) {
                JsonNode value = object.get(name);
                JsonNode fixed = repair(value);
                if (fixed != value) {
                    object.set(name, fixed);
                }
            }
            return object;
        }
        if (node.isArray()) {
            ArrayNode array = (ArrayNode) node;
            for (int i = 0; i < array.size(); i++) {
                JsonNode value = array.get(i);
                JsonNode fixed = repair(value);
                if (fixed != value) {
                    array.set(i, fixed);
                }
            }
            return array;
        }
        return node;
    }

    /** 修复单个字符串；无法确定是乱码时原样返回。 */
    public static String repairText(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        if (!hasNonAscii(text)) {
            return text;
        }
        String strict = strictRepair(text);
        if (strict != null) {
            return strict;
        }
        // 含替换字符（原始字节在 GBK 解码时已丢失）时尽力修复：
        // 按 U+FFFD 分段，每段单独还原，尾部残缺字符丢弃。
        if (text.indexOf(REPLACEMENT) < 0) {
            return text;
        }
        StringBuilder out = new StringBuilder(text.length());
        String[] parts = text.split("\uFFFD", -1);
        for (int i = 0; i < parts.length; i++) {
            if (i > 0) {
                out.append(REPLACEMENT);
            }
            out.append(repairSegment(parts[i]));
        }
        return out.toString();
    }

    /** 尽力修复一段：从长到短尝试，丢弃无法还原的尾部残缺字符。 */
    private static String repairSegment(String segment) {
        if (segment == null || segment.isEmpty() || !hasNonAscii(segment)) {
            return segment;
        }
        for (int len = segment.length(); len > 0; len--) {
            String fixed = strictRepair(segment.substring(0, len));
            if (fixed != null) {
                return fixed;
            }
        }
        return segment;
    }

    /** 严格修复：整串都是「UTF-8 字节被当 GBK 解码」时返回还原结果，否则 null。 */
    private static String strictRepair(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        try {
            byte[] raw = text.getBytes(GBK);
            // 含有 GBK 无法表示的字符时，getBytes 会用 '?' 替换，还原不可靠
            if (!new String(raw, GBK).equals(text)) {
                return null;
            }
            String decoded = new String(raw, StandardCharsets.UTF_8);
            if (decoded.indexOf(REPLACEMENT) >= 0 || decoded.equals(text)) {
                return null;
            }
            if (!containsCjk(decoded)) {
                return null;
            }
            return decoded;
        } catch (Exception ignore) {
            return null;
        }
    }

    private static boolean hasNonAscii(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 0x7F) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsCjk(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ((c >= 0x4E00 && c <= 0x9FFF) || (c >= 0x3400 && c <= 0x4DBF)) {
                return true;
            }
        }
        return false;
    }
}
