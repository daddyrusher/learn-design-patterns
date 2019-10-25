package com.daddyrusher.behavioral.chainOfResponsibility;

public class ConsoleBasedLogger extends Logger{
    public ConsoleBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String message) {
        System.out.println("CONSOLE LOGGER INFO: " + message);
    }
}
