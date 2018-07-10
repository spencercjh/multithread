package chapter7.formatOK2;

import java.text.SimpleDateFormat;

/**
 * @author spencercjh
 */
public class DateTools {
    private static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat simpleDateFormat = null;
        simpleDateFormat = threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat(datePattern);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }
}
