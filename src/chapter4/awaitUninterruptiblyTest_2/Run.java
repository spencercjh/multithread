package chapter4.awaitUninterruptiblyTest_2;

/**
 * @author spencercjh
 * 图4-32 Page232
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
