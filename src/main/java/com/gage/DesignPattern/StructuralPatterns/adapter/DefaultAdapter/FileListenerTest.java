package com.gage.DesignPattern.StructuralPatterns.adapter.DefaultAdapter;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public class FileListenerTest implements FileAlterationListener {

    @Override
    public void onStart(FileAlterationObserver observer) {
        System.out.println("Monitoring started.");
    }

    @Override
    public void onDirectoryCreate(File directory) {
        System.out.println("Directory created: " + directory.getAbsolutePath());
    }

    @Override
    public void onDirectoryChange(File directory) {
        System.out.println("Directory modified: " + directory.getAbsolutePath());
    }

    @Override
    public void onDirectoryDelete(File directory) {
        System.out.println("Directory deleted: " + directory.getAbsolutePath());
    }

    @Override
    public void onFileCreate(File file) {
        System.out.println("File created: " + file.getAbsolutePath());
    }

    @Override
    public void onFileChange(File file) {
        System.out.println("File modified: " + file.getAbsolutePath());
    }

    @Override
    public void onFileDelete(File file) {
        System.out.println("File deleted: " + file.getAbsolutePath());
    }

    @Override
    public void onStop(FileAlterationObserver observer) {
        System.out.println("Monitoring stopped.");
    }
}
