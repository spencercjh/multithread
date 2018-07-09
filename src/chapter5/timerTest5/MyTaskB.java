package chapter5.timerTest5;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author spencercjh
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("begin time=" + new Date(System.currentTimeMillis()));
            Thread.sleep(5000);
            System.out.println("end time=" + new Date(System.currentTimeMillis()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
