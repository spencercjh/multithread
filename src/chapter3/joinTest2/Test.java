package chapter3.joinTest2;

/**
 * @author spencercjh
 * 图3-45 利用join可以对当前线程z进行无限期的阻塞，等待x线程销毁后再执行z后面的代码 Page181
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("thread对象执行完毕后再执行本行代码！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
