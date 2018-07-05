package chapter3.joinMoreTest;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread{
    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try{
            synchronized (threadB){
                System.out.println("begin A thread name=" + Thread.currentThread().getName() +
                        " time =" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end A thread name=" + Thread.currentThread().getName() +
                        " time =" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
