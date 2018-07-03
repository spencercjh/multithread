package chapter2.twoStop;

/**
 * @author spencercjh
 */
public class Service {
    synchronized public void methodA() {
        System.out.println("methodA begin");
        boolean isContinueRun = true;
        while (isContinueRun) {

        }
        System.out.println("methodA end");
    }

    synchronized public void methodB() {
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
