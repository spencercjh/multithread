package chapter4.z3_ok;

/**
 * @author spencercjh
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA myThreadA = new MyThreadA(myService);
        myThreadA.start();
    }
}
