package suspend_resume_nosameValue;

/**
 * @author spencercjh
 * 图1-50 线程a被挂起了，部分值不同步
 */
public class Run {
    public static void main(String[] args) {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(() -> {
            myObject.setValue("a", "aa");
        });
        thread1.setName("a");
        thread1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(() -> {
            myObject.printUserNamePassword();
        });
        thread2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
