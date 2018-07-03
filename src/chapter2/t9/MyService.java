package chapter2.t9;

/**
 * @author spencercjh
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        synchronized (list) {
            if (list.getSize() < 1) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(data);
            }
        }
        return list;
    }
}
