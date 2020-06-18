package com.company;

public class BandWFilter implements Filter {

    @Override
    public void apply(String file) {
        System.out.println("Filtering the image into b&w");
    }
}
