package chapter7.autoAddGroup;

/**
 * @author spencercjh
 * 图7-12 Page288
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("A处线程：" + Thread.currentThread().getName() +
                "所属的线程名为" + Thread.currentThread().getThreadGroup().getName() +
                "，其中有的线程数量" + Thread.currentThread().getThreadGroup().activeCount());
        ThreadGroup group = new ThreadGroup("新的组");
        System.out.println("B处线程：" + Thread.currentThread().getName() +
                "所属的线程名为" + Thread.currentThread().getThreadGroup().getName() +
                "，其中有的线程数量" + Thread.currentThread().getThreadGroup().activeCount());
        ThreadGroup[] threadGroups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroups);
        for (int i = 0; i < threadGroups.length; i++) {
            System.out.println("第" + (i + 1) + "个线程组名称为" + threadGroups[i].getName());
        }
    }
}
