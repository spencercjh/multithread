package chapter6.singleton_2;

/**
 * @author spencercjh
 * 图6-3 在多线程环境的缓慢加载型单例模式中，会出现单例的问题 Page266
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
