package com.daddyrusher.behavioral.command;

public class CommandPatternClient {
    public static void main(String[] args) {
        Document document = new Document();
        ActionListenerCommand clickOpen = new ActionOpen(document);
        ActionListenerCommand clickSave = new ActionOpen(document);

        MenuOptions menuOptions = new MenuOptions(clickOpen, clickSave);
        menuOptions.clickOpen();
        menuOptions.clickSave();
    }
}
