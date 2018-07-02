package chapter1.t7;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
