package chapter2.synLockIn_2;

/**
 * @author spencercjh
 */
public class Sub extends Main {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
            System.out.println(Thread.currentThread().getName() + " End");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
