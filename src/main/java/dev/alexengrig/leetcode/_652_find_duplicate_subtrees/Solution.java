package dev.alexengrig.leetcode._652_find_duplicate_subtrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution implements Task {
    @Override
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        Map<String, Integer> counts = new HashMap<>();
        inlineSubtrees(root, counts, nodes);
        return nodes;
    }

    String inlineSubtrees(TreeNode root, Map<String, Integer> counts, List<TreeNode> nodes) {
        if (root == null) {
            return "";
        }
        String key = root.val
                     + "/" + inlineSubtrees(root.left, counts, nodes)
                     + "/" + inlineSubtrees(root.right, counts, nodes);
        if (2 == counts.compute(key, (k, count) -> count == null ? 1 : count + 1)) {
            nodes.add(root);
        }
        return key;
    }
}
