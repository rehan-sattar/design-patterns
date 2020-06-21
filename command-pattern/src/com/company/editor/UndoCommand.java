package com.company.editor;

public class UndoCommand implements Command {
    private final History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.size() > 0) {
            history.pop().unExecute();
        }
    }
}
