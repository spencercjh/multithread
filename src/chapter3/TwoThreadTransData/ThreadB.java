package chapter3.TwoThreadTransData;

/**
 * @author spencercjh
 */
public class ThreadB extends Thread {
    private MyList myList;

    public ThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            /*不执行这行输出语句的话两个线程不能正确通信！*/
            while (true) {
                System.out.println(Thread.currentThread().getName() + " SIZE:" + myList.size());
                if (myList.size() == 5) {
                    System.out.println("==5了，线程B要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("捕获异常！");
            e.printStackTrace();
        }
    }
}
