package chapter3.joinException;

/**
 * @author spencercjh
 * 图3-46 当join与interrupt相遇就会抛出异常，但线程A依然在正常运行 Page182
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB threadB = new ThreadB();
            threadB.start();
            Thread.sleep(500);
            ThreadC threadC = new ThreadC(threadB);
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
