package com.gage.DesignPattern.BehavioralPatterns.observer.RawImpl;

public class ObserverPattern {
    public static void main(String[] args) {
        // 观察者模式
        Subject subject = new Subject();

        new OrderObserver(subject);
        new ExpressObserver(subject);

        subject.setState(1);
    }
}
