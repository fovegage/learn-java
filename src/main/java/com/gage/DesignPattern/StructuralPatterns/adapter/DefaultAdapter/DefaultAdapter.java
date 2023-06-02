package com.gage.DesignPattern.StructuralPatterns.adapter.DefaultAdapter;

import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public class DefaultAdapter {
    public static void main(String[] args) throws Exception {
        // 监听目录
        File file = new File("/Users/gaozhe/IdeaProjects/learn/learn-java/src/main/java/com/gage/DesignPattern/StructuralPatterns/adapter/ClassAdapter");

        // 观察者模式监听
        FileAlterationObserver fileAlterationObserver = new FileAlterationObserver(file);
//        fileAlterationObserver.addListener(new FileListenerTest());
        // 适配器引入
        fileAlterationObserver.addListener(new CustomMonitor());

        // 启动监听
        FileAlterationMonitor fileAlterationMonitor = new FileAlterationMonitor(1000);
        fileAlterationMonitor.addObserver(fileAlterationObserver);
        fileAlterationMonitor.start();
    }
}
