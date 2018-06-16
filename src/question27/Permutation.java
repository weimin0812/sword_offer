package question27;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class Permutation {

    public ArrayList<String> permutation(String str) {
        ArrayList<String> ret = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return ret;
        }

        permutation(str.toCharArray(), 0, ret);
        Collections.sort(ret);
        return ret;
    }

    private void permutation(char[] c, int begin, ArrayList<String> ret) {
        if (begin == c.length - 1) {
            if (!ret.contains(new String(c))) {
                ret.add(new String(c));
            }
        } else {
            for (int i = begin; i < c.length; i++) {
                swap(c, begin, i);
                permutation(c, begin + 1, ret);
                swap(c, begin, i);
            }
        }
    }

    private void swap(char[] c, int i, int j) {
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }

    public static void main(String[] args) {
        String str = "aa";
        Permutation t = new Permutation();
        ArrayList<String> ret = t.permutation(str);
        System.out.println(ret);
    }

}
