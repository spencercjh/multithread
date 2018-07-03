package chapter2.throwExceptionNoLock;

/**
 * @author spencercjh
 */
public class Service {
    synchronized public void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() +
                    " run begin time=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("ThreadName=" + Thread.currentThread().getName() +
                            "run exception time=" + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run time=" + System.currentTimeMillis());
        }
    }
}
