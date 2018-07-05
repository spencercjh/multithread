package chapter3.joinMoreTest;

/**
 * @author spencercjh
 * 图3-53 图3-54 结果证明主线程的main end time输出语句往往是最先执行的 Page190
 */
public class RunFirst {
    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);
        threadA.start();
        threadB.start();
        System.out.println("main end time=" + System.currentTimeMillis());
    }
}
