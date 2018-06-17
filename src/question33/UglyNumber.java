package question33;

/**
 * @author weimin02
 * @date 2018/6/17
 * @project sword_offer
 */
public class UglyNumber {
    public int getUglyNumber(int index) {
        if (index <= 0) {
            return 0;
        }
        int[] ugly = new int[index];
        ugly[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;

        for (int i = 1; i < index; i++) {
            ugly[i] = Math.min(ugly[index2] * 2, Math.min(ugly[index3] * 3, ugly[index5] * 5));
            if (ugly[i] == ugly[index2] * 2) {
                index2++;
            }
            if (ugly[i] == ugly[index3] * 3) {
                index3++;
            }
            if (ugly[i] == ugly[index5] * 5) {
                index5++;
            }
        }

        return ugly[index - 1];
    }
}
