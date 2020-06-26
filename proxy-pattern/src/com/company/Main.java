package com.company;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        String[] books = {"a", "b", "c"};

        for(String bookName: books){
            library.add(new EbookProxy(bookName));
        }

        library.openEbook("a");
    }
}
