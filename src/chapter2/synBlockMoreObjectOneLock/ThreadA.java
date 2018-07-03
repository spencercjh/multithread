package chapter2.synBlockMoreObjectOneLock;


/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
