package chapter3.p_c_allWait_fix;

/**
 * @author spencercjh
 * 修复Page163的假死问题
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        ThreadProducer[] threadProducers = new ThreadProducer[2];
        ThreadConsumer[] threadConsumers = new ThreadConsumer[2];
        for (int i = 0; i < threadConsumers.length; i++) {
            threadProducers[i] = new ThreadProducer(producer);
            threadProducers[i].setName("生产者" + (i + 1));
            threadConsumers[i] = new ThreadConsumer(consumer);
            threadConsumers[i].setName("消费者" + (i + 1));
            threadProducers[i].start();
            threadConsumers[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() + " " + threads[i].getState());
        }
    }
}
