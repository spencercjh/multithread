package chapter1.t17;

/**
 * @author spencercjh
 * 图1-51 1-52 ThreadB.yield()将线程占有的CPU资源让出去以后导致运行速度变慢
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
