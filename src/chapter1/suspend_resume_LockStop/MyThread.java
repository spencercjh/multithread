package chapter1.suspend_resume_LockStop;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
        }
    }
}
