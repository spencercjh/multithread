package chapter2.synchronizedMethodLockObject2;

/**
 * @author spencercjh
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end time= " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB() {
        try {
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName() +
                    " begin time= " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("END " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
