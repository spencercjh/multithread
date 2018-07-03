package chapter2.t9;

/**
 * @author spencercjh
 */
public class MyThread2 extends Thread {
    private MyOneList list;

    public MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list, "B");
    }
}
