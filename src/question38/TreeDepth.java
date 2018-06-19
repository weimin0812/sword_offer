package question38;

import util.TreeNode;

/**
 * @author weimin02
 * @date 2018/6/19
 * @project sword_offer
 */
public class TreeDepth {
    public int treeDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        return Math.max(treeDepth(root.left), treeDepth(root.right)) + 1;
    }


}
