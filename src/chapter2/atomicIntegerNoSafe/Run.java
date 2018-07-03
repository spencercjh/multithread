package chapter2.atomicIntegerNoSafe;

/**
 * @author spencercjh
 * 图2-83 结果正确但是顺序是错误的 Page129
 * 因为addAndGet是原子的，但是方法与方法之间的调用却不是原子的，需要使用同步锁
 * 图2-84 运行正确结果
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            MyThread[] myThreads = new MyThread[10];
            for (int i = 0; i < myThreads.length; i++) {
                myThreads[i] = new MyThread(myService);
            }
            for (MyThread myThread : myThreads) {
                myThread.start();
            }
            Thread.sleep(1000);
            System.out.println(myService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
