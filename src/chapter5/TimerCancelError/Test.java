package chapter5.TimerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author spencercjh
 * 图5-13 和书上出现的情况不同，在我的电脑上MyTaskA就没有成功执行过，始终在主线程中创建对象并没有到计划任务中去 Page252
 */
public class Test {
    public static void main(String[] args) {
        int i = 0;
        Calendar calendarRef1 = Calendar.getInstance();
        Date runTime = calendarRef1.getTime();
        while (true) {
            i++;
            System.out.println(i);
            @SuppressWarnings("AlibabaAvoidUseTimer")
            Timer timer = new Timer();
            MyTaskA myTask = new MyTaskA(i);
            timer.schedule(myTask, runTime);
            timer.cancel();
        }
    }
}
