package com.gage.DesignPattern.CreationalPatterns.factory.FactoryMethod;

import com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory.ICourse;

public class GolangCourse implements ICourse {
    @Override
    public void produce() {
        System.out.println("制作golang视频");
    }
}
