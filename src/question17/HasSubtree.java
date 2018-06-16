package question17;

import util.TreeNode;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class HasSubtree {
    public boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        if (isSubtree(root1, root2)) {
            return true;
        }

        return hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
    }

    private boolean isSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }

        if (root1 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
    }

}
