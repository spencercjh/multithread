package chapter5.TimerTaskCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author spencercjh
 */
public class MyTaskA extends TimerTask {

    @Override
    public void run() {
        System.out.println("A run time=" + new Date(System.currentTimeMillis()));
        this.cancel();
        System.out.println("A 任务自己移除自己");
    }
}
