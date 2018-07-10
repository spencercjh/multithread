package chapter7.formatOK1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author spencercjh
 */
public class DateTools {
    public static Date parese(String formatPattern, String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date);
    }
}
