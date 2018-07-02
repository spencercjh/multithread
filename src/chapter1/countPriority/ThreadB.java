package chapter1.countPriority;

public class ThreadB extends Thread {
    private long count = 0;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}