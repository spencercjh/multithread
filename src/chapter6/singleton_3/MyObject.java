package chapter6.singleton_3;

/**
 * @author spencercjh
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject() {

    }

    public static MyObject getInstance() {
        try {
            if (myObject != null) {

            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

