package chapter2.synMoreObjectStaticOneLock;


/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        Service.printB();
    }
}
