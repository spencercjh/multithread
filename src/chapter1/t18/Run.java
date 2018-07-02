package chapter1.t18;


/**
 * @author spencercjh
 * 图1-53 1-54 线程优先级可以更改，继承
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
