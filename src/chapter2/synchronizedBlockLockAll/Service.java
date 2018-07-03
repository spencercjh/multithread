package chapter2.synchronizedBlockLockAll;

/**
 * @author spencercjh
 */
public class Service {
    public void testMethod1(MyObject myObject) {
        synchronized (myObject) {
            System.out.println("test method1 get lock time=" +
                    System.currentTimeMillis() +
                    " run thread name=" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test method1 release lock time=" +
                    System.currentTimeMillis() +
                    "run thread name=" + Thread.currentThread().getName());
        }
    }
}
