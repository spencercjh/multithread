package t3;

import t2.MyRunnable;

/**
 * @author spencercjh
 * 图1-13 不共享数据的运行结果 Page10
 */
public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
