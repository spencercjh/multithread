package chapter4.isFairTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author spencercjh
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("公平锁情况" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
