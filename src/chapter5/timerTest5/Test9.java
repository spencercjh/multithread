package chapter5.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-24 Page260
 */
public class Test9 {
    public static void main(String[] args) {
        MyTaskC myTaskC = new MyTaskC();
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
        Date runTime = calendarRef.getTime();
        System.out.println("计划执行时间为" + runTime);
        Timer timer = new Timer();
        timer.schedule(myTaskC, runTime, 2000);
    }
}
