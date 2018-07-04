package chapter3.waitHasParamMethod;

/**
 * @author spencercjh
 * 图3-17 wait(long)如果超过long时间就会自动唤醒
 * 图3-18 在long时间内被唤醒
 */
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = () -> {
        try {
            synchronized (lock) {
                System.out.println("wait begin time=" + System.currentTimeMillis());
                lock.wait(5000);
                System.out.println("wait end time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    static private Runnable runnable2 = () -> {
        synchronized (lock) {
            System.out.println("notify begin time =" + System.currentTimeMillis());
            lock.notify();
            System.out.println("notify end time=" + System.currentTimeMillis());
        }
    };

    public static void main(String[] args) {
        Thread thread = new Thread(runnable1);
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
