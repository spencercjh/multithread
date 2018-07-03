package chapter2.throwExceptionNoLock;

/**
 * @author spencercjh
 * 图2-16 线程中出现异常就会释放已有的锁
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.setName("a");
            threadA.start();
            Thread.sleep(500);
            ThreadB threadB = new ThreadB(service);
            threadB.setName("b");
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
