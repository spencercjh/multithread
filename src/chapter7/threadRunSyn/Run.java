package chapter7.threadRunSyn;

/**
 * @author spencercjh
 * 图7-17 Page293
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread myThreadA = new MyThread(lock, "A", 1);
        MyThread myThreadB = new MyThread(lock, "B", 2);
        MyThread myThreadC = new MyThread(lock, "C", 0);
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
    }
}
