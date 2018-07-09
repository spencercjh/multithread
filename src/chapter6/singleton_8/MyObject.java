package chapter6.singleton_8;

/**
 * @author spencercjh
 */
public class MyObject {
    private static MyObject myObject = null;

    private MyObject() {
    }

    static {
        myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return myObject;
    }
}
