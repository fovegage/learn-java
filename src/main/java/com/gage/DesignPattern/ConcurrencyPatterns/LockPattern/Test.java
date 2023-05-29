package com.gage.DesignPattern.ConcurrencyPatterns.LockPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        LockPattern lockPattern = new LockPattern();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable reader = () -> {
            int value = lockPattern.getValue();
            System.out.println("read value" + value);
        };

        // c++ 风格
        Runnable write = ()->{
            lockPattern.increment();
            System.out.println("increment");
        };

        for (int i = 0; i < 10; i++) {
            executorService.execute(reader);
        }
//        executorService.submit(reader);
//        executorService.submit(reader);
        executorService.submit(write);
//        executorService.submit(reader);

        executorService.shutdown();

        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
