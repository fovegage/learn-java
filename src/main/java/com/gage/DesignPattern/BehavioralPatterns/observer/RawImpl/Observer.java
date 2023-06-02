package com.gage.DesignPattern.BehavioralPatterns.observer.RawImpl;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
