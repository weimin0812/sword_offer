package question28;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class MoreThanHalfNum {
    public int moreThanHalfNum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int ret = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == ret) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    ret = array[i];
                    count = 1;
                }
            }
        }

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (ret == array[i]) {
                count++;
            }
        }

        ret = count > array.length / 2 ? ret : 0;
        return ret;

    }
}
