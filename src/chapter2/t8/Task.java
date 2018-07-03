package chapter2.t8;

/**
 * @author spencercjh
 */
public class Task {
    public void otherMethod() {
        System.out.println("-----------------------run--otherMethod");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("synchronized thread name=" + Thread.currentThread().getName() + " i= " + (i + 1));
            }
        }
    }
}
