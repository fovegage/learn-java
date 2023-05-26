package com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory;

public class PythonCourse implements ICourse {
    @Override
    public void produce() {
        System.out.println("制作Python视频");
    }
}
