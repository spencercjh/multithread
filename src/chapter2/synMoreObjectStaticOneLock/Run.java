package chapter2.synMoreObjectStaticOneLock;

/**
 * @author spencercjh
 * 图2-45 虽然是不同的对象，但静态的同步方法仍然同步执行 Page100
 */
public class Run {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA threadA = new ThreadA(service1);
        ThreadB threadB = new ThreadB(service2);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
