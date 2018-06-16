package question20;

import java.util.Stack;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class MinStack {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> minValue = new Stack<>();

    public void push(int node) {
        data.push(node);
        if (minValue.isEmpty()) {
            minValue.push(node);
        } else {
            minValue.push(Math.min(node, minValue.peek()));
        }
    }

    public void pop() {
        data.pop();
        minValue.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return minValue.peek();
    }
}
