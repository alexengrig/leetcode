package dev.alexengrig.leetcode.concurrency._1114_print_in_order;

import java.util.concurrent.CountDownLatch;

class Solution extends Foo {

    final CountDownLatch firstLatch = new CountDownLatch(1);
    final CountDownLatch secondLatch = new CountDownLatch(1);

    @Override
    public void first(Runnable printFirst) throws InterruptedException {
        super.first(printFirst);
        firstLatch.countDown();
    }

    @Override
    public void second(Runnable printSecond) throws InterruptedException {
        firstLatch.await();
        super.second(printSecond);
        secondLatch.countDown();
    }

    @Override
    public void third(Runnable printThird) throws InterruptedException {
        secondLatch.await();
        super.third(printThird);
    }
}