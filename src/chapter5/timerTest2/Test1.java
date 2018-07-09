package chapter5.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-5 计划任务的时间在过去的时候，计划任务会随着线程启动立即执行 Page244
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
        Date runTime = calendarRef.getTime();
        System.out.println("计划时间为" + runTime);
        MyTask myTask = new MyTask();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTask, runTime);
    }
}
