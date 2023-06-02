package com.gage.DesignPattern.BehavioralPatterns.observer.RawImpl;

public class OrderObserver extends Observer {
    public OrderObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("支付成功");
    }
}
