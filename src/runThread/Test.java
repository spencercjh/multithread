package runThread;

/**
 * @author spencercjh
 * 图1-27 获取线程的名称和id值 Page22
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
