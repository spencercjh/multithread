package chapter4.hasWaitersTest;

/**
 * @author spencercjh
 * 这里的包hasWaitersTest就是Page224中提到的package test1
 * 图4-23 Page224
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = () -> service.waitMethod();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.notifyMethod();
    }
}
