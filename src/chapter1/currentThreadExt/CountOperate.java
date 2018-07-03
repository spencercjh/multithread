package chapter1.currentThreadExt;

/**
 * @author spencercjh
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("ThreadB.currentThread().getName()= " + Thread.currentThread().getName());
        System.out.println("This.getName()= " + this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("ThreadB.currentThread().getName()= " + Thread.currentThread().getName());
        System.out.println("This.getName()= " + this.getName());
        System.out.println("run---end");
    }
}
