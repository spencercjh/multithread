package chapter2.synNotExtends;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private Sub sub;

    public ThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
