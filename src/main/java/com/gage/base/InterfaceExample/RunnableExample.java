package com.gage.base.InterfaceExample;


public class RunnableExample {
    static class RunnableImpl implements Runnable {

        @Override
        public void run() {
            System.out.println("runnable");
        }
    }

    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
//        Thread thread = new Thread(runnable);
        Thread thread = new Thread(() -> {
            System.out.println("runnable");
        });
        thread.start();

    }
}
