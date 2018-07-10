package chapter7.formatOK1;

import java.text.SimpleDateFormat;

/**
 * @author spencercjh
 * 图7-19 解决SimpleDateFormat线程不安全的解决方法是创建多个实例 Page295
 */
public class Test {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{"2000-01-01", "2000-01-02", "2000-01-03",
                "2000-01-04", "2000-01-05", "2000-01-06",
                "2000-01-07", "2000-01-08", "2000-01-09", "2000-01-10"};
        MyThread[] myThreads = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            myThreads[i] = new MyThread(simpleDateFormat, dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            myThreads[i].start();
        }
    }
}
