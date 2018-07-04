package chapter3.test1;

/**
 * @author spencercjh
 * 图3-3 抛出异常，没有对象监视器 Page137
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = "";
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
