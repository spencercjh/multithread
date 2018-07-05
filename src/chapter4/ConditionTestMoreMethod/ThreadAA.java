package chapter4.ConditionTestMoreMethod;

/**
 * @author spencercjh
 */
public class ThreadAA extends Thread {
    private MyService myService;

    public ThreadAA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodA();
    }
}
