package chapter2.StringAndSyn2;

/**
 * @author spencercjh
 */
public class Service {
    public static void print(Object object) {
        try {
            synchronized (object) {
                while (true) {
                    System.out.println(ThreadB.currentThread().getName());
                    ThreadB.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
