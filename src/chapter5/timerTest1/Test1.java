package chapter5.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-3 创建一个timer就是创建一个线程，这个线程不会自己销毁 Page243
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + System.currentTimeMillis());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 10);
        Date runTime = calendarRef.getTime();
        MyTask myTask = new MyTask();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTask, runTime);
    }
}
