package chapter3.InheritableThreadLocal;

/**
 * @author spencercjh
 * 图3-64 父子线程从InheritableThreadLocal中取到的值是一样的 Page198
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
