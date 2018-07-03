package chapter2.synTwoLock;

/**
 * @author spencercjh
 * 图2-44 printC并不是静态方法，线程C拿到的是对象锁，其他线程拿到的是Class类锁
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
        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");
        threadC.start();
    }
}
