package chapter4.z3_ok;

/**
 * @author spencercjh
 */
public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}
