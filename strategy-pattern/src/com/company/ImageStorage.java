package com.company;

public class ImageStorage {
    public void store(String fileName, Filter filter, Compressor compressor) {
        // first compress the image
        compressor.compress(fileName);

        // then filter the image

        filter.apply(fileName);

        // store the image
        System.out.println("Storing image....");
    }
}
