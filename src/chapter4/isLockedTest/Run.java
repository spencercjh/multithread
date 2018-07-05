package chapter4.isLockedTest;

/**
 * @author spencercjh
 * 这里的包isLockedTest就是Page226中提到的package test3
 * 图4-26 Page226
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = () -> {
            service.serviceMethod();
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
