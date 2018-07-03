package chapter2.twoStop;

/**
 * @author spencercjh
 */
public class Service2 {
    private Object objec1 = new Object();
    private Object object2 = new Object();

    public void methodA() {
        synchronized (objec1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {

            }
            System.out.println("methodA end");
        }
    }

    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
