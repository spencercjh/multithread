package chapter3.joinLong;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
