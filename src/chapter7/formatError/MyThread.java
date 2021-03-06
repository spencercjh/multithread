package chapter7.formatError;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    private SimpleDateFormat simpleDateFormat;
    private String dateString;

    public MyThread(SimpleDateFormat simpleDateFormat, String dateString) {
        this.simpleDateFormat = simpleDateFormat;
        this.dateString = dateString;
    }

    @SuppressWarnings("AlibabaAvoidCallStaticSimpleDateFormat")
    @Override
    public void run() {
        try {
            System.out.println("dateString:" + dateString);
            Date dateRef = simpleDateFormat.parse(dateString);
            String newDateString = simpleDateFormat.format(dateRef.toString());
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName() + "报错了 日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
