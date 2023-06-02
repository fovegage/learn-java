package com.gage.DesignPattern.BehavioralPatterns.observer;

public class ExpressObserver extends Observer {

    public ExpressObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("下单成功，准备发货   " + "标识--->" + this.subject.getState());
    }
}
