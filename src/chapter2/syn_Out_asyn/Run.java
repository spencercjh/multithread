package chapter2.syn_Out_asyn;

/**
 * @author spencercjh
 * 图2-34 同步块中的代码同步执行，但两个线程之间是异步执行的，就会出现脏读问题 Page88
 */
public class Run {
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA threadA = new ThreadA(list);
        ThreadB threadB = new ThreadB(list);
        threadA.setName("A");
        threadA.start();
        threadB.setName("B");
        threadB.start();
    }
}
