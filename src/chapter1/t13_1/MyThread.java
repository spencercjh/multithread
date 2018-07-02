package chapter1.t13_1;

/**
 * @author spencercjh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 5000000; i++) {
                if (isInterrupted()) {
                    System.out.println("已经是停止状态了，我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("进入了MyThread类run中的catch！");
            e.printStackTrace();
        }
    }
}
