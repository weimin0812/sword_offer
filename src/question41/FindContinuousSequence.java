package question41;

import java.util.ArrayList;

/**
 * @author weimin02
 * @date 2018/6/20
 * @project sword_offer
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (sum < 3) {
            return ret;
        }

        int l = 1;
        int h = 2;

        // h <= (sum / 2) + 1 仔细体会这个终止条件   特殊值法
        while (h <= (sum / 2) + 1) {
            int t = (l + h) * (h - l + 1) / 2;
            if (t == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = l; i <= h; i++) {
                    list.add(i);
                }
                ret.add(list);
                l++;
                h++;
            } else if (t < sum) {
                h++;
            } else {
                l++;
            }
        }

        return ret;
    }
}
