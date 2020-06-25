package com.company.exercise;

public class ErrorDecorator implements AbstractArtefact {
    private AbstractArtefact artefact;

    protected ErrorDecorator(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        String mainIcon = artefact.render();
        return mainIcon + " [Error]";
    }
}
