package chapter3.p_c_allWait;

/**
 * @author spencercjh
 */
public class Consumer {
    private String lock;

    public Consumer(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while ("".equals(ValueObject.value)) {
                    System.out.println("消费者 " + Thread.currentThread().getName() + " wait了");
                    lock.wait();
                }
                System.out.println("消费者" + Thread.currentThread().getName() + "run了");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
