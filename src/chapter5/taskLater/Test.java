package chapter5.taskLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-7 计划任务A执行完的时候已经过了B计划任务的预定时间，这个时候B顺延A立即执行 Page246
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef1 = Calendar.getInstance();
        Date runTime1 = calendarRef1.getTime();
        System.out.println("A 计划时间为" + runTime1);
        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND, 10);
        Date runTime2 = calendarRef2.getTime();
        System.out.println("B 计划时间为" + runTime2);
        MyTaskA myTask1 = new MyTaskA();
        MyTaskB myTask2 = new MyTaskB();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTask1, runTime1);
        timer.schedule(myTask2, runTime2);
    }
}
