package chapter7.stageTest2;

/**
 * @author spencercjh
 * 图7-5 Page282
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            System.out.println("myThread在main方法中的状态" + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
