package chapter2.synBlockString;

/**
 * @author spencercjh
 * 图2-29 锁非this对象也能完成同步效果 Page84
 * 图2-30 锁非this对象，如果对象发生了变化就不会有同步的效果，因为有了多个锁
 * 锁非this对象有一定的优点：如果在一个类中有很多个同步方法，这时候虽然能实现同步，
 * 但会受到阻塞，所以影响运行效率；
 * 但如果使用同步代码块锁非this对象，锁非this对象代码块中的程序与同步方法是异步的，
 * 不会与其他锁this对象方法或者同步代码块争抢this锁造成阻塞
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
