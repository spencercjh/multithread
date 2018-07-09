package chapter7.stageTest1;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println(Thread.currentThread().getName() + "在构造方法中的状态" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "在run方法中的状态" + Thread.currentThread().getState());
    }
}
