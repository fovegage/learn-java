package com.gage.DesignPattern.CreationalPatterns.factory.FactoryMethod;

import com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory.ICourse;

public class GolangFactory extends AbstractFactory{
    @Override
    public ICourse getCourse() {
        return new GolangCourse();
    }
}
