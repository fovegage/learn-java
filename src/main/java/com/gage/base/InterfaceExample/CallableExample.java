package com.gage.base.InterfaceExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // callable任务
        Callable<String> callableTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "test call";
            }
        };

        Future<String> future = executorService.submit(callableTask);
        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();

    }
}
