package com.gage.DesignPattern.BehavioralPatterns.observer.RawImpl;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observables = new ArrayList<Observer>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    private int state;

    public void attach(Observer observer) {
        // 注册监听类
        observables.add(observer);
    }

    private void notifyAllObserver() {
        observables.forEach(Observer::update);
    }
}
