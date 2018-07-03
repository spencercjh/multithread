package chapter2.setNewPropertiesLockOne;

/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    private Userinfo userinfo;
    private Service service;

    public ThreadB(Service service, Userinfo userinfo) {
        this.userinfo = userinfo;
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }
}
