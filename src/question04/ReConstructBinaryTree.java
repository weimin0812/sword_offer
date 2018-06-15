package question04;

import util.TreeNode;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || pre.length == 0 || in == null || in.length == 0 || pre.length != in.length) {
            return null;
        }

        int preStart = 0;
        int preEnd = pre.length - 1;
        int inStart = 0;
        int inEnd = in.length - 1;

        return reConstructBinaryTree(pre, preStart, preEnd, in, inStart, inEnd);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode ret = new TreeNode(pre[preStart]);
        int rootIndex = inStart;

        for (; rootIndex <= inEnd; rootIndex++) {
            if (in[rootIndex] == pre[preStart]) {
                break;
            }
        }

        ret.left = reConstructBinaryTree(pre, preStart + 1, preStart + rootIndex - inStart, in, inStart, rootIndex - 1);
        ret.right = reConstructBinaryTree(pre, preStart + rootIndex - inStart + 1, preEnd, in, rootIndex + 1, inEnd);
        return ret;
    }

}
