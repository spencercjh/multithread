package chapter7.stageTest3;

/**
 * @author spencercjh
 */
public class MyThreadB extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
