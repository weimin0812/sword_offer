package question52;

/**
 * @author weimin02
 * @date 2018/6/24
 * @project sword_offer
 */
public class Match {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }

        return match(str, 0, pattern, 0);
    }

    private boolean match(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (patternIndex == pattern.length) {
            return str.length == strIndex;
        }

        // *
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if (strIndex < str.length && (pattern[patternIndex] == '.' || pattern[patternIndex] == str[strIndex])) {
                return match(str, strIndex, pattern, patternIndex + 2)
                        || match(str, strIndex + 1, pattern, patternIndex + 2)
                        || match(str, strIndex + 1, pattern, patternIndex );

            } else {
                return match(str, strIndex, pattern, patternIndex + 2);
            }
        }

        if (strIndex < str.length && (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.')){
            return match(str, strIndex + 1, pattern, patternIndex + 1);
        }

        return false;
    }

}
