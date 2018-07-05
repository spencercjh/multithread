package chapter3.ThreadLocal33;

import java.util.Date;

/**
 * @author spencercjh
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }
}
