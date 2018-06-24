package question51;

/**
 * @author weimin02
 * @date 2018/6/24
 * @project sword_offer
 */
public class Multiply {
    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        }

        int[] ret = new int[A.length];
        int[] before = new int[A.length];
        int[] after = new int[A.length];

        before[0] = 1;
        for (int i = 1; i < A.length; i++) {
            before[i] = A[i - 1] * before[i - 1];
        }

        after[A.length - 1] = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            after[i] = A[i + 1] * after[i + 1];
        }

        for (int i = 0; i < A.length; i++) {
            ret[i] = after[i] * before[i];
        }

        return ret;

    }
}
