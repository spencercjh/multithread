package chapter3.wait_notify_insert_test;

/**
 * @author spencercjh
 */
public class ThreadBackupB extends Thread {
    private DBTools dbTools;

    public ThreadBackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
