package question02;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        StringBuffer ret = new StringBuffer();
        if (str == null) {
            return null;
        }

        for (char c : str.toString().toCharArray()) {
            if (c == ' ') {
                ret.append("%20");
            } else {
                ret.append(c);
            }
        }

        return ret.toString();
    }
}
