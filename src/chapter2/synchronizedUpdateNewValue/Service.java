package chapter2.synchronizedUpdateNewValue;

/**
 * @author spencercjh
 */
public class Service {
    /*对共享变量加volatile也能达到效果*/
    volatile private boolean isContinueRun = true;

    public void runMethod() {
        String anyString = new String();
        System.out.println("进入了 run method");
        /*如果没有同步代码块，当前线程就看不到其他线程对isContinueRun的更改*/
        while (isContinueRun == true) {
            synchronized (anyString) {
                System.out.println("123");
                if (isContinueRun == false) {
                    System.out.println("将要停下来了！");
                }
            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod() {
        System.out.println("进入了 stop method");
        isContinueRun = false;
    }
}
