package chapter2.synLockIn_1;


/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread() {

    }

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
//        Service service = new Service();
        service.service1();
    }
}
