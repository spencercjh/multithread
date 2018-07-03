package chapter2.synStaticMethod;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
