package chapter5.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-16 Page255
 */
public class Test1 {
    public static void main(String[] args) {
        MyTaskA myTaskA = new MyTaskA();
        Calendar calendar = Calendar.getInstance();
        Date runTime = calendar.getTime();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTaskA, runTime, 3000);
    }
}
