package chapter5.timerTest2_period;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author spencercjh
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务执行了，时间为" + new Date(System.currentTimeMillis()));
    }

}
