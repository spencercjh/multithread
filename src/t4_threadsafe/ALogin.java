package t4_threadsafe;

/**
 * @author spencercjh
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.doPostSynchronized("a", "aa");
    }
}
