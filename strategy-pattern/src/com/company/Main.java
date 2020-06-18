package com.company;

public class Main {

    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("SOMEGFILE", new BandWFilter(), new PngCompressor());
        imageStorage.store("SOMEGFILE", new BandWFilter(), new JpgCompressor());
    }
}
