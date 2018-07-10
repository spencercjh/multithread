package chapter7.groupInnerStop;

/**
 * @author spencercjh
 * 图7-15 Page290
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup("我的线程组");
            for (int i = 0; i < 5; i++) {
                MyThread myThread = new MyThread(group, "线程" + (i + 1));
                myThread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("调用了interrupt方法");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
