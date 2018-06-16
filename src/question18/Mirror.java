package question18;

import util.TreeNode;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class Mirror {
    public void mirror(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        mirror(root.left);
        mirror(root.right);
    }
}
