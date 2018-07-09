package chapter6.singleton_7;

/**
 * @author spencercjh
 */
public class MyObject {
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {

    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }
}
