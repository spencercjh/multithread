package chapter3.notifyOne;

/**
 * @author spencercjh
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait thread name=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait thread name=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
