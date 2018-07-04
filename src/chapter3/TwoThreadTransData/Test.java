package chapter3.TwoThreadTransData;

/**
 * @author spencercjh
 * 图3-1 两个线程互相通信，B线程使用永真循环进行轮询检测条件 Page135
 */
public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA threadA = new ThreadA(myList);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(myList);
        threadB.setName("B");
        threadB.start();
    }
}
