package chapter1.t8;

/**
 * @author spencercjh
 * 图1-25 Page22
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin=" + System.currentTimeMillis());
        myThread1.run();
        System.out.println("end=" + System.currentTimeMillis());
    }
}
