package dev.alexengrig.leetcode.design._155_min_stack;

 interface MinStack {
  void push(int val);

  void pop();

  int top();

  int getMin();
 }
