package chapter5.timerTest5;

import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-23 Page259
 */
public class Test8 {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        MyTaskB myTaskB = new MyTaskB();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTaskB, 3000, 2000);
    }
}
