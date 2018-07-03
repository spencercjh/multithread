package chapter2.twoStop;

/**
 * @author spencercjh
 * 图2-55 methodA 死循环了，线程B永远得不到运行的机会
 */
public class Run2 {
    public static void main(String[] args) {
        Service2 service = new Service2();
        ThreadA2 threadA = new ThreadA2(service);
        threadA.start();
        ThreadB2 threadB = new ThreadB2(service);
        threadB.start();
    }
}
