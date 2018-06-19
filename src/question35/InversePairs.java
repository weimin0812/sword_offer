package question35;

/**
 * @author weimin02
 * @date 2018/6/17
 * @project sword_offer
 */
public class InversePairs {
    public static int inversePairs(int[] array) {
        // merge sort
        if (array == null || array.length <= 1) {
            return 0;
        }
        return mergeSort(array, 0, array.length - 1);
    }

    private static int mergeSort(int[] array, int l, int h) {
        if (l >= h) {
            return 0;
        }

        int m = l + (h - l) / 2;
        int left = mergeSort(array, l, m);
        int right = mergeSort(array, m + 1, h);
        int count = merge(array, l, m, h);
        return (left + count + right) % 1000000007;
    }

    private static int merge(int[] array, int l, int m, int h) {
        int leftIndex = l;
        int rightIndex = m + 1;
        int[] t = new int[h - l + 1];
        int ret = 0;
        int index = 0;
        while (leftIndex <= m && rightIndex <= h) {
            if (array[leftIndex] <= array[rightIndex]) {
                t[index++] = array[leftIndex++];
            } else {
                ret += (m - leftIndex + 1);
                ret %= 1000000007;
                t[index++] = array[rightIndex++];
            }
        }
        while (leftIndex <= m) {
            t[index++] = array[leftIndex++];
        }

        while (rightIndex <= h) {
            t[index++] = array[rightIndex++];
        }

        for (int i = 0; i < (h - l + 1); i++) {
            array[l + i] = t[i];
        }

        return ret;

    }


    public static void main(String[] args) {
        int[] array = {364, 637, 341, 406, 747, 995, 234, 971, 571, 219, 993, 407,
                416, 366, 315, 301, 601, 650, 418, 355, 460, 505, 360, 965, 516, 648,
                727, 667, 465, 849, 455, 181, 486, 149, 588, 233, 144, 174, 557, 67,
                746, 550, 474, 162, 268, 142, 463, 221, 882, 576, 604, 739, 288, 569,
                256, 936, 275, 401, 497, 82, 935, 983, 583, 523, 697, 478, 147, 795, 380,
                973, 958, 115, 773, 870, 259, 655, 446, 863, 735, 784, 3, 671, 433, 630, 425,
                930, 64, 266, 235, 187, 284, 665, 874, 80, 45, 848, 38, 811, 267, 575};

        int count = inversePairs(array);
        System.out.println(count);

    }
}
