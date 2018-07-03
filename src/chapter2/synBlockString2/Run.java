package chapter2.synBlockString2;

/**
 * @author spencercjh
 * 图2-32 锁非this对象同步块与类中其他同步方法是异步的
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
