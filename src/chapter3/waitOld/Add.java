package chapter3.waitOld;


/**
 * @author spencercjh
 */
public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("123");
            lock.notifyAll();
        }
    }
}
