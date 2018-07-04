package chapter3.stack_1;

/**
 * @author spencercjh
 * 图3-32 生产者消费者线程交替执行 Page166
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Producer producer = new Producer(myStack);
        Consumer consumer = new Consumer(myStack);
        ThreadProducer threadProducer = new ThreadProducer(producer);
        ThreadConsumer threadConsumer = new ThreadConsumer(consumer);
        threadProducer.start();
        threadConsumer.start();
    }
}
