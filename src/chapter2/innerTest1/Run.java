package chapter2.innerTest1;

/**
 * @author spencercjh
 * 图2-62 由于持有不同的对象监视器，结果是乱序的
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(() -> inner.method1(), "A");
        Thread t2 = new Thread(() -> inner.method2(), "B");
        t1.start();
        t2.start();
    }
}
