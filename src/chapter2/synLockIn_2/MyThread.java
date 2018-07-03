package chapter2.synLockIn_2;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    public Sub sub;

    public MyThread() {

    }

    public MyThread(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.operateISubMethod();
    }
}
