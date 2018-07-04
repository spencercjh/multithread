package chapter3.stack_2_old;

/**
 * @author spencercjh
 */
public class Producer {
    private MyStack myStack;

    public Producer(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
