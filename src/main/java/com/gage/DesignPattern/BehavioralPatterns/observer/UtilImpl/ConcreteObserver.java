package com.gage.DesignPattern.BehavioralPatterns.observer.UtilImpl;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    public ConcreteObserver(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + ": receive info ---> " + arg);
    }
}
