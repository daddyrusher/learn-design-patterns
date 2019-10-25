package com.daddyrusher.behavioral.chainOfResponsibility;

public class ErrorBasedLogger extends Logger {
    public ErrorBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String message) {
        System.out.println("ERROR LOGGER INFO: " + message);
    }
}
