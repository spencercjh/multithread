package chapter7.threadCreateException;

/**
 * @author spencercjh
 * 图7-23 Page299
 */
public class Main3 {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程：" + t.getName() + "出现异常");
                e.printStackTrace();
            }
        });
        MyThread myThread1 = new MyThread();
        myThread1.setName("线程1");
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.setName("线程2");
        myThread2.start();
    }
}
