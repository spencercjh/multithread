package chapter2.synchronizedMethodLockObject;

/**
 * @author spencercjh
 * 图2-6 两个线程可以一同进入一个方法 Page61
 * 图2-7 对共享方法加上同步锁后，两个线程会排队进入方法，一次执行完毕 Page61
 */
public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
