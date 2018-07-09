package chapter6.singleton_1;

/**
 * @author spencercjh
 * 图6-2 单线程环境下的延迟加载型单例模式 Page264
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
