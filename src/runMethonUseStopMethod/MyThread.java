package runMethonUseStopMethod;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            stop();
        } catch (ThreadDeath e) {
            System.out.println("线程捕获异常");
            e.printStackTrace();
        }
    }
}
