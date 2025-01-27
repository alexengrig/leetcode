package dev.alexengrig.leetcode.premium._271_encode_and_decode_strings;

import java.util.ArrayList;
import java.util.List;

class Solution implements Task {
    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length()).append('{').append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int start = i;
            while (str.charAt(i) != '{') {
                i++;
            }
            int length = Integer.parseInt(str.substring(start, i));
            i++;
            start = i;
            i += length;
            res.add(str.substring(start, i));
        }
        return res;
    }
}
