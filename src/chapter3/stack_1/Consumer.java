package chapter3.stack_1;

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
