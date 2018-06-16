package question23;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class VerifyPostOrderSquence {

    public boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }

        return verifySquenceOfBST(sequence, 0, sequence.length - 1);
    }

    private boolean verifySquenceOfBST(int[] sequence, int l, int h) {
        if (l >= h) {
            return true;
        }

        int rootValue = sequence[h];
        int cutIndex = l;

        for (; cutIndex < h; cutIndex++) {
            if (sequence[cutIndex] > rootValue) {
                break;
            }
        }

        for (int i = cutIndex + 1; i < h; i++) {
            if (sequence[i] <= rootValue) {
                return false;
            }
        }

        return verifySquenceOfBST(sequence, l, cutIndex - 1) && verifySquenceOfBST(sequence, cutIndex, h - 1);
    }
}
