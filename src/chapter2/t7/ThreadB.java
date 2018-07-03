package chapter2.t7;

/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    private Task task;

    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
