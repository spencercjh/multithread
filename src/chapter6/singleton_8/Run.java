package chapter6.singleton_8;

/**
 * @author spencercjh
 * 这是一种立即加载型单例模式
 * 图6-11 在MyObject中使用static代码块，在static代码块中新建对象，保证单例性 Page275
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
