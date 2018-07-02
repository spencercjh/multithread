package t15;

/**
 * @author spencercjh
 * 图1-39 图1-40 先停止再睡眠 Page31
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("END");
    }
}
