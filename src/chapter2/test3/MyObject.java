package chapter2.test3;

/**
 * @author spencercjh
 */
public class MyObject {
    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString get lock time=" +
                    System.currentTimeMillis() + " run thread time=" +
                    Thread.currentThread().getName());
            System.out.println("-------------------------------");
            System.out.println("speedPrintString get release time=" +
                    System.currentTimeMillis() + " run thread time=" +
                    Thread.currentThread().getName());
        }
    }
}
