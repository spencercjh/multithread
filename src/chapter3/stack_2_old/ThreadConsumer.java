package chapter3.stack_2_old;

/**
 * @author spencercjh
 */
public class ThreadConsumer extends Thread {
    private Consumer consumer;

    public ThreadConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.popService();
        }
    }
}
