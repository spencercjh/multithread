package chapter2.t5;

/**
 * @author spencercjh
 * 图2-20 简单的代码却耗时严重 6s=3s+3s Page74
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        MyThread2 thread2 = new MyThread2(task);
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtil.beginTime1;
        if (CommonUtil.beginTime2 < CommonUtil.beginTime1) {
            beginTime = CommonUtil.beginTime2;
        }
        long endTime = CommonUtil.endTime1;
        if (CommonUtil.endTime2 > CommonUtil.endTime1) {
            endTime = CommonUtil.endTime2;
        }
        System.out.println("耗时" + String.valueOf(endTime - beginTime));
    }
}
