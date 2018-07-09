package chapter4.ReadWriteLockBegin3;

/**
 * @author spencercjh
 * 图4-40 ReentrantReadWriteLock可以让2个线程读写互斥 Page239
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
