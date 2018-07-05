package chapter4.ReentrantLockTest;

/**
 * @author spencercjh
 * 图4-1 多个线程同步执行打印任务，但线程的执行顺序是随机的 Page202
 * 效果和synchronized一样
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread myThread1 = new MyThread(myService);
        MyThread myThread2 = new MyThread(myService);
        MyThread myThread3 = new MyThread(myService);
        MyThread myThread4 = new MyThread(myService);
        MyThread myThread5 = new MyThread(myService);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
