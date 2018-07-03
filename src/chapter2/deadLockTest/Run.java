package chapter2.deadLockTest;

/**
 * @author spencercjh
 * 图2-56 出现死锁，A线程需要lock2，B线程需要lock1，而都各自在对方线程中 Page108
 */
public class Run {
    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
