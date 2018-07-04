package chapter3.waitInterruptException;

/**
 * @author spencercjh
 * 图3-12 wait后线程已经停止状态了不能再interrupt了 Page148
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            threadA.start();
            Thread.sleep(5000);
            threadA.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
