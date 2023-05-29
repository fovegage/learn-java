package com.gage.DesignPattern.ConcurrencyPatterns.LockPattern;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockPattern {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private int value = 0;

    public int getValue() {
        lock.readLock().lock();
        try {
            return value;
        } finally {
            lock.readLock().unlock();
        }
    }

    public void increment() {
        lock.writeLock().lock();
        try {
            value++;
        } finally {
            lock.writeLock().unlock();
        }
    }

    static class WriteThread extends Thread {
        private final LockPattern data;

        public WriteThread(LockPattern data) {
            this.data = data;
        }

        @Override
        public void run() {
            data.increment();
            System.out.println("write thread id" + Thread.currentThread().getId() + "--->" + data.getValue());
        }

    }

    public static void main(String[] args) {
        // Read-WriteLock Pattern
        // 可重入锁
        LockPattern data = new LockPattern();
        for (int i = 0; i < 10; i++) {
            Thread writeThread = new WriteThread(data);
            writeThread.start();
        }
    }
}
