package dev.alexengrig.leetcode.design._707_design_linked_list;

public class MyDoubleLinkedList implements MyLinkedList {
    private int size;
    private Node head;
    private Node tail;

    private boolean hasNoIndex(int index) {
        return size == 0 || index >= size || index < 0;
    }

    private Node getAt(int index) {
        Node node;
        if (index < size / 2) {
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = tail;
            for (int i = 0, n = size - 1 - index; i < n; i++) {
                node = node.prev;
            }
        }
        return node;
    }

    public int get(int index) {
        if (hasNoIndex(index)) {
            return -1;
        }
        Node node = getAt(index);
        return node.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (tail == null) {
            tail = head = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == size) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else if (!hasNoIndex(index)) {
            Node node = new Node(val);
            Node next = getAt(index);
            Node prev = next.prev;
            prev.next = node;
            node.next = next;
            next.prev = node;
            node.prev = prev;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (hasNoIndex(index)) {
            return;
        }
        if (index == 0) {
            Node next = head.next;
            if (next != null) {
                next.prev = null;
            }
            head = next;
        } else if (index == size - 1) {
            Node prev = tail.prev;
            if (prev != null) {
                prev.next = null;
            }
            tail = prev;
        } else {
            Node node = getAt(index);
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
        }
        size--;
    }

    private static class Node {
        Node prev;
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
