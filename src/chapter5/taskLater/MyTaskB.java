package chapter5.taskLater;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask {

    @Override
    public void run() {
        System.out.println("B begin time=" + new Date(System.currentTimeMillis()));
        System.out.println("B end time=" + new Date(System.currentTimeMillis()));
    }

}
