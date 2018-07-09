package chapter5.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-25 当计划时间是过去的时间时，使用scheduleAtFixedRate能过去时间到现在时间的这段时间里的任务给补上，而schedule不会补，这些任务就会被舍弃掉 Page261
 */
public class Test10 {
    public static void main(String[] args) {
        MyTaskC myTaskC = new MyTaskC();
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
        Date runTime = calendarRef.getTime();
        System.out.println("计划执行时间为" + runTime);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTaskC, runTime, 2000);
    }
}
