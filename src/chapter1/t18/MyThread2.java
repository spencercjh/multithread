package chapter1.t18;

/**
 * @author spencercjh
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread run priority=" + this.getPriority());
    }
}
