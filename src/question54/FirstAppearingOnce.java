package question54;

/**
 * @author weimin02
 * @date 2018/6/27
 * @project sword_offer
 */
public class FirstAppearingOnce {
    int[] count = new int[256];
    StringBuffer sb = new StringBuffer();

    //Insert one char from stringstream

    public void insert(char ch) {
        sb.append(ch);
        count[ch]++;
    }

    //return the first appearence once char in current stringstream

    public char firstAppearingOnce() {
        for (char c : sb.toString().toCharArray()) {
            if (count[c] == 1) {
                return c;
            }
        }

        return '#';

    }
}
