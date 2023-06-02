package com.gage.DesignPattern.BehavioralPatterns.observer;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
