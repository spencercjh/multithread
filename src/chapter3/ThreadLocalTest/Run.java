package chapter3.ThreadLocalTest;

/**
 * @author spencercjh
 * 图3-60 虽然每个线程都对ThreadLocal执行了set，但每个线程能取出属于自己线程的私有数据 Page193
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            threadA.start();
            threadB.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main" + (i + 1));
                System.out.println("Main get values=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
