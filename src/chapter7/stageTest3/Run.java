package chapter7.stageTest3;

/**
 * @author spencercjh
 * 图7-6 书上原来的代码在我的电脑上并跑不出BLOCKED状态，所以我做了一些修改 Page284
 */
public class Run {
    public static void main(String[] args) {
        MyThreadA[] myThreadAs = new MyThreadA[5];
        for (int i = 0; i < 5; i++) {
            myThreadAs[i] = new MyThreadA();
            myThreadAs[i].setName("A" + (i + 1));
            myThreadAs[i].start();
        }
        MyThreadB myThreadB = new MyThreadB();
        myThreadB.setName("B");
        myThreadB.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main方法中的myThreadB状态" + myThreadB.getState());
    }
}
