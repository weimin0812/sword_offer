package question47;

/**
 * @author weimin02
 * @date 2018/6/22
 * @project sword_offer
 */
public class Sum {
    public static int sum(int n) {
        int ret = n;
        boolean t = n > 0 && (ret += sum(n - 1)) > 0;
        return ret;
    }

}
