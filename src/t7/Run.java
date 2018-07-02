package t7;

/**
 * @author spencercjh
 * 图1-24 运行结果 Page19
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin== " + myThread.isAlive());
        myThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end== " + myThread.isAlive());
    }
}
