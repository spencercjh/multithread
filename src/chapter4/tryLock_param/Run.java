package chapter4.tryLock_param;

/**
 * @author spencercjh
 * 图4-30 Page230
 */
public class Run {
    public static void main(String[] args) {
        final MyService myService = new MyService();
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "调用waitMethod时间" + System.currentTimeMillis());
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
