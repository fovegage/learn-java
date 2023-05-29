package com.gage.DesignPattern.CreationalPatterns.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                SingletonPattern singletonPattern = SingletonPattern.getInstance();
                System.out.println(singletonPattern);
            });
        }

        executorService.shutdown();

    }
}
