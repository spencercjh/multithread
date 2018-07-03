package chapter2.twoStop;

/**
 * @author spencercjh
 * 图2-55 methodA 死循环了，线程B永远得不到运行的机会
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
