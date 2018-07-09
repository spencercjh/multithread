package chapter6.singleton_2_1;

/**
 * @author spencercjh
 * 图6-4 对getInstance()方法加同步锁解决多线程非单例的问题，但这样十分影响效率 Page267
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[3];
        for (int i = 0; i < 3; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 3; i++) {
            myThreads[i].start();
        }
    }
}
