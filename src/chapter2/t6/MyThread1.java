package chapter2.t6;

/**
 * @author spencercjh
 */
public class MyThread1 extends Thread {
    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtil.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtil.endTime1 = System.currentTimeMillis();
    }
}
