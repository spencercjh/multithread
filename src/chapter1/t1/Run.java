package chapter1.t1;

/**
 * @author spencercjh
 * 图1-6 运行结果 Page5
 * 多次调用myThread.start();会抛出异常
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.start();
        myThread.start();
        myThread.start();
        myThread.start();
        System.out.println("运行结束！");
    }
}
