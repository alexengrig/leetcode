package dev.alexengrig.leetcode.design._341_flatten_nested_list_iterator;

import java.util.Iterator;
import java.util.List;

interface NestedIterator extends Iterator<Integer> {
    @Override
    Integer next();

    @Override
    boolean hasNext();

    interface NestedInteger {
        boolean isInteger();

        Integer getInteger();

        List<NestedInteger> getList();
    }
}
