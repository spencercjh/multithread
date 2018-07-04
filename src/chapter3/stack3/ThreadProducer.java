package chapter3.stack3;

/**
 * @author spencercjh
 */
public class ThreadProducer extends Thread {
    private Producer producer;

    public ThreadProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.pushService();
        }
    }
}
