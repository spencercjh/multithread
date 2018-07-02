package sameNum;

/**
 * @author spencercjh
 * 图1-20 使用同步确保线程安全
 */
public class MyThread extends Thread {
    private int i = 5;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("i=" + (i--) + "threadName=" + Thread.currentThread().getName());
        }
    }
}
