package chapter2.t8;

/**
 * @author spencercjh
 */
public class MyThread1 extends Thread {
    private Task task;

    public MyThread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
