package chapter6.singleton_7;

import chapter6.singleton_5.MyThread;

/**
 * @author spencercjh
 * 图6-8 把MyObject的单例放到MyObject的内部静态类中实现多线程环境下的立即加载型单例模式 Page272
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
