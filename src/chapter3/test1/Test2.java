package chapter3.test1;

/**
 * @author spencercjh
 * 图3-4 wait后面的方法不会执行 Page138
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("synchronized 上面");
            synchronized (lock) {
                System.out.println("synchronized 第一行");
                lock.wait();
                System.out.println("wait 下的代码");
            }
            System.out.println("synchronized 下面的代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
