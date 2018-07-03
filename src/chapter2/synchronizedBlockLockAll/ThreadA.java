package chapter2.synchronizedBlockLockAll;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private Service service;
    private MyObject myObject;

    public ThreadA(Service service, MyObject myObject) {
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        service.testMethod1(myObject);
    }
}
