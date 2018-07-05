package chapter4.isFairTest;

/**
 * @author spencercjh
 * 这里的包isFairTest就是Page224中提到的package test1
 * 图4-24 Page225
 * ReentrantLock默认是非公平锁
 */
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = () -> {
            service1.serviceMethod();
        };
        Thread thread = new Thread(runnable);
        thread.start();
        final Service service2 = new Service(false);
        runnable = () -> {
            service2.serviceMethod();
        };
        thread = new Thread(runnable);
        thread.start();
    }
}
