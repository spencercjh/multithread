package chapter2.innerTest2;

/**
 * @author spencercjh
 * 图2-63 Page115
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2();
        Thread t1 = new Thread(() -> innerClass1.method1(innerClass2), "T1");
        Thread t2 = new Thread(() -> innerClass1.method2(), "T2");
        Thread t3 = new Thread(() -> innerClass2.method1(), "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
