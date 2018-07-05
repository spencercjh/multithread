package chapter3.join_sleep_2;

/**
 * @author spencercjh
 * 图3-50 A线程中释放了对B线程的锁，所以C线程可以调用B线程的同步方法了 Page187
 * 证明了thread.join(long)和join()具有释放锁的特点
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB threadB = new ThreadB();
            ThreadA threadA = new ThreadA(threadB);
            threadA.start();
            Thread.sleep(1000);
            ThreadC threadC = new ThreadC(threadB);
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
