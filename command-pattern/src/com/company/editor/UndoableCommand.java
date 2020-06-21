package com.company.editor;

public interface UndoableCommand extends  Command {
    void unExecute();
}
