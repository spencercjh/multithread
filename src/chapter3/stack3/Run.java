package chapter3.stack3;

/**
 * @author spencercjh
 * 图3-35 多生产者1消费者，正常执行 Page170
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Producer producer1 = new Producer(myStack);
        Producer producer2 = new Producer(myStack);
        Producer producer3 = new Producer(myStack);
        Producer producer4 = new Producer(myStack);
        Producer producer5 = new Producer(myStack);
        Producer producer6 = new Producer(myStack);
        Consumer consumer1 = new Consumer(myStack);
        ThreadProducer threadProducer1 = new ThreadProducer(producer1);
        ThreadProducer threadProducer2 = new ThreadProducer(producer2);
        ThreadProducer threadProducer3 = new ThreadProducer(producer3);
        ThreadProducer threadProducer4 = new ThreadProducer(producer4);
        ThreadProducer threadProducer5 = new ThreadProducer(producer5);
        ThreadProducer threadProducer6 = new ThreadProducer(producer6);
        ThreadConsumer threadConsumer1 = new ThreadConsumer(consumer1);
        threadProducer1.start();
        threadProducer2.start();
        threadProducer3.start();
        threadProducer4.start();
        threadProducer5.start();
        threadProducer6.start();
        threadConsumer1.start();
    }
}
