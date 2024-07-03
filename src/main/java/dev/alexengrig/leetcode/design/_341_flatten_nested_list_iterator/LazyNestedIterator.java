package dev.alexengrig.leetcode.design._341_flatten_nested_list_iterator;

import java.util.List;

public class LazyNestedIterator implements NestedIterator {
    private final List<NestedInteger> list;

    private int index;
    private NestedIterator iterator;

    public LazyNestedIterator(List<NestedInteger> nestedList) {
        this.list = nestedList;
    }

    @Override
    public Integer next() {
        if (iterator != null) {
            return iterator.next();
        }
        return list.get(index++).getInteger();
    }

    @Override
    public boolean hasNext() {
        if (iterator != null) {
            if (iterator.hasNext()) {
                return true;
            }
            index++;
            iterator = null;
        }
        int size = list.size();
        while (index < size) {
            NestedInteger nested = list.get(index);
            if (nested.isInteger()) {
                return true;
            } else if (!nested.getList().isEmpty()) {
                iterator = new LazyNestedIterator(nested.getList());
                if (iterator.hasNext()) {
                    return true;
                }
            }
            index++;
        }
        return false;
    }
}
