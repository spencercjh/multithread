package t4_threadsafe;

/**
 * @author spencercjh
 * 图1-17 非线程安全
 */
public class Run {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        aLogin.start();
        BLogin bLogin = new BLogin();
        bLogin.start();
    }
}
