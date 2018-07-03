package chapter2.doubleSynBlockOneTwo;

/**
 * @author spencercjh
 * 图2-26 同一个对象的两个同步块被两个线程同步执行 Page80
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
