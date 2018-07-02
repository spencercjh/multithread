package t12;

/**
 * @author spencercjh
 * 图1-32 Page26
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？=" + myThread.isInterrupted());
            System.out.println("是否停止2？=" + myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
