package chapter4.awaitUntilTest;

/**
 * @author spencercjh
 * 图4-34 Page233
 */
public class Run1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
    }
}
