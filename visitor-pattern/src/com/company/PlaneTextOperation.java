package com.company;

public class PlaneTextOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Plane text-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Plane text-anchor");
    }
}
