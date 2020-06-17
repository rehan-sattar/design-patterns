package com.company;

/**
 *
 * @description:
 * An iterator interface is a general interface, we will override all the methods in it.
 * @method current
 * Should have a generic type, because at some point of time in future, we want
 * to use this iterator with list of users, customers etc. Then we need Generic type.
 * @prototype
 * Iterator<T> {
 *     T current();
 * }
 */
public interface Iterator {
    // tells weather we have next item or not.
    boolean hasNext();
    // returns the current element.
    String current();
    // move to next element
    void next();
}
