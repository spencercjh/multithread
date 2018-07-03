package chapter2.t99;

/**
 * @author spencercjh
 * 图2-70 主线程一直在执行while循环导致不能停止 Page119
 */
public class Run {
    public static void main(String[] args) {
        PringString pringString = new PringString();
        pringString.printStringMethod();
        System.out.println("我要停止它！ stop thread=" + Thread.currentThread().getName());
        pringString.setContinuePrint(false);
    }
}
