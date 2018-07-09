package chapter5.timerTest5;

import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-21 Page258
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        MyTaskA myTaskA = new MyTaskA();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTaskA, 3000, 4000);
    }
}
