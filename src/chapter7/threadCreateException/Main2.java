package chapter7.threadCreateException;

/**
 * @author spencercjh
 * 图7-22 Page298
 */
public class Main2 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.setName("线程1");
        myThread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程：" + myThread1.getName() + "出现了异常");
                e.printStackTrace();
            }
        });
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.setName("线程2");
        myThread2.start();
    }
}
