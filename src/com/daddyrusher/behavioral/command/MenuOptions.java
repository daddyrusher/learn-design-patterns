package com.daddyrusher.behavioral.command;

public class MenuOptions {
    private ActionListenerCommand open;
    private ActionListenerCommand save;
    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.open = open;
        this.save = save;
    }

    public void clickOpen() {
        open.execute();
    }
    public void clickSave() {
        save.execute();
    }
}
