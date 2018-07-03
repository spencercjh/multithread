package chapter2.synTwoLock;

/**
 * @author spencercjh
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @SuppressWarnings("AccessStaticViaInstance")
    @Override
    public void run() {
        //noinspection AliAccessStaticViaInstance
        service.printC();
    }
}
