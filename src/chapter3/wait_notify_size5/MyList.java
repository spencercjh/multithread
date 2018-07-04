package chapter3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spencercjh
 */
public class MyList {
    private static List list = new ArrayList();

    public static void add() {
        list.add("123");
    }

    public static int size() {
        return list.size();
    }
}
