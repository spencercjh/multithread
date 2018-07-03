package chapter2.doubleSynBlockOneTwo;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private ObjectService service;

    public ThreadA(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}