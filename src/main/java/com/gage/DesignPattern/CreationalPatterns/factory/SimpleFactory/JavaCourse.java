package com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory;

public class JavaCourse implements ICourse {
    @Override
    public void produce() {
        System.out.println("制作java视频");
    }
}
