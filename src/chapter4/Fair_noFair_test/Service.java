package chapter4.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author spencercjh
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("Thread name=" + Thread.currentThread().getName() + "获得锁定");
        } finally {
            lock.unlock();
        }
    }
}
