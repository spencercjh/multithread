package chapter7.threadRunSyn;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    private Object lock;
    private String showChar;
    private int shouNumPosition;
    private int printCount = 0;
    volatile private static int addNumber = 1;

    public MyThread(Object lock, String showChar, int shouNumPosition) {
        this.lock = lock;
        this.showChar = showChar;
        this.shouNumPosition = shouNumPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true) {
                    if (addNumber % 3 == shouNumPosition) {
                        System.out.println("ThreadName=" + Thread.currentThread().getName() + " runCount=" + addNumber + " " + showChar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        if (printCount == 3) {
                            break;
                        }
                    } else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
