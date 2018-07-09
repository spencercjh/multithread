package chapter5.TImerCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author spencercjh
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run time=" + new Date(System.currentTimeMillis()));
    }
}
