package chapter7.threadGroup_1;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup threadGroup, String name, String num) {
        super(threadGroup, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while (true) {
            System.out.println("死循环中" + Thread.currentThread().getName());
        }
    }
}
