package com.gage.DesignPattern.CreationalPatterns.factory.FactoryMethod;

import com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory.ICourse;
import com.gage.DesignPattern.CreationalPatterns.factory.SimpleFactory.PythonCourse;

public class PythonFactory extends AbstractFactory{
    @Override
    public ICourse getCourse() {
        return new PythonCourse();
    }
}
