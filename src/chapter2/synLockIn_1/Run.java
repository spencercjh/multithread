package chapter2.synLockIn_1;

/**
 * @author spencercjh
 * 图2-13 同一个线程对同一个对象的锁是可重入的
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread myThread1 = new MyThread(service);
        MyThread myThread2 = new MyThread(service);
        myThread1.start();
        myThread2.start();
    }
}
