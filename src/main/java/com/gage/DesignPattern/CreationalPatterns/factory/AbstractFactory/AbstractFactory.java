package com.gage.DesignPattern.CreationalPatterns.factory.AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaFactory();
        Article article = courseFactory.getArticle();
        System.out.println(article.produce());
    }
}
