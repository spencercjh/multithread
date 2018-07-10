package chapter7.groupInnerStop;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "准备开始死循环了");
        while (!this.isInterrupted()) {

        }
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "结束了");

    }
}
