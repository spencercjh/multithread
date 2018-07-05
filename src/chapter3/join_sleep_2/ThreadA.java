package chapter3.join_sleep_2;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try {
            synchronized (threadB) {
                threadB.start();
                threadB.join();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    //noinspection AlibabaAvoidConcurrentCompetitionRandom,ResultOfMethodCallIgnored
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
