package chapter5.timerTest2_period;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-8 计划任务在未来执行，且将以period为周期永久执行下去 Page247
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 10);
        Date runTime = calendarRef.getTime();
        System.out.println("计划时间为" + runTime);
        MyTask myTask = new MyTask();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTask, runTime, 4000);
    }
}
