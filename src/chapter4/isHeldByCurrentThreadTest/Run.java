package chapter4.isHeldByCurrentThreadTest;

/**
 * @author spencercjh
 * 这里的包isHeldByCurrentThreadTest就是Page225中提到的package test2
 * 图4-25 Page226
 */
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = () -> {
            service1.serviceMethod();
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
