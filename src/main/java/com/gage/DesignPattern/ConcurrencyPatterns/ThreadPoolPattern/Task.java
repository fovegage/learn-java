package com.gage.DesignPattern.ConcurrencyPatterns.ThreadPoolPattern;

public class Task implements Runnable {
    private final int TaskID;

    public Task(int TaskID) {
        this.TaskID = TaskID;
    }

    @Override
    public void run() {
        System.out.println("TaskID running"+ TaskID);
    }
}
