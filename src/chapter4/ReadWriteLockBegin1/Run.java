package chapter4.ReadWriteLockBegin1;

/**
 * @author spencercjh
 * 图4-38 ReentrantReadWriteLock可以让2个读线程同时拿到读锁 提高了效率 Page237
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
