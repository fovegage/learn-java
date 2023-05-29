package com.gage.DesignPattern.ConcurrencyPatterns.ThreadPoolPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolPattern {
    public static void main(String[] args) {
        // ThreadPool Pattern
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 提交线程池任务
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task(i));
        }
        executorService.shutdown();
    }
}


