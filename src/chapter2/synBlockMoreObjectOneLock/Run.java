package chapter2.synBlockMoreObjectOneLock;

/**
 * @author spencercjh
 * 图2-47 synchronized(class)和synchronized static作用相同 Page102
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
