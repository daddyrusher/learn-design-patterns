package com.daddyrusher.behavioral.chainOfResponsibility;

public class DebugBasedLogger extends Logger {
    public DebugBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String message) {
        System.out.println("DEBUG LOGGER INFO:" + message);
    }
}
