package chapter1.stopThrowLock;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
