package chapter2.synNotExtends;

/**
 * @author spencercjh
 * 图2-18 图2-19 子类共享方法不加同步锁时是异步调用，加了以后是同步调用 Page71
 */
public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
        ThreadA threadA = new ThreadA(sub);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(sub);
        threadB.setName("B");
        threadB.start();
    }
}
