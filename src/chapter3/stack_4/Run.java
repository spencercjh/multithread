package chapter3.stack_4;

/**
 * @author spencercjh
 * 图3-36 多生产者多消费者，正常执行 Page171
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
        Consumer consumer2 = new Consumer(myStack);
        Consumer consumer3 = new Consumer(myStack);
        Consumer consumer4 = new Consumer(myStack);
        Consumer consumer5 = new Consumer(myStack);
        Consumer consumer6 = new Consumer(myStack);
        Consumer consumer7 = new Consumer(myStack);
        Consumer consumer8 = new Consumer(myStack);
        ThreadConsumer threadConsumer1 = new ThreadConsumer(consumer1);
        ThreadConsumer threadConsumer2 = new ThreadConsumer(consumer2);
        ThreadConsumer threadConsumer3 = new ThreadConsumer(consumer3);
        ThreadConsumer threadConsumer4 = new ThreadConsumer(consumer4);
        ThreadConsumer threadConsumer5 = new ThreadConsumer(consumer5);
        ThreadConsumer threadConsumer6 = new ThreadConsumer(consumer6);
        ThreadConsumer threadConsumer7 = new ThreadConsumer(consumer7);
        ThreadConsumer threadConsumer8 = new ThreadConsumer(consumer8);
        ThreadProducer threadProducer1 = new ThreadProducer(producer1);
        ThreadProducer threadProducer2 = new ThreadProducer(producer2);
        ThreadProducer threadProducer3 = new ThreadProducer(producer3);
        ThreadProducer threadProducer4 = new ThreadProducer(producer4);
        ThreadProducer threadProducer5 = new ThreadProducer(producer5);
        ThreadProducer threadProducer6 = new ThreadProducer(producer6);
        threadProducer1.start();
        threadProducer2.start();
        threadProducer3.start();
        threadProducer4.start();
        threadProducer5.start();
        threadProducer6.start();
        threadConsumer1.start();
        threadConsumer2.start();
        threadConsumer3.start();
        threadConsumer4.start();
        threadConsumer5.start();
        threadConsumer6.start();
        threadConsumer7.start();
        threadConsumer8.start();
    }
}
