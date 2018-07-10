package chapter7.threadGroup_2;

/**
 * @author spencercjh
 * 图7-25 Page301
 * 使用自定义ThreadGroup线程组，并且重写uncaughtException方法处理组内线程中断行为时，每个线程对象中的run方法内部不要有异常catch语句，如果有catch语句，
 * 则public void uncaughtException(Thread t, Throwable e)不执行
 */
public class Run {
    public static void main(String[] args) {
        MyThreadGroup myThreadGroup = new MyThreadGroup("我的线程组");
        MyThread[] myThreads = new MyThread[10];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(myThreadGroup, "线程" + (i + 1), "1");
            myThreads[i].start();
        }
        MyThread myThread = new MyThread(myThreadGroup, "报错线程", "a");
        myThread.start();
    }
}
