package chapter1.suspend_resume_deal_lock;

/**
 * @author spencercjh
 */
public class SynchronizedObject {
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("END!");
    }
}
