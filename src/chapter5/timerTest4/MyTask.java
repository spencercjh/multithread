package chapter5.timerTest4;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("运行了，时间为" + new Date(System.currentTimeMillis()));
    }
}
