package chapter3.joinException;

/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA threadA = new ThreadA();
            threadA.start();
            threadA.join();
            System.out.println("线程B在run end处打印了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("线程B捕获异常");
        }
    }
}
