package chapter5.timerTest3;

import java.util.Timer;

/**
 * @author spencercjh
 * 图5-14 timer.schedule(timertask,long) 延时long ms执行计划任务 Page253
 */
public class Run {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTask, 5000);
    }
}
