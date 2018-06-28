package question58;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author weimin02
 * @date 2018/6/28
 * @project sword_offer
 */
public class Print {
    public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        TreeNode current = pRoot;
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

        if (current == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(current);
        int count = 0;

        while (!queue.isEmpty()) {
            count++;

            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                current = queue.poll();
                if (count % 2 == 1) {
                    list.add(current.val);
                } else {
                    list.add(0, current.val);
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            ret.add(list);
        }

        return ret;

    }
}
