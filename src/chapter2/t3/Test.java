package chapter2.t3;

/**
 * @author spencercjh
 * 图2-11 写完成之前读，就出现脏读情况
 * 图2-12 将getValue同步后，setValue和getValue依次执行，不再脏读
 * A线程拿到对象锁后主线程将等待，A线程执行完释放锁后主线程拿到对象锁才能访问
 */
public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            /*setValue需要大于5000ms的时间，如果在setValue过程完成之前就getValue就会出现脏读*/
            Thread.sleep(1000);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
