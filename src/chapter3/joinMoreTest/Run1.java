package chapter3.joinMoreTest;

/**
 * @author spencercjh
 * 图3-51 正确执行 线程AB都结束后主线程结束 Page189
 * 图3-52 出现join()后面的代码提前运行的错误 Page189
 * 运行情况与书本上的有差异，因为线程的随机性故可以接受
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            ThreadB threadB = new ThreadB();
            ThreadA tHreadA = new ThreadA(threadB);
            tHreadA.start();
            threadB.start();
            threadB.join(2000);
            System.out.println("main end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
