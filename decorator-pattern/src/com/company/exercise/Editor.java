package com.company.exercise;

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        // We can apply multiple decorators
        artefacts[0] = new ErrorDecorator(new MainDecorator(artefacts[0]));
        artefacts[2] = new ErrorDecorator(artefacts[2]);

        // In the future, we can create a SourceControlDecorator that adds
        // a special marker to the icon if artefacts are not committed to the repository.

        for (AbstractArtefact artefact : artefacts)
            System.out.println(artefact.render());
    }
}
