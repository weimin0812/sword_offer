package question39;

import util.TreeNode;

/**
 * @author weimin02
 * @date 2018/6/20
 * @project sword_offer
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (Math.abs(getDepth(root.left) - getDepth(root.right)) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }

}
