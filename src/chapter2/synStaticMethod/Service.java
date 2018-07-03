package chapter2.synStaticMethod;

/**
 * @author spencercjh
 */
public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    "在" + System.currentTimeMillis() + "进入pringA");
            Thread.sleep(3000);
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
}
