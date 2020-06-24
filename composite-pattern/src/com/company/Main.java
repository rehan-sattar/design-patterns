package com.company;

public class Main {

    public static void main(String[] args) {
	    Group group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        Group group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        Group group3 = new Group();

        group3.add(group2);
        group3.render();
        group3.move();
    }
}
