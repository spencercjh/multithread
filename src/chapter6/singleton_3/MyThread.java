package chapter6.singleton_3;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
