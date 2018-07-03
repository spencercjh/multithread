package chapter2.t8;

/**
 * @author spencercjh
 */
public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.otherMethod();
    }
}
