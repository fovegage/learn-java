package com.gage.DesignPattern.BehavioralPatterns.observer.UtilImpl;

public class ObserverPattern {
    public static void main(String[] args) {
        // java util 实现
        ConcreteSubject concreteSubject = new ConcreteSubject();

        // 观察者
        ConcreteObserver observer1 = new ConcreteObserver("ob1");
        ConcreteObserver observer2 = new ConcreteObserver("ob2");

        concreteSubject.addObserver(observer1);
        concreteSubject.addObserver(observer2);
        concreteSubject.setMessage("hello");
        concreteSubject.deleteObserver(observer1);
        concreteSubject.setMessage("world");
    }
}
