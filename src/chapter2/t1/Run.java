package chapter2.t1;

/**
 * @author spencercjh
 * 图2-1 方法中的变量呈线程安全状态 Page54
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
