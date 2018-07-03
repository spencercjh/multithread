package chapter2.t7;

/**
 * @author spencercjh
 * 图2-24 2-25 不在同步快中就是异步执行没在同步快中就是同步执行 Page78
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        ThreadB threadB = new ThreadB(task);
        threadA.start();
        threadB.start();
    }
}
