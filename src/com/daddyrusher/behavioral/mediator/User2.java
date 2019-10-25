package com.daddyrusher.behavioral.mediator;

public class User2 extends Participant {
    private String name;
    private ChatRoom chat;

    public User2(ChatRoom chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.showMessage(message, this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
