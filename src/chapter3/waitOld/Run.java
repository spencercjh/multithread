package chapter3.waitOld;

/**
 * @author spencercjh
 * 图3-24 2个减法操作在wait，sleep了1秒后被加法操作全部唤醒，导致了第二个减法操作抛出了溢出异常 Page157
 * 图3-25 改变减法操作代码，使得当list为空时永真执行等待操作，就能够避免删除空队列的第0个元素的异常问题 Page158
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("subtract1Thread");
        threadSubtract1.start();
        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("subtract2Thread");
        threadSubtract2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("addThread");
        threadAdd.start();
    }
}
