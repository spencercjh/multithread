package chapter2.twoObjectTwoLock;

import chapter2.twoObjectTwoLock.HasSelfPrivateNum;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
