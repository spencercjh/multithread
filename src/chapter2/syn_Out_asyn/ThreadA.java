package chapter2.syn_Out_asyn;

/**
 * @author spencercjh
 */
public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadA" + (i + 1));
        }
    }
}
