package runMethonUseStopMethod;

/**
 * @author spencercjh
 * 图1-42 捕获stop抛出的异常
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
