package dev.alexengrig.leetcode.design._707_design_linked_list;

class MySingleLinkedList implements MyLinkedList {
    private int size;
    private Node head;

    private boolean hasNoIndex(int index) {
        return size == 0 || index >= size || index < 0;
    }

    private Node getAt(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
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
        if (head != null) {
            node.next = head;
        }
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node tail = getAt(size - 1);
            tail.next = node;
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
            Node prev = getAt(index - 1);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (hasNoIndex(index)) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node prev = getAt(index - 1);
            Node deleted = prev.next;
            prev.next = deleted.next;
        }
        size--;
    }

    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
