package dev.alexengrig.leetcode.design._341_flatten_nested_list_iterator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class StackNestedIterator implements NestedIterator {
    public StackNestedIterator(List<NestedInteger> nestedList) {
        this.deque = flat(nestedList);
    }

    private final Deque<Integer> deque;

    private Deque<Integer> flat(List<NestedInteger> values) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<NestedInteger> list = new LinkedList<>(values);
        for (int i = 0; i < list.size(); i++) {
            NestedInteger nested = list.get(i);
            if (nested.isInteger()) {
                deque.addLast(nested.getInteger());
            } else if (!nested.getList().isEmpty()) {
                if (i + 1 < list.size()) {
                    list.addAll(i + 1, nested.getList());
                } else {
                    list.addAll(nested.getList());
                }
            }
        }
        return deque;
    }

    @Override
    public Integer next() {
        return deque.removeFirst();
    }

    @Override
    public boolean hasNext() {
        return !deque.isEmpty();
    }
}
