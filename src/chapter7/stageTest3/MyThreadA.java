package chapter7.stageTest3;

/**
 * @author spencercjh
 */
public class MyThreadA extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
