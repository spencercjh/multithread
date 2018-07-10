package chapter6.singleton_8;

/**
 * @author spencercjh
 * 这是一种立即加载型单例模式
 * 图6-11 在MyObject中使用static代码块，在static代码块中新建对象，保证单例性 Page275
 */
public class MyObject {
    private static MyObject myObject = null;

    private MyObject() {
    }

    static {
        System.out.println("静态代码块");
        myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return myObject;
    }
}
