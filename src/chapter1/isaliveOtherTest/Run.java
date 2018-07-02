package chapter1.isaliveOtherTest;


/**
 * @author spencercjh
 * 程序运行结果如下 Page20
 */
public class Run {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        CountOperate countOperate = new CountOperate();
        Thread t1 = new Thread(countOperate);
        System.out.println("main begin chapter1.t1 isAlive=" + t1.isAlive() + "     countOperate isAlive==  " + countOperate.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end chapter1.t1 isAlive=" + t1.isAlive());
    }
}
