package chapter4.tryLockTest;

/**
 * @author spencercjh
 * 图4-29 Page229
 */
public class Run {
    public static void main(String[] args) {
        final MyService myService = new MyService();
        Runnable runnable = () -> {
            myService.waitMethod();
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
