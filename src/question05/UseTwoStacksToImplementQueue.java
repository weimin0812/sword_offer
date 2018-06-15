package question05;

import java.util.Stack;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class UseTwoStacksToImplementQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

}
