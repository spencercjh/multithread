package chapter2.volatileTestThread;

/**
 * @author spencercjh
 * 图2-78 运行结果并不是预料中的10000 Page124
 * 图2-79 synchronized+static == synchronized(class) 实现同步 Page125
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
