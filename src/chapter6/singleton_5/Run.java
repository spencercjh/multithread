package chapter6.singleton_5;

/**
 * @author spencercjh
 * 图6-7 在getInstance()方法内把新建对象代码加入同步块中并再做一次判空操作，这样就解决了多线程非单例和效率矛盾的问题 Page271
 * 这个方法叫Double-Check Locking DCL双重检查
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
