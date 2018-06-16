package question24;

import util.TreeNode;

import java.util.ArrayList;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (root == null){
            return ret;
        }
        ArrayList<Integer> list = new ArrayList<>();
        findPath(root, target, ret, list);
        return ret;
    }

    private void findPath(TreeNode root, int target, ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> list){
        if (root == null){
            return;
        }

        target -= root.val;
        list.add(root.val);

        if (root.left == null && root.right == null && target == 0){
            ret.add(new ArrayList<>(list));
        }

        findPath(root.left, target, ret, list);
        findPath(root.right, target, ret, list);

        // 回退
        list.remove(list.size()-1);
    }

}
