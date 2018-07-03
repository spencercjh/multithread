package chapter2.synchronizedUpdateNewValue;

/**
 * @author spencercjh
 * 图2-85 出现了死循环 数据之间没有可视性 Page131
 * 图2-86 在永真循环中加入同步代码块，使得能看到由同一个锁保护之前所有的修改效果 Page132
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.start();
            Thread.sleep(2000);
            ThreadB threadB = new ThreadB(service);
            threadB.start();
            System.out.println("已经发起停止的命令了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
