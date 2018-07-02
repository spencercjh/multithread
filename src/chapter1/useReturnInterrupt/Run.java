package chapter1.useReturnInterrupt;

/**
 * @author spencercjh
 * 图1-44 利用interrupt+return来停止线程
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
    }
}
