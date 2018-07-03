package chapter2.setNewPropertiesLockOne;

/**
 * @author spencercjh
 * 图2-69 只要对象不变，对象内部的属性变动不会影响锁 Page118
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            Userinfo userinfo = new Userinfo();
            ThreadA threadA = new ThreadA(service, userinfo);
            threadA.setName("A");
            threadA.start();
            Thread.sleep(50);
            ThreadB threadB = new ThreadB(service, userinfo);
            threadB.setName("B");
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
