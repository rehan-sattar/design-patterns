package com.company;

public class PngCompressor implements Compressor {
    @Override
    public void compress(String file) {
        System.out.println("Compressing the image into png.");
    }
}
