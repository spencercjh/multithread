package chapter4.hasQueuedThreadTest;

/**
 * @author spencercjh
 * 这里的包hasQueuedThreadTest就是P222中提到的package test1
 * 图4-22 Page223
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = () -> service.waitMethod();
        Thread threadA = new Thread(runnable);
        threadA.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadB = new Thread(runnable);
        threadB.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
