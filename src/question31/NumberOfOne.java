package question31;

/**
 * @author weimin02
 * @date 2018/6/17
 * @project sword_offer
 */
public class NumberOfOne {
    public static int numberOf1Between1AndN(int n) {
        int ret = 0;
        if (n <= 0) {
            return 0;
        }

        int digit = 1;
        while (digit <= n) {
            int middle = (n / digit) % 10;
            int prefix = n / (digit * 10);
            int suffix = n % digit;

            if (middle == 0) {
                ret += prefix * digit;
            } else if (middle == 1) {
                // 后缀从0到suffix，所以总共是（suffix- 0 + 1）
                ret += prefix * digit + (suffix + 1);
            } else {
                ret += (prefix + 1) * digit;
            }

            digit *= 10;
        }
        return ret;
    }

}
