package chapter1.suspend_resume_nosameValue;

/**
 * @author spencercjh
 */
public class MyObject {
    private String username = "ConditionTestMoreMethod";
    private String password = "11";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printUserNamePassword() {
        System.out.println(username + " " + password);
    }
}
