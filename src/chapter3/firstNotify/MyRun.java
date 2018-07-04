package chapter3.firstNotify;

/**
 * @author spencercjh
 * 图3-19 正常运行 Page153
 * 图3-20 notify线程比wait线程先执行完，wait将永远不会被唤醒 Page153
 * 图3-21 加入判断条件，如果notify线程先执行就不执行wait线程了 Page154
 * 图3-22 顺序正确后结果也会正确 Page155
 */
public class MyRun {
    private String lock = new String("");
    private boolean isFirstRunB = false;
    private Runnable runnableA = () -> {
        try {
            synchronized (lock) {
                while (isFirstRunB == false) {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };
    private Runnable runnableB = () -> {
        synchronized (lock) {
            System.out.println("begin notify");
            lock.notify();
            System.out.println("end notify");
            isFirstRunB = true;
        }
    };

    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        /*Thread threadA = new Thread(myRun.runnableA);
        threadA.start();
        Thread threadB = new Thread(myRun.runnableB);
        threadB.start();*/
        Thread threadB = new Thread(myRun.runnableB);
        threadB.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadA = new Thread(myRun.runnableA);
        threadA.start();
    }


}
