package com.gage.DesignPattern.CreationalPatterns.factory.FactoryMethod;

import com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory.ICourse;
import com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory.JavaCourse;

public class JavaFactory extends AbstractFactory{
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }
}
