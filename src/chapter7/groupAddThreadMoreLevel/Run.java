package chapter7.groupAddThreadMoreLevel;

/**
 * @author spencercjh
 * 图7
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup, "A");
        Runnable runnable = () -> {
            try {
                System.out.println("run method");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread newThread = new Thread(group, runnable);
        newThread.setName("Z");
        newThread.start();
        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);
        System.out.println("main线程中有" + listGroup.length + "个子线程组，名字为" + listGroup[0].getName());
        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println("在这个线程组中有" + listThread.length + "个线程名为" + listThread[0].getName());
    }
}
