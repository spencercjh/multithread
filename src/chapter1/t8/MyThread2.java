package chapter1.t8;

/**
 * @author spencercjh
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + currentThread().getName() + " begin =" + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("run threadName=" + currentThread().getName() + " end =" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
