package chapter3.joinTest1;

/**
 * @author spencercjh
 * 图3-44 线程中Sleep不可能做到控制thread对象执行完毕后顺序执行其他线程的代码 Page180
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("我想当threadTest对象执行完毕后我执行");
        System.out.println("但线程中Sleep多少时间呢？");
        System.out.println("答案是：不确定:)");
    }
}
