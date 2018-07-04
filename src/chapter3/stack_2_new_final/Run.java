package chapter3.stack_2_new_final;

/**
 * @author spencercjh
 * 1生产者多消费者，正常执行 Page169
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Producer producer = new Producer(myStack);
        Consumer consumer1 = new Consumer(myStack);
        Consumer consumer2 = new Consumer(myStack);
        Consumer consumer3 = new Consumer(myStack);
        Consumer consumer4 = new Consumer(myStack);
        Consumer consumer5 = new Consumer(myStack);
        ThreadProducer threadProducer = new ThreadProducer(producer);
        ThreadConsumer threadConsumer1 = new ThreadConsumer(consumer1);
        ThreadConsumer threadConsumer2 = new ThreadConsumer(consumer2);
        ThreadConsumer threadConsumer3 = new ThreadConsumer(consumer3);
        ThreadConsumer threadConsumer4 = new ThreadConsumer(consumer4);
        ThreadConsumer threadConsumer5 = new ThreadConsumer(consumer5);
        threadProducer.start();
        threadConsumer1.start();
        threadConsumer2.start();
        threadConsumer3.start();
        threadConsumer4.start();
        threadConsumer5.start();
    }
}
