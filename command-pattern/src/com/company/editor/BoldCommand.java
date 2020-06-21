package com.company.editor;

public class BoldCommand implements UndoableCommand {
     private String prevContent;
     private final History history;
     private final HtmlDocument document;

    public BoldCommand(HtmlDocument document, History history) {
        this.history = history;
        this.document = document;
    }

    @Override
    public void unExecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
