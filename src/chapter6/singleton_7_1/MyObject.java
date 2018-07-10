package chapter6.singleton_7_1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author spencercjh
 * 这是一种立即加载型单例模式
 */
public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;

    private static class MyObjectHandler {
        private static final MyObject myObject = new MyObject();
    }

    private MyObject() {

    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MyObjectHandler.myObject;
    }
}
