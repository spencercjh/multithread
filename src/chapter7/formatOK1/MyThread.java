package chapter7.formatOK1;

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

    @Override
    public void run() {
        Date dateRef = null;
        try {
            dateRef = DateTools.parese("yyyy-MM-dd", dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String newDateString = DateTools.format("yyyy-MM-dd", dateRef);
        if (!newDateString.equals(dateString)) {
            System.out.println("ThreadName=" + this.getName() + " 报错了 日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
        }
    }
}
