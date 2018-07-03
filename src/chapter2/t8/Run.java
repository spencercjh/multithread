package chapter2.t8;

/**
 * @author spencercjh
 * 图2-27 线程执行非同步方法并不会获得对象锁，两个线程是异步执行的 Page82
 * 图2-28 线程分别拿到对象锁后就会同步执行 Page82
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 myThread1 = new MyThread1(task);
        MyThread2 myThread2 = new MyThread2(task);
        myThread1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2.start();
    }
}
