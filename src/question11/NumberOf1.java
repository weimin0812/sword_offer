package question11;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class NumberOf1 {
    public int numberOf1(int n) {
        int ret = 0;
        int num = n;
        while (num != 0) {
            ret++;
            num = num & (num - 1);
        }

        return ret;
    }
}
