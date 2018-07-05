package chapter4.lockInterruptiblyTest1;

/**
 * @author spencercjh
 * 图4-27 Page228
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
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
        System.out.println("main end!");
    }
}
