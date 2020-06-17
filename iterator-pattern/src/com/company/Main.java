package com.company;

public class Main {

    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
