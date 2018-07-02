package chapter1.t20;

import java.util.Random;

/**
 * @author spencercjh
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("### thread 1 use time=" + String.valueOf(endTime - beginTime));
    }
}
