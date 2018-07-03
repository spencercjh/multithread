package chapter2.t9;

/**
 * @author spencercjh
 */
public class MyThread1 extends Thread {
    private MyOneList list;

    public MyThread1(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list, "A");
    }
}
