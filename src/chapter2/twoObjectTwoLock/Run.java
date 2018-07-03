package chapter2.twoObjectTwoLock;

/**
 * @author spencercjh
 * 图2-5 多个线程访问多个对象，对每个对象都创建了一个锁，同步的方法执行效果也是异步的了 Page58
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
    }
}
