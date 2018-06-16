package question21;

import java.util.Stack;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class IsPopOrder {
    public boolean isPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || pushA.length == 0 || popA == null || popA.length == 0 || pushA.length != popA.length){
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int num : pushA){
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popA[index]){
                stack.pop();
                index++;
            }
        }

        return stack.isEmpty();
    }
}
