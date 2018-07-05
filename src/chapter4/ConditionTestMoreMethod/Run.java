package chapter4.ConditionTestMoreMethod;

/**
 * @author spencercjh
 * 图4-4 4个线程同步执行，证明lock.lock()的线程持有对象监视器，效果和synchronized关键字一样 Page204
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");
        threadA.start();
        ThreadAA threadAA = new ThreadAA(myService);
        threadAA.setName("AA");
        threadAA.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");
        threadB.start();
        ThreadBB threadBB = new ThreadBB(myService);
        threadBB.setName("BB");
        threadBB.start();
    }
}
