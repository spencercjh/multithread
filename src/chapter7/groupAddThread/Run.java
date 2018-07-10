package chapter7.groupAddThread;

/**
 * @author spencercjh
 * 图7-10 Page286
 */
public class Run {
    public static void main(String[] args) {
        ThreadA runnableA = new ThreadA();
        ThreadB runnableB = new ThreadB();
        ThreadGroup threadGroup = new ThreadGroup("线程组");
        Thread threadA = new Thread(threadGroup, runnableA);
        Thread threadB = new Thread(threadGroup, runnableB);
        threadA.start();
        threadB.start();
        System.out.println("活动的线程数为：" + threadGroup.activeCount());
        System.out.println("线程组的名称为：" + threadGroup.getName());
    }
}
