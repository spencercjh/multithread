package chapter5.timerTest4;

import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-15 先延迟delay ms再以period ms为周期执行 Page254
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        MyTask myTask = new MyTask();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTask, 3000, 5000);
    }
}
