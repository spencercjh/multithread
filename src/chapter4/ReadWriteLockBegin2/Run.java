package chapter4.ReadWriteLockBegin2;

/**
 * @author spencercjh
 * 图4-39 ReentrantReadWriteLock可以让2个写线程互斥 Page238
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
