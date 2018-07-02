package chapter1.suspend_resume_deal_lock;

/**
 * @author spencercjh
 * 图1-46 suspend有独占锁
 */
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(() -> object.printString());
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(() -> {
                System.out.println("thread2启动，但进入不了printString()方法！只打印1个begin！");
                System.out.println("因为printString()方法被a线程锁死并且永远suspend挂起暂停了！");
                object.printString();
            });
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
