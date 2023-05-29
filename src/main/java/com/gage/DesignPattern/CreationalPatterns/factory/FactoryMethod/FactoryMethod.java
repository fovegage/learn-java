package com.gage.DesignPattern.CreationalPatterns.factory.FactoryMethod;

import com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory.ICourse;

public class FactoryMethod {
    public static void main(String[] args) {
        // 只需要修改工厂类即可
        AbstractFactory abstractFactory = new GolangFactory();
        ICourse iCourse = abstractFactory.getCourse();
        iCourse.produce();
    }
}
