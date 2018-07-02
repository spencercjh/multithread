package useStopMethodThreadTest;

/**
 * @author spencercjh
 * 图1-41 暴力停止线程 Page33
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(10000);
            myThread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END");
    }
}
