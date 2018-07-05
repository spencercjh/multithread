package chapter3.wait_notify_insert_test;

/**
 * @author spencercjh
 * Page179 利用volatile关键字实现AB线程交替执行
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            ThreadBackupB threadBackupB = new ThreadBackupB(dbTools);
            threadBackupB.start();
            ThreadBackupA threadBackupA = new ThreadBackupA(dbTools);
            threadBackupA.start();
        }
    }
}
