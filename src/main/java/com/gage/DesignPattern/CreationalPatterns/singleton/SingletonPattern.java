package com.gage.DesignPattern.CreationalPatterns.singleton;

public class SingletonPattern {

    private SingletonPattern(){

    }
    private static final class InstanceHolder {
        static final SingletonPattern instance = new SingletonPattern();
    }

    public static SingletonPattern getInstance() {
        return InstanceHolder.instance;
    }
}
