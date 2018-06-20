package question42;

import java.util.ArrayList;

/**
 * @author weimin02
 * @date 2018/6/20
 * @project sword_offer
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (array == null || array.length <= 1) {
            return ret;
        }

        int l = 0;
        int h = array.length - 1;
        while (l < h) {
            if (array[l] + array[h] == sum) {
                ret.add(array[l]);
                ret.add(array[h]);
                return ret;
            } else if (array[l] + array[h] < sum) {
                l++;
            } else {
                h--;
            }
        }

        return ret;
    }
}
