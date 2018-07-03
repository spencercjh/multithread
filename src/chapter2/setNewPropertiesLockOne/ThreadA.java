package chapter2.setNewPropertiesLockOne;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private Userinfo userinfo;
    private Service service;

    public ThreadA(Service service, Userinfo userinfo) {
        this.userinfo = userinfo;
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }
}
