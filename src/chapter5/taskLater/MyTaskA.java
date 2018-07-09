package chapter5.taskLater;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {

    @Override
    public void run() {
        try {
            System.out.println("A begin time=" + new Date(System.currentTimeMillis()));
            Thread.sleep(20000);
            System.out.println("A end time=" + new Date(System.currentTimeMillis()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
