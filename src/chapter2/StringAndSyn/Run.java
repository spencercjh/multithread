package chapter2.StringAndSyn;

/**
 * @author spencercjh
 * 图2-50 出现了死循环，A线程始终占有锁 Page103
 * 因为A和B线程拥有一模一样的锁，字符串”AA“
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
