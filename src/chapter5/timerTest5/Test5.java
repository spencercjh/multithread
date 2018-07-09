package chapter5.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-20 Page257
 */
public class Test5 {
    public static void main(String[] args) {
        MyTaskA myTaskA = new MyTaskA();
        Calendar calendar = Calendar.getInstance();
        Date runTime = calendar.getTime();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTaskA, runTime, 3000);
    }
}
