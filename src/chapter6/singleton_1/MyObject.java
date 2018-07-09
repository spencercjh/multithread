package chapter6.singleton_1;

/**
 * @author spencercjh
 * 延迟加载-懒汉模式
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        if (myObject != null) {

        } else {
            myObject = new MyObject();
        }
        return myObject;
    }
}
