package chapter3.p_c_test;

/**
 * @author spencercjh
 * 图3-27 一个生产者和一个消费者，交替运行，没有问题 Page160
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        ThreadProducer threadProducer = new ThreadProducer(producer);
        ThreadConsumer threadConsumer = new ThreadConsumer(consumer);
        threadProducer.start();
        threadConsumer.start();
    }
}
