package chapter6.singleton_2_2;

/**
 * @author spencercjh
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject() {

    }

    public static MyObject getInstance() {
        try {
            synchronized (MyObject.class) {
                if (myObject != null) {

                } else {
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

