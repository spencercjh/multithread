package chapter2.synMoreObjectStaticOneLock;


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
        Service.printA();
    }
}
