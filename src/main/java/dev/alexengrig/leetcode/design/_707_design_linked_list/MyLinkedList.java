package dev.alexengrig.leetcode.design._707_design_linked_list;

interface MyLinkedList {
    int get(int index);

    void addAtHead(int val);

    void addAtTail(int val);

    void addAtIndex(int index, int val);

    void deleteAtIndex(int index);
}