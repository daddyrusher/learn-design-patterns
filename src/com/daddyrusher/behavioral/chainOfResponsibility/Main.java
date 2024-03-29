package com.daddyrusher.behavioral.chainOfResponsibility;

public class Main {
    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        consoleLogger.setNextLevelLogger(errorLogger);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }
    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is completed");
    }
}
