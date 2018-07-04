package chapter3.notifyOne;

/**
 * @author spencercjh
 * 图3-14 3个线程wait了 但notify方法只会唤醒一个线程 Page149
 * 图3-15 多次调用notify方法，唤醒全部线程 Page150
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
