package chapter6.singleton_9;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.connectionFactory.getConnection());
        }
    }
}
