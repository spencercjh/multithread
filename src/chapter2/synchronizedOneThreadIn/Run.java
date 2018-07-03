package chapter2.synchronizedOneThreadIn;

/**
 * @author spencercjh
 * 图2-21 同步调用 时间累加 并没有提高效率 Page75
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
