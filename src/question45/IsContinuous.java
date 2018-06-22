package question45;

/**
 * @author weimin02
 * @date 2018/6/22
 * @project sword_offer
 */
public class IsContinuous {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length != 5) {
            return false;
        }

        int[] count = new int[14];
        int max = -1;
        int min = 14;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 || numbers[i] > 13) {
                return false;
            }

            count[numbers[i]]++;
            if (numbers[i] == 0) {
                if (count[numbers[i]] > 4) {
                    return false;
                }
            } else {
                if (count[numbers[i]] > 1) {
                    return false;
                }

                max = Math.max(max, numbers[i]);
                min = Math.min(min, numbers[i]);
                if (max - min > 4) {
                    return false;
                }
            }
        }

        return true;
    }
}
