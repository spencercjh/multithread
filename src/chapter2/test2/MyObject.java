package chapter2.test2;

/**
 * @author spencercjh
 */
public class MyObject {
    synchronized public void speedPrintString() {
        System.out.println("speedPrintString get lock time=" +
                System.currentTimeMillis() +
                "run thread name" + Thread.currentThread().getName());
        System.out.println("--------------------------------------");
        System.out.println("speedPrintString release lock time=" +
                System.currentTimeMillis() +
                "run thread name" + Thread.currentThread().getName());
    }
}
