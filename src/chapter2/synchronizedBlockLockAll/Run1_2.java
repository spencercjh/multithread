package chapter2.synchronizedBlockLockAll;

/**
 * @author spencercjh
 * 图2-39 两个线程拿到的对象锁并不是同一个，两个线程异步执行
 * 验证结论：当多个线程同时执行synchronized(x){}同步代码块时呈同步效果
 */
public class Run1_2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();
        ThreadA threadA = new ThreadA(service, myObject1);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service, myObject2);
        threadB.setName("B");
        threadB.start();
    }
}
