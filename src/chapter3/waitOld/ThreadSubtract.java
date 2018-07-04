package chapter3.waitOld;

/**
 * @author spencercjh
 */
public class ThreadSubtract extends Thread {
    private Subtract subtract;

    public ThreadSubtract(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
