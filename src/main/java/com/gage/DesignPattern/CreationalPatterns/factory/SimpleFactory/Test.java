package com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        ICourse iCourse = simpleFactory.getCourse("python");
        iCourse.produce();
    }
}
