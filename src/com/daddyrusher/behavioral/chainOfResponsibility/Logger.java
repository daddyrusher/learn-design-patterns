package com.daddyrusher.behavioral.chainOfResponsibility;

public abstract class Logger {
    public static int OUTPUTINFO = 1;
    public static int ERRORINFO = 2;
    public static int DEBUGINFO = 3;
    protected int levels;
    protected Logger nextLevelLogger;
    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String message) {
        if (this.levels <= levels) {
            displayLogInfo(message);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, message);
        }
    }

    protected abstract void displayLogInfo(String message);
}
