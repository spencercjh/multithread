package chapter2.synNotExtends;

public class Sub extends Main {
    @Override
    public synchronized void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin thread name=" +
                    Thread.currentThread().getName() + " time " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end thread name=" +
                    Thread.currentThread().getName() + " time =" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
