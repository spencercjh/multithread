package chapter4.ConditionTest;

/**
 * @author spencercjh
 * 图4-14 AB线程交替执行 Page214
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        ThreadB threadB = new ThreadB(myService);
        threadB.start();
    }
}
