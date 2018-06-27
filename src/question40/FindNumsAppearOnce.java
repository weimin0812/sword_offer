package question40;

/**
 * @author weimin02
 * @date 2018/6/20
 * @project sword_offer
 */
public class FindNumsAppearOnce {

    public void findNumsAppearOnce(int[] array, int[] firstResult, int[] secondResult) {
        if (array == null || array.length <= 1 || firstResult == null || firstResult.length != 1 || secondResult == null || secondResult.length != 1) {
            return;
        }

        int xorRet = 0;
        for (int num : array) {
            xorRet ^= num;
        }
        int count = 0;

        while ((xorRet & (1 << count)) == 0) {
            count++;
        }

        for (int num : array) {
            if ((num & (1 << count)) == 0) {
                firstResult[0] ^= num;
            } else {
                secondResult[0] ^= num;
            }
        }

    }
}
