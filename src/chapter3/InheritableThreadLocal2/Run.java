package chapter3.InheritableThreadLocal2;

/**
 * @author spencercjh
 * 图3-65 可以重写InheritableThreadLocal中的childValue方法去修改子线程继承过去的值 Page199
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            ThreadA threadA = new ThreadA();
            threadA.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
