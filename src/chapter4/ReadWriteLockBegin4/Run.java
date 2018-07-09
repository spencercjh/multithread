package chapter4.ReadWriteLockBegin4;

/**
 * @author spencercjh
 * 图4-41 ReentrantReadWriteLock可以让2个线程写读互斥 Page240
 * 结论：读写，写读，写写都是互斥的，读读是异步的，非互斥的
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("A");
        threadB.setName("B");
        threadB.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadA.start();
    }
}
