package chapter3.stack_2_new_final;

/**
 * @author spencercjh
 */
public class Consumer {
    private MyStack myStack;

    public Consumer(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop=" + myStack.pop());
    }
}
