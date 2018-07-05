package chapter3.joinLong;

/**
 * @author spencercjh
 * 图3-47 线程Sleep了5s但因为join(2000)，2s后停下来了 Page183
 * 图3-48 sleep(2000)和join(2000)效果相同 Page184
 * 但这2个方法在同步处理上是有区别的
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
//            myThread.join(2000);
            Thread.sleep(2000);
            System.out.println("end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
