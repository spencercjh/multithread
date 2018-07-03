package chapter2.synStaticMethod;

/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}
