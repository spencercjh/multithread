package chapter7.formatOK2;


import java.text.SimpleDateFormat;

/**
 * @author spencercjh
 * 图7-20 解决SimpleDateFormat线程不安全的解决方法是利用ThreadLocal为每个线程都创建一个实例 Page297
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
