package chapter2.synBlockMoreObjectOneLock;

/**
 * @author spencercjh
 */
public class Service {
    public static void printA() {
        synchronized (Service.class) {
            try {
                System.out.println("线程名称为：" + Thread.currentThread().getName() +
                        "在" + System.currentTimeMillis() + "进入pringA");
                Thread.sleep(1000);
                System.out.println("线程名称为：" + Thread.currentThread().getName() +
                        "在" + System.currentTimeMillis() + "离开pringA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB() {
        synchronized (Service.class) {
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    "在" + System.currentTimeMillis() + "进入pringB");
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    "在" + System.currentTimeMillis() + "离开pringB");
        }
    }
}
