package t6;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Run方法的打印：" + Thread.currentThread().getName());
    }
}
