package chapter2.setNewStringTwoLock;

/**
 * @author spencercjh
 * 图2-66 AB线程共同争抢锁123 Page 117
 */
public class Run2 {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
