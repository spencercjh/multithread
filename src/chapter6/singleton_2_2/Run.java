package chapter6.singleton_2_2;

/**
 * @author spencercjh
 * 图6-5 在getInstance()方法内把所有代码加入同步块中解决多线程非单例的问题，但这样十分影响效率 Page268
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
