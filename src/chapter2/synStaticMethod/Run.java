package chapter2.synStaticMethod;

/**
 * @author spencercjh
 * 图2-43 线程拿到了对Class类的锁，同步执行 Page97
 */
public class Run {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        threadB.start();
    }
}
