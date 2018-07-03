package chapter2.syn_Out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spencercjh
 */
public class MyList {
    private List list = new ArrayList();

    synchronized public void add(String username) {
        System.out.println("Thread name=" + Thread.currentThread().getName() + " 执行了add方法！");
        list.add(username);
        System.out.println("Thread name=" + Thread.currentThread().getName() + " 退出了add方法！");
    }

    synchronized public int getSize() {
        System.out.println("Thread Name=" + Thread.currentThread().getName() + " 执行了getSize方法！");
        int sizeValue = list.size();
        System.out.println("Thread Name=" + Thread.currentThread().getName() + " 退出了getSize方法！");
        return sizeValue;
    }
}
