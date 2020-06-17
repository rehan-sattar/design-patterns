package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrowseHistory {
//    List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count = 0;

    void push(String item) {
        urls[count++] = item;
    }

    String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return  new ArrayIterator(this);
    }

    // We will create a sub class for iterating over a list.
    class ListIterator implements Iterator {
        private BrowseHistory history;
        private int index = 0;

        ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.length;
        }

        @Override
        public String current() {
            System.out.println(history.urls[index]);
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

    class ArrayIterator implements  Iterator {
        private BrowseHistory history;
        private int index;
        ArrayIterator(BrowseHistory history) {
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return index < history.count;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
