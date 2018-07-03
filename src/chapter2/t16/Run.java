package chapter2.t16;

/**
 * @author spencercjh
 * 图2-72 Page121
 * 使用volatile关键字增加了实例变量在多个线程之间的可见性
 */
public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为false了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
