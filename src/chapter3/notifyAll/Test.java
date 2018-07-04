package chapter3.notifyAll;

/**
 * @author spencercjh
 * 图3-16 3个线程wait了 notifyAll方法唤醒全部停止线程 Page150
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        ThreadB threadB = new ThreadB(lock);
        threadB.start();
        ThreadC threadC = new ThreadC(lock);
        threadC.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
