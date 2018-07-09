package chapter5.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-22 Page259
 */
public class Test7 {
    public static void main(String[] args) {
        MyTaskB myTaskB = new MyTaskB();
        Calendar calendar = Calendar.getInstance();
        Date runTime = calendar.getTime();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTaskB, runTime, 2000);
    }
}
