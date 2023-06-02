package com.gage.DesignPattern.CreationalPatterns.factory.AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        // 大工厂 java工厂 python工厂
        // java工厂
        // 生产手记和视频
        CourseFactory courseFactory = new JavaFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        Course course = new Course(video, article);
        course.make();
    }
}
