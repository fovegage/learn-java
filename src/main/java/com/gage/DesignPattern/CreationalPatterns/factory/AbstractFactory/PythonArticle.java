package com.gage.DesignPattern.CreationalPatterns.factory.AbstractFactory;

public class PythonArticle extends Article {
    @Override
    public String produce() {
        return "制作python手记";
    }
}
