package chapter7.stageTest1;

/**
 * @author spencercjh
 * 图7-4 Page281
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            System.out.println(Thread.currentThread().getName() + "在main方法中的状态1" + myThread.getState());
            Thread.sleep(1000);
            myThread.start();
            Thread.sleep(2000);
            System.out.println("myThread在main方法中的状态2" + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
