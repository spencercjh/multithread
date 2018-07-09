package chapter5.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-6 1个timer可以运行多个timetask任务 Page245
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef1 = Calendar.getInstance();
        calendarRef1.add(Calendar.SECOND, 10);
        Date runTime1 = calendarRef1.getTime();
        System.out.println("计划时间1为" + runTime1);
        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND, 15);
        Date runTime2 = calendarRef2.getTime();
        System.out.println("计划时间2为" + runTime2);
        MyTask myTask1 = new MyTask();
        MyTask myTask2 = new MyTask();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTask1, runTime1);
        timer.schedule(myTask2, runTime2);

    }
}
