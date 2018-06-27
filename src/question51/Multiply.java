package question51;

/**
 * @author weimin02
 * @date 2018/6/24
 * @project sword_offer
 */
public class Multiply {
    public int[] multiply(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int[] ret = new int[array.length];
        int[] before = new int[array.length];
        int[] after = new int[array.length];

        before[0] = 1;
        for (int i = 1; i < array.length; i++) {
            before[i] = array[i - 1] * before[i - 1];
        }

        after[array.length - 1] = 1;
        for (int i = array.length - 2; i >= 0; i--) {
            after[i] = array[i + 1] * after[i + 1];
        }

        for (int i = 0; i < array.length; i++) {
            ret[i] = after[i] * before[i];
        }

        return ret;

    }
}
