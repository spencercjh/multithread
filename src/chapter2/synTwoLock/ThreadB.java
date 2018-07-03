package chapter2.synTwoLock;

/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @SuppressWarnings("AccessStaticViaInstance")
    @Override
    public void run() {
        //noinspection AliAccessStaticViaInstance
        service.printB();
    }
}
