package chapter2.synTwoLock;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @SuppressWarnings("AccessStaticViaInstance")
    @Override
    public void run() {
        //noinspection AliAccessStaticViaInstance
        service.printA();
    }
}
