package chapter3.wait_notify_insert_test;

/**
 * @author spencercjh
 */
public class ThreadBackupA extends Thread {
    private DBTools dbTools;

    public ThreadBackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
