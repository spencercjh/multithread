package chapter4.ConditionTestManyToMany;

/**
 * @author spencercjh
 * 图4-15 假死 Page214
 * 图4-16 signal改为signalAll，condition分AB后，实现交替输出 Page217
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA[] threadAS = new ThreadA[10];
        ThreadB[] threadBS = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadAS[i] = new ThreadA(myService);
            threadBS[i] = new ThreadB(myService);
            threadAS[i].start();
            threadBS[i].start();
        }
    }
}
