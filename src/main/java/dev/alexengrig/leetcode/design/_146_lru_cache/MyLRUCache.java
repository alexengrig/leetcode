package dev.alexengrig.leetcode.design._146_lru_cache;

import java.util.HashMap;
import java.util.Map;

public class MyLRUCache implements LRUCache {
    public MyLRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>((int) Math.ceil(capacity / 0.75));
    }

    private final int capacity;
    private final Map<Integer, Node> cache;

    private Node head;
    private Node tail;


    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveAtHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveAtHead(node);
        } else {
            if (cache.size() == capacity) {
                removeAtTail();
            }
            addAtHead(key, value);
        }
    }

    private void addAtHead(int key, int value) {
        Node node = new Node(key, value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        cache.put(key, node);
    }

    private void removeAtTail() {
        if (tail == null) {
            return;
        }
        cache.remove(tail.key);
        Node prev = tail.prev;
        if (prev != null) {
            prev.next = null;
            tail = prev;
        } else {
            head = tail = null;
        }
    }

    private void moveAtHead(Node node) {
        Node prev = node.prev;
        if (prev == null) {
            return; // this is head
        }
        Node next = node.next;
        prev.next = next;
        if (next == null) {
            tail = prev; // this is tail
        } else {
            next.prev = prev;
        }
        node.prev = null;
        node.next = head;
        head.prev = node;
        head = node;
    }

    private static class Node {
        Node prev;
        int key;
        int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
