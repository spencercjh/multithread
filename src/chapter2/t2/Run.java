package chapter2.t2;

/**
 * @author spencercjh
 * 图2-2 单例模式中的实例变量呈非线程安全状态 Page56
 * 图2-3 多线程访问同一个对象中的同步方法时一定是线程安全的 Page57
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
