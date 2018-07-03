package chapter2.test3;


/**
 * @author spencercjh
 * 图2-42 验证了 当其他线程执行x对象方法里面的synchronized(this)代码块时也呈现同步效果 Page95
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
