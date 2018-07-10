package chapter7.stageTest4;

/**
 * @author spencercjh
 * 图7-7 Page285
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            System.out.println("main方法中的myThread状态" + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
