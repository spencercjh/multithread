package chapter3.InheritableThreadLocal;

/**
 * @author spencercjh
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }
}
