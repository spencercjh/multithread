package chapter5.TimerCancelError;

import java.util.TimerTask;

/**
 * @author spencercjh
 */
public class MyTaskA extends TimerTask {
    public MyTaskA(int i) {
        this.i = i;
    }

    private int i;

    @Override
    public void run() {
        System.out.println("第" + i + "次没有被cancel取消");
    }
}
