package t13;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000000; i++) {
            if (interrupted()) {
                System.out.println("已经是停止状态了，我要退出了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
