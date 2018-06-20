package question40;

/**
 * @author weimin02
 * @date 2018/6/20
 * @project sword_offer
 */
public class FindNumsAppearOnce {

    public void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length <= 1 || num1 == null || num1.length != 1 || num2 == null || num2.length != 1) {
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
                num1[0] ^= num;
            } else {
                num2[0] ^= num;
            }
        }

    }
}
