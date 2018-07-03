package chapter2.twoStop;

/**
 * @author spencercjh
 */
public class ThreadB2 extends Thread {
    private Service2 service;

    public ThreadB2(Service2 service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
