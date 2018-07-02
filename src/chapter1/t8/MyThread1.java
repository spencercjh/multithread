package chapter1.t8;

/**
 * @author spencercjh
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run thread name=" + currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run thread name=" + currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
