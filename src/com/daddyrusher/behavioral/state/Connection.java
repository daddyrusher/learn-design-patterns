package com.daddyrusher.behavioral.state;

public interface Connection {
    public void open();
    public void close();
    public void log();
    public void update();
}
