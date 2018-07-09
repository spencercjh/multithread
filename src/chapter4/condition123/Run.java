package chapter4.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author spencercjh
 * 图4-36 Page235
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class Run {
    volatile private static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            try {
                lock.lock();
                while (nextPrintWho != 1) {
                    conditionA.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread A" + (i + 1));
                }
                nextPrintWho = 2;
                conditionB.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread threadB = new Thread(() -> {
            try {
                lock.lock();
                while (nextPrintWho != 2) {
                    conditionB.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread B" + (i + 1));
                }
                nextPrintWho = 3;
                conditionC.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread threadC = new Thread(() -> {
            try {
                lock.lock();
                while (nextPrintWho != 3) {
                    conditionC.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread C" + (i + 1));
                }
                nextPrintWho = 1;
                conditionA.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread[] threadsA = new Thread[5];
        Thread[] threadsB = new Thread[5];
        Thread[] threadsC = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threadsA[i] = new Thread(threadA);
            threadsB[i] = new Thread(threadB);
            threadsC[i] = new Thread(threadC);
        }
        for (int i = 0; i < 5; i++) {
            threadsA[i].start();
            threadsB[i].start();
            threadsC[i].start();
        }
    }
}
