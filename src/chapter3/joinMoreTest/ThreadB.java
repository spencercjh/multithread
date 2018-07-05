package chapter3.joinMoreTest;

/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin B thread name=" + Thread.currentThread().getName() +
                    " time =" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end B thread name=" + Thread.currentThread().getName() +
                    " time =" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
