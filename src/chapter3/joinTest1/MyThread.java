package chapter3.joinTest1;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            @SuppressWarnings("AlibabaAvoidConcurrentCompetitionRandom")
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
