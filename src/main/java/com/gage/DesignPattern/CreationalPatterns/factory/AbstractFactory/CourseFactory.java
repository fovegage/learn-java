package com.gage.DesignPattern.CreationalPatterns.factory.AbstractFactory;

public interface CourseFactory {
    // 产品等级定义
    Article getArticle();

    Video getVideo();
}
