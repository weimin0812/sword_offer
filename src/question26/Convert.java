package question26;

import util.TreeNode;

import java.util.Stack;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class Convert {
    public TreeNode convert(TreeNode pRootOfTree) {
        TreeNode current = pRootOfTree;
        if (current == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        TreeNode ret = null;
        boolean first = true;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            if (first) {
                first = false;
                current.left = pre;
                ret = current;
                pre = current;
            } else {
                pre.right = current;
                current.left = pre;
                pre = current;
            }
            current = current.right;
        }


        return ret;

    }
}
