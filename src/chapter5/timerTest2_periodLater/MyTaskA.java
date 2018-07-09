package chapter5.timerTest2_periodLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author spencercjh
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("A begin time=" + new Date(System.currentTimeMillis()));
            Thread.sleep(5000);
            System.out.println("A end time=" + new Date(System.currentTimeMillis()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
