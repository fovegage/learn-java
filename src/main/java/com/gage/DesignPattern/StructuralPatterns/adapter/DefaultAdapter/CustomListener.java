package com.gage.DesignPattern.StructuralPatterns.adapter.DefaultAdapter;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;

import java.io.File;

public class CustomListener extends FileAlterationListenerAdaptor {
    // 只需关注特定的就行
    @Override
    public void onFileCreate(File file) {
        System.out.println("File created: " + file.getAbsolutePath());
    }
}
