package chapter7.threadCreateException;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
