package chapter3.waitReleaseLock;

/**
 * @author spencercjh
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait");
//                lock.wait();
                Thread.sleep(5000);
                System.out.println("end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
