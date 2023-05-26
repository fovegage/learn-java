package com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory;

public class SimpleFactory {
    public ICourse getCourse(String name) {
        if (name.equals("java")) {
            return new JavaCourse();
        } else if (name.equals("python")) {
            return new PythonCourse();
        } else {
            // 为实现
            return null;
        }
    }
}
