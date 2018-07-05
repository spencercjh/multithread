package chapter4.ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author spencercjh
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void methodA() {
        try {
            lock.lock();
            System.out.println("methodA begin Thread Name=" + Thread.currentThread().getName() +
                    " time =" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end Thread Name=" + Thread.currentThread().getName() +
                    " time =" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        try {
            lock.lock();
            System.out.println("methodB begin Thread Name=" + Thread.currentThread().getName() +
                    " time =" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end Thread Name=" + Thread.currentThread().getName() +
                    " time =" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
