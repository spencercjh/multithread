package chapter2.t5;

/**
 * @author spencercjh
 */
public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtil.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtil.endTime2 = System.currentTimeMillis();
    }
}
