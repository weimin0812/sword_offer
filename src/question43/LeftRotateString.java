package question43;

/**
 * @author weimin02
 * @date 2018/6/22
 * @project sword_offer
 */
public class LeftRotateString {
    public String leftRotateString(String str, int n) {
        if (str == null || str.length() == 0 || n <= 0) {
            return str;
        }

        n = n % str.length();

        return str.substring(n) + str.substring(0, n);
    }
}
