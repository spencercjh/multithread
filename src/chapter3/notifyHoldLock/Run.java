package chapter3.notifyHoldLock;

/**
 * @author spencercjh
 * 图3-11 必须执行完notify方法所在的同步代码块后才会释放锁
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
        synNotifyMethodThread.start();
    }
}
