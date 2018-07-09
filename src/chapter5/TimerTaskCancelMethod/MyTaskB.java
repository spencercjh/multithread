package chapter5.TimerTaskCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author spencercjh
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B run time=" + new Date(System.currentTimeMillis()));
    }
}
