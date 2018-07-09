package chapter5.timerTest5;

import java.util.Calendar;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-17 Page255
 */
public class Test2 {
    public static void main(String[] args) {
        MyTaskA myTaskA = new MyTaskA();
        Calendar calendar = Calendar.getInstance();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTaskA, 3000, 4000);
    }
}
