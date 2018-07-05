package chapter2.t5;

/**
 * @author spencercjh
 */
public class Task {
    private String getData1;
    private String getData2;

    synchronized public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1 = "长时间处理任务后从远程返回的值 ConditionTestMoreMethod thread name=" + Thread.currentThread().getName();
            getData2 = "长时间处理任务后从远程返回的值 2 thread name=" + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("END TASK");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
