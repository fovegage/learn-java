package com.gage.DesignPattern.BehavioralPatterns.observer.UtilImpl;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    public void setMessage(String message) {
        this.message = message;
        setChanged();
        notifyObservers(message);
    }

    private String message;

}
