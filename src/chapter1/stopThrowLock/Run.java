package chapter1.stopThrowLock;

/**
 * @author spencercjh
 * 图1-43 强制stop造成数据不一致 Page35
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread myThread = new MyThread(object);
            myThread.start();
            Thread.sleep(100);
            myThread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
