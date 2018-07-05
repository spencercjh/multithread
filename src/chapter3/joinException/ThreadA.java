package chapter3.joinException;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    @SuppressWarnings({"AlibabaAvoidConcurrentCompetitionRandom", "ResultOfMethodCallIgnored"})
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
