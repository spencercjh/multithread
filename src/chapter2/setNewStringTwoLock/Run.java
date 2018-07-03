package chapter2.setNewStringTwoLock;

/**
 * @author spencercjh
 * 图2-65 在线程A执行的过程中锁改变了，2个线程就有2个锁对象，异步执行 Page 116
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
    }
}
