package question57;

import util.TreeLinkNode;
import util.TreeNode;

/**
 * @author weimin02
 * @date 2018/6/28
 * @project sword_offer
 */
public class GetNext {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode current = pNode;

        if (current == null) {
            return null;
        }

        if (current.right != null) {
            TreeLinkNode node = current.right;
            while (node.left != null) {
                node = node.left;
            }

            return node;

        } else {

            while (current.next != null && current.next.left != current) {
                current = current.next;
            }

            return current.next;

        }

    }
}
