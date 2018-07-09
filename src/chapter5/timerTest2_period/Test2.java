package chapter5.timerTest2_period;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-9 计划时间在过去的计划任务会立即启动被以period为周期永久执行下去 Page248
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
        Date runTime = calendarRef.getTime();
        System.out.println("计划时间为" + runTime);
        MyTask myTask = new MyTask();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTask, runTime, 4000);
    }
}
