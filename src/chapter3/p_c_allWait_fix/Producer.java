package chapter3.p_c_allWait_fix;

/**
 * @author spencercjh
 */
public class Producer {
    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!"".equals(ValueObject.value)) {
                    System.out.println("生产者" + Thread.currentThread().getName() + "wait了");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + "run了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
