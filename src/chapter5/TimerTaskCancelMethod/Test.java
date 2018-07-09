package chapter5.TimerTaskCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-11 timertask.cancel会把任务自己从任务队列里移除 Page250
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef = Calendar.getInstance();
        Date runTime = calendarRef.getTime();
        System.out.println("计划时间为" + runTime);
        MyTaskA myTaskA = new MyTaskA();
        MyTaskB myTaskB = new MyTaskB();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTaskA, runTime, 4000);
        timer.schedule(myTaskB, runTime, 4000);
    }
}
