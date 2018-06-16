package question22;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<>();
        TreeNode current = root;

        if (current == null){
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(current);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                current = queue.poll();
                ret.add(current.val);

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }

        return ret;
    }
}
