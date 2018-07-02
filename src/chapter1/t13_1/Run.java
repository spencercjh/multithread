package chapter1.t13_1;

/**
 * @author spencercjh
 * 图1-37 Page30 利用抛出中断异常来中断线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END!");
    }
}
