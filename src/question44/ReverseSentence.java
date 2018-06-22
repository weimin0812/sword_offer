package question44;

/**
 * @author weimin02
 * @date 2018/6/22
 * @project sword_offer
 */
public class ReverseSentence {
    public String reverseSentence(String str) {
        if (str == null || "".equals(str.trim())) {
            return str;
        }

        String[] words = str.trim().split(" ");
        StringBuffer sb = new StringBuffer();
        boolean first = true;

        for (int i = words.length - 1; i >= 0; i--) {
            if (!"".equals(words[i])) {
                if (first) {
                    first = false;
                } else {
                    sb.append(" ");
                }
                sb.append(words[i]);
            }
        }

        return sb.toString();
    }
}
