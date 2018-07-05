package chapter3.ThreadLoacal22;

/**
 * @author spencercjh
 * 图3-62 重写ThreadLocal的初始化方法，让threadlocal有默认值 Page195
 */
public class Run {
    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
