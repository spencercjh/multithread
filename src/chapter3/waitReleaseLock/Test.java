package chapter3.waitReleaseLock;

/**
 * @author spencercjh
 * 图3-9 wait方法会自动释放锁，A线程wait后B线程就拿到了锁
 * 图3-10 sleep方法不释放锁，A线程执行完后才能释放锁
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }
}