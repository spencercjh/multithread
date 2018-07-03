package chapter2.synLockIn_2;

/**
 * @author spencercjh
 * 图2-14 当存在父子类继承关系时，子类完全可以通过可重入锁调用父类的同步方法
 */
public class Run {
    public static void main(String[] args) {
        Sub sub = new Sub();
        MyThread myThread1 = new MyThread(sub);
        MyThread myThread2 = new MyThread(sub);
        myThread1.start();
        myThread2.start();
    }
}
