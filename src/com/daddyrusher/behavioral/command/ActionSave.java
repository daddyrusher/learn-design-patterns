package com.daddyrusher.behavioral.command;

public class ActionSave implements ActionListenerCommand {
    private Document document;

    public ActionSave(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
