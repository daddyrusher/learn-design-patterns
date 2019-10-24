package com.daddyrusher.behavioral.objectPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ObjectPoolDemo {
    private ObjectPool<ExportingProcess> pool;
    private AtomicLong processNumber = new AtomicLong(0);

    public void setup() {
        pool = new ObjectPool<ExportingProcess>(4, 10, 5) {
            @Override
            protected ExportingProcess createObject() {
                return new ExportingProcess(processNumber.incrementAndGet());
            }
        };
    }

    public void tearDown() {
        pool.shutdown();
    }

    public void testObjectPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        executorService.execute(new ExploringTask(pool, 1));
        executorService.execute(new ExploringTask(pool, 2));
        executorService.execute(new ExploringTask(pool, 3));
        executorService.execute(new ExploringTask(pool, 4));
        executorService.execute(new ExploringTask(pool, 5));
        executorService.execute(new ExploringTask(pool, 6));
        executorService.execute(new ExploringTask(pool, 7));
        executorService.execute(new ExploringTask(pool, 8));

        executorService.shutdown();

        try {
            executorService.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ObjectPoolDemo objectPoolDemo = new ObjectPoolDemo();
        objectPoolDemo.setup();
        objectPoolDemo.tearDown();
        objectPoolDemo.testObjectPool();
    }
}
