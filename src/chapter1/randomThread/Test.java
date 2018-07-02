package chapter1.randomThread;

/**
 * @author spencercjh
 * 图1-7 随机被执行的线程 Page6
 */
public class Test {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
