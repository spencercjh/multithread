package chapter5.timerTest2_periodLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-10 计划任务的用时比schedule的period长，但也会顺眼地永久执行下去 Page249
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 10);
        Date runTime = calendarRef.getTime();
        System.out.println("计划时间为" + runTime);
        MyTaskA myTaskA = new MyTaskA();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTaskA, runTime, 3000);
    }
}
