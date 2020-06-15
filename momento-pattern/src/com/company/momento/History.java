package com.company.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorState> states = new ArrayList<>();

    public void push (EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
