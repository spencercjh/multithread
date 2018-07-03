package chapter2.synchronizedMethodLockObject2;

/**
 * @author spencercjh
 * 图2-9 线程B异步调用了非同步方法methodB Page63
 * 图2-10 线程A和B都访问同一个对象的同步方法，同步执行，线程依次拿到对象锁 Page63
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
