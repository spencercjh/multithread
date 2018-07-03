package chapter2.synchronizedBlockLockAll;

/**
 * @author spencercjh
 * 图2-38 使用了同一个对象监视器 myObject 两个线程是同步执行的 Page92
 * 验证结论：当多个线程同时执行synchronized(x){}同步代码块时呈同步效果
 */
public class Run1_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(service, myObject);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service, myObject);
        threadB.setName("B");
        threadB.start();
    }
}
