package chapter6.singleton_7;

/**
 * @author spencercjh
 * 这是一种立即加载型的单例模式
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
