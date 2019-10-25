package com.daddyrusher.behavioral.state;

public class Management implements Connection {
    @Override
    public void open() {
        System.out.println("Open the database for management");
    }

    @Override
    public void close() {
        System.out.println("Close the database");
    }

    @Override
    public void log() {
        System.out.println("Log activities");
    }

    @Override
    public void update() {
        System.out.println("Management has been updated");
    }
}
