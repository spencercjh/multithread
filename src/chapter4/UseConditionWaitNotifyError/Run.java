package chapter4.UseConditionWaitNotifyError;

/**
 * @author spencercjh
 * 图4-5 出现异常 没有对象监视器 Page205
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
    }
}
