package chapter2.synchronizedOneThreadIn;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private ObjectService service;

    public ThreadA(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
