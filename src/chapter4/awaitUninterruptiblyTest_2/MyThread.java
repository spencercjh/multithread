package chapter4.awaitUninterruptiblyTest_2;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
