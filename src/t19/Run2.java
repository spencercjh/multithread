package t19;

/**
 * @author spencercjh
 * 图1-56 高优先级的线程总是先被执行完的，与代码的执行顺序无关
 */
public class Run2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(1);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
