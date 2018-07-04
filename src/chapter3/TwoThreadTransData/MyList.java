package chapter3.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spencercjh
 */
public class MyList {
    private List list = new ArrayList();

    public void add() {
        list.add("123");
    }

    public int size() {
        return list.size();
    }
}
