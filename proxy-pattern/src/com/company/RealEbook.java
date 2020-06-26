package com.company;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    public void load() {
        System.out.println("loading file: " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the file: " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
