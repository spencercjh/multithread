package chapter2.AtomicIntegerTest;


/**
 * @author spencercjh
 * 图2-81 使用AtomicInteger类实现原子运算完成多线程同步
 */
public class Run {
    public static void main(String[] args) {
        AddCountThread addCountThread = new AddCountThread();
        Thread t1 = new Thread(addCountThread);
        Thread t2 = new Thread(addCountThread);
        Thread t3 = new Thread(addCountThread);
        Thread t4 = new Thread(addCountThread);
        Thread t5 = new Thread(addCountThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
