package chapter2.test2;

/**
 * @author spencercjh
 * 图2-41 验证了 当其他线程执行x对象中synchronized同步方法时呈同步效果 Page95
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(service, myObject);
        threadA.setName("A");
        threadA.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadB.start();
    }
}
