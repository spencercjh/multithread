package t4_threadsafe;

/**
 * @author spencercjh
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPostSynchronized("b", "bb");
    }
}
