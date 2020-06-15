package com.company;

import com.company.momento.Editor;
import com.company.momento.History;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("First Content");
        history.push(editor.createState());

        editor.setContent("Second Content");
        history.push(editor.createState());

        editor.setContent("Third Content");
        history.push(editor.createState());

        editor.setContent("Fourth Content");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
