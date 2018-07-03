package chapter2.t10;

/**
 * @author spencercjh
 * 图2-71 到副线程去执行业务逻辑而用主线程来停止副线程
 * isContinuePrint在-server服务器模式中64bit的JVM上时会出现死循环
 * volatile的作用是强制从公共堆栈中取得变量的值，而不是从线程私有数据栈中取得变量的值
 */
public class Run {
    public static void main(String[] args) {
        PringString pringString = new PringString();
        new Thread(pringString).start();
        System.out.println("我要停止它！ stop thread=" + Thread.currentThread().getName());
        pringString.setContinuePrint(false);
    }
}
