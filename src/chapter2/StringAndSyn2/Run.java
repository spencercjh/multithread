package chapter2.StringAndSyn2;

/**
 * @author spencercjh
 * 图2-52 CPU交替执行线程A和B，说明存在着2个锁
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("A");
        threadA.start();
        threadB.setName("B");
        threadB.start();
    }
}
