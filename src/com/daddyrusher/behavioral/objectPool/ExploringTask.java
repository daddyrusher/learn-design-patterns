package com.daddyrusher.behavioral.objectPool;

public class ExploringTask implements Runnable {
    private ObjectPool<ExportingProcess> pool;
    private int threadNumber;

    public ExploringTask(ObjectPool<ExportingProcess> pool, int threadNumber) {
        this.pool = pool;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread " + threadNumber + ": Object with process number " + exportingProcess.getProcessNumber() + " was borrowed");

        pool.returnObject(exportingProcess);
        System.out.println("Thread " + threadNumber + ": Object with process number " + exportingProcess.getProcessNumber() + " was returned");
    }
}
