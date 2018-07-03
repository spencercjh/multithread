package chapter2.synTwoLock;

/**
 * @author spencercjh
 */
public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    "在" + System.currentTimeMillis() + "进入pringA");
            Thread.sleep(2000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    "在" + System.currentTimeMillis() + "离开pringA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                "在" + System.currentTimeMillis() + "进入pringB");
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                "在" + System.currentTimeMillis() + "离开pringB");
    }

    synchronized public void printC() {
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                "在" + System.currentTimeMillis() + "进入pringC");
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                "在" + System.currentTimeMillis() + "离开pringC");
    }
}
