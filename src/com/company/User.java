package com.company;

public class User {
    /**
     *
     * Fields
     * Fields are the properties which the class actually holds. These are the attributes of a class.
     */
    public String name;

    /**
     * Constructors
     * Constructors are called when the object is created. Constructor has no return type and it's name is the same
     * as the class name.
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Methods
     * Methods are part of class which we use to do tasks.
     */
    public void showName() {
        System.out.println("My name is : " + name);
    }
}
