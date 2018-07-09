package chapter6.singleton_0;

/**
 * @author spencercjh
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
