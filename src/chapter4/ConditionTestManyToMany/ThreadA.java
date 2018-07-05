package chapter4.ConditionTestManyToMany;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread{
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for(int i=0;i<Integer.MAX_VALUE;i++){
            myService.set();
        }
    }
}
