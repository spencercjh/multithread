package chapter3.join_sleep_1;

/**
 * @author spencercjh
 * 图3-49 线程A sleep 6s，一直持有对threaB的锁，所以线程C只有在A执行完了以后才能拿到锁执行 Page186
 * 证明了Thread.sleep(long)不释放锁
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
