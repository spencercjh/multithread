package chapter6.singleton_0;

/**
 * @author spencercjh
 * 图6-1 立即加载型单例模式 Page263
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] threads = new MyThread[3];
        for (int i = 0; i < 3; i++) {
            threads[i] = new MyThread();
        }
        for (int i = 0; i < 3; i++) {
            threads[i].start();
        }
    }
}
