package com.gage.DesignPattern.CreationalPatterns.factory.AbstractFactory;

public class PythonFactory implements CourseFactory {
    @Override
    public Article getArticle() {
        return new PythonArticle();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
