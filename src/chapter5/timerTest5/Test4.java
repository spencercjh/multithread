package chapter5.timerTest5;

import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-19 Page257
 */
public class Test4 {
    public static void main(String[] args) {
        MyTaskB myTaskB = new MyTaskB();
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTaskB, 3000, 2000);
    }
}
