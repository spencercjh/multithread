package chapter4.Fair_noFair_test;

/**
 * @author spencercjh
 * 图4-17 true-公平锁 Page218
 */
public class RunFair {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = () -> {
            System.out.println("#线程" + Thread.currentThread().getName() + "运行了！");
            service.serviceMethod();
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
