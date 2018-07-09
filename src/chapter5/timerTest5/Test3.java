package chapter5.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-18 Page256
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendar = Calendar.getInstance();
        Date runTime = calendar.getTime();
        MyTaskB myTaskB = new MyTaskB();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTaskB, runTime, 2000);
    }
}
