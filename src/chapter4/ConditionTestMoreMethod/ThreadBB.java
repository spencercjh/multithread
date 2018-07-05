package chapter4.ConditionTestMoreMethod;

/**
 * @author spencercjh
 */
public class ThreadBB extends Thread {
    private MyService myService;

    public ThreadBB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodB();
    }
}
