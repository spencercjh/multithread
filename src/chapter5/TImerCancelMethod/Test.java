package chapter5.TImerCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-12 timer.cancel会把任务队列里的任务全部移除并销毁线程 Page251
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("当前时间为" + new Date(System.currentTimeMillis()));
        Calendar calendarRef = Calendar.getInstance();
        Date runTime1 = calendarRef.getTime();
        System.out.println("计划时间为" + runTime1);
        MyTaskA myTaskA = new MyTaskA();
        MyTaskB myTaskB = new MyTaskB();
        @SuppressWarnings("AlibabaAvoidUseTimer")
        Timer timer = new Timer();
        timer.schedule(myTaskA, runTime1, 2000);
        timer.schedule(myTaskB, runTime1, 2000);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
    }
}
