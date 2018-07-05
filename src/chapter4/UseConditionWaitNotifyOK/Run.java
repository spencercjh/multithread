package chapter4.UseConditionWaitNotifyOK;

/**
 * @author spencercjh
 * 图4-8 实现了等待/通知模式 Page208
 * Object.wait()==Condition.await();
 * Object.wait(long timeout)==Condition.await(long time,TimeUnit unit);
 * Objcet.notify()==Condition.signal();
 * Object.notifyAll()==Condition.signalAll();
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myService.signal();
    }
}
