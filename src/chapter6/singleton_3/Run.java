package chapter6.singleton_3;

/**
 * @author spencercjh
 * 图6-6 在getInstance()方法内把新建对象代码加入同步块中试图解决多线程非单例的问题，但这样没有解决问题 Page270
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
