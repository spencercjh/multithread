package chapter2.synchronizedMethodLockObject2;


/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
