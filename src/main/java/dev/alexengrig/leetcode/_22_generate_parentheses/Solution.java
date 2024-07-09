package dev.alexengrig.leetcode._22_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution implements Task {
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        dfs(n, n, builder, results);
        return results;
    }

    void dfs(int l, int r, StringBuilder builder, List<String> results) {
        if (l == 0 && r == 0) {
            results.add(builder.toString());
        } else {
            if (l > 0) {
                builder.append('(');
                dfs(l - 1, r, builder, results);
                builder.deleteCharAt(builder.length() - 1);
            }
            if (l < r) {
                builder.append(')');
                dfs(l, r - 1, builder, results);
                builder.deleteCharAt(builder.length() - 1);
            }
        }
    }
}
