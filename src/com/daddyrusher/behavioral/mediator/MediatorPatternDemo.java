package com.daddyrusher.behavioral.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoomImpl();
        User1 user1 = new User1(chatRoom);
        user1.setName("Maksim Zanin");
        user1.sendMessage("Zdarova!");

        User2 user2 = new User2(chatRoom);
        user2.setName("Anna Ivanova");
        user2.sendMessage("Privetik!");
    }
}
