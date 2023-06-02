package com.gage.DesignPattern.CreationalPatterns.factory.AbstractFactory;

public class Course {
    private Video video;
    private Article article;
    public Course(Video video, Article article){
        this.video =video;
        this.article =article;
    }

    public void make(){
        System.out.println(this.article.produce());
        System.out.println(this.video.produce());
    }
}
