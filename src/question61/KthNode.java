package question61;

import util.TreeNode;

import java.util.Stack;

/**
 * @author weimin02
 * @date 2018/6/28
 * @project sword_offer
 */
public class KthNode {

    TreeNode kthNode(TreeNode pRoot, int k) {
        TreeNode current = pRoot;

        if (current == null || k <= 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            count++;

            if (count == k) {
                return current;
            }
            current = current.right;
        }

        return null;

    }
}
