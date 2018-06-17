package question32;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author weimin02
 * @date 2018/6/17
 * @project sword_offer
 */
public class PrintMinNumber {
    public String printMinNumber(int[] numbers) {
        StringBuffer ret = new StringBuffer();
        if (numbers == null || numbers.length == 0){
            return ret.toString();
        }

        Integer[] num = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            num[i] = numbers[i];
        }

        Arrays.sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });

        for (int i = 0; i < num.length; i++) {
            ret.append(num[i]);
        }

        return ret.toString();
    }
}
