package chapter1.t6;

/**
 * @author spencercjh
 * 图1-22 运行结果 Page17
 * 图1-23 均被主线程main所调用
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.start();
        myThread.run();
    }
}
