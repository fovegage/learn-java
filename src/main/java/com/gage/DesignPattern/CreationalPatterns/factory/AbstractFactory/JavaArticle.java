package com.gage.DesignPattern.CreationalPatterns.factory.AbstractFactory;

public class JavaArticle extends Article {
    @Override
    public String produce() {
        return "制作java手记";
    }
}
