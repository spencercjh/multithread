package chapter3.join_sleep_1;

/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("B run begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("B run end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("打印了 bService time=" + System.currentTimeMillis());
    }
}
