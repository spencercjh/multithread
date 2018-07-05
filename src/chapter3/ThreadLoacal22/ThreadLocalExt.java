package chapter3.ThreadLoacal22;

/**
 * @author spencercjh
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值，第一次get不再为null";
    }
}
