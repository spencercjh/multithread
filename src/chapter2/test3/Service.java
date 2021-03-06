package chapter2.test3;


/**
 * @author spencercjh
 */
public class Service {
    public void testMethod1(MyObject myObject) {
        synchronized (myObject) {
            try {
                System.out.println("test1 method1 get lock time=" +
                        System.currentTimeMillis() +
                        "run thread name" + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("test1 method1 release lock time=" +
                        System.currentTimeMillis() +
                        "run thread name" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
