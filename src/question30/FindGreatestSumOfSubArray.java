package question30;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class FindGreatestSumOfSubArray {
    public int findGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int ret = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            ret = Math.max(ret, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return ret;

    }
}
