package chapter5.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-4 将timer设置为守护进程后，主线程一结束它就跟着销毁了，哪怕是任务都没有执行 Page243
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + System.currentTimeMillis());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 10);
        Date runTime = calendarRef.getTime();
        MyTask myTask = new MyTask();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer(true);
        timer.schedule(myTask, runTime);
    }
}
