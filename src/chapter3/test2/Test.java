package chapter3.test2;

/**
 * @author spencercjh
 * 图3-5 wait线程3s后被notify线程唤醒 Page139
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread1 myThread1 = new MyThread1(lock);
        myThread1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread2 myThread2 = new MyThread2(lock);
        myThread2.start();
    }
}
