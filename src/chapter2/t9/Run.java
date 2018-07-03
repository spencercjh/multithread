package chapter2.t9;

/**
 * @author spencercjh
 * 图2-35 线程AB异步执行产生脏读，出现的原因是两个线程以异步的方式返回了list.size() Page90
 * 图2-36 由于list是单例实例，而且需要同步list.size()，所以就锁list对象 Page91
 */
public class Run {
    public static void main(String[] args) {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        MyThread2 thread2 = new MyThread2(list);
        thread1.setName("A");
        thread2.setName("B");
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("list size=" + list.getSize());
    }
}
