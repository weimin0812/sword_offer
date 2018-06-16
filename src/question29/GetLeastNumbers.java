package question29;

import java.util.ArrayList;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class GetLeastNumbers {
    // 解法一：bubble sort

    public ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (input == null || input.length == 0 || k <= 0 || k > input.length) {
            return ret;
        }

        for (int i = input.length - 1; i > 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (input[j] < input[j + 1]) {
                    sorted = false;
                    swap(input, j, j + 1);
                }
            }

            if (sorted) {
                break;
            }
        }

        for (int i = input.length - 1; i >= input.length - k; i--) {
            ret.add(input[i]);
        }
        return ret;
    }

    private void swap(int[] input, int i, int j) {
        int t = input[i];
        input[i] = input[j];
        input[j] = t;
    }

}
