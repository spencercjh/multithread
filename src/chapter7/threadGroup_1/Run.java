package chapter7.threadGroup_1;

/**
 * @author spencercjh
 * 图7-24 Page300
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("我的线程组");
        MyThread[] myThreads = new MyThread[10];
        MyThread myThread1 = new MyThread(threadGroup, "报错线程", "a");
        myThread1.start();
        for (int i = 0; i < 10; i++) {
            myThreads[i] = new MyThread(threadGroup, "线程" + (i + 1), "1");
            myThreads[i].start();
        }
        MyThread myThread2 = new MyThread(threadGroup, "报错线程", "a");
        myThread2.start();
    }
}
