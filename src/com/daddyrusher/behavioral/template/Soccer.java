package com.daddyrusher.behavioral.template;

public class Soccer extends Game {
    @Override
    void initialize() {
        System.out.println("Soccer game initialized! Start playing.");
    }

    @Override
    void start() {
        System.out.println("Game started. Welcome to in the Soccer Game!");
    }

    @Override
    void end() {
        System.out.println("Game finished");
    }
}
