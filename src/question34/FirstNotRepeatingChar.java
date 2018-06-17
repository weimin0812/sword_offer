package question34;

/**
 * @author weimin02
 * @date 2018/6/17
 * @project sword_offer
 */
public class FirstNotRepeatingChar {
    public static int firstNotRepeatingChar(String str) {
        int ret = -1;
        if (str == null || str.length() == 0) {
            return ret;
        }

        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return i;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        String str = "google";
        int index = firstNotRepeatingChar(str);
        System.out.println(index);
    }
}
