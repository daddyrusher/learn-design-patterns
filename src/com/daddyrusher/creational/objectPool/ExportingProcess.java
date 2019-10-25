package com.daddyrusher.creational.objectPool;

public class ExportingProcess {
    private long processNumber;
    public ExportingProcess(long processNumber) {
        this.processNumber = processNumber;
        System.out.println("Object with process no. " + processNumber + " was created");
    }

    public long getProcessNumber() {
        return processNumber;
    }
}
