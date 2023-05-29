package com.gage.DesignPattern.CreationalPatterns.factory.AbstractFactory;

public class JavaFactory implements CourseFactory {
    @Override
    public Article getArticle() {
        return new JavaArticle();
    }

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
