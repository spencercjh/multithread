package t12;

/**
 * @author spencercjh
 * 图1-34 Page27
 */
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？=" + myThread.isInterrupted());
            System.out.println("是否停止1？=" + myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
