package chapter5.timerTest5;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author spencercjh
 */
public class MyTaskC extends TimerTask {
    @Override
    public void run() {
        System.out.println("begin time=" + new Date(System.currentTimeMillis()));
        System.out.println("end time=" + new Date(System.currentTimeMillis()));
    }
}
