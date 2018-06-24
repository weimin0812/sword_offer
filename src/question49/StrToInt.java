package question49;

/**
 * @author weimin02
 * @date 2018/6/24
 * @project sword_offer
 */
public class StrToInt {
    public static int strToInt(String str) {
        int ret = 0;
        if (str == null || str.length() == 0) {
            return ret;
        }

        boolean negative = false;
        int begin = 0;
        if (!Character.isDigit(str.charAt(0))) {
            if (str.charAt(0) == '-' || str.charAt(0) == '+') {
                begin = 1;
                if (str.charAt(0) == '-') {
                    negative = true;
                }
            } else {
                return ret;
            }
        }

        for (int i = begin; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return 0;
            }

            ret = ret * 10 + (str.charAt(i) - '0');
        }

        ret = negative ? -ret : ret;
        return ret;
    }

    public static void main(String[] args) {
        String s = "123";
        strToInt(s);
    }
}
