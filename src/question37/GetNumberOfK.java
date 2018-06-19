package question37;

/**
 * @author weimin02
 * @date 2018/6/19
 * @project sword_offer
 */
public class GetNumberOfK {

    public int getNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }

        return getLastIndex(array, k) - getFirstIndex(array, k) + 1;
    }

    private int getFirstIndex(int[] array, int k) {
        int l = 0;
        int h = array.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (array[m] == k) {
                if (m == 0 || array[m - 1] != k) {
                    return m;
                }
                h--;
            } else if (array[m] < k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return -1;
    }

    private int getLastIndex(int[] array, int k) {
        int l = 0;
        int h = array.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (array[m] == k) {
                if (m == array.length - 1 || array[m + 1] != k) {
                    return m;
                }
                l++;
            } else if (array[m] < k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return -2;
    }

    private int getInsertIndex(int[] array, double k) {
        int l = 0;
        int h = array.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (array[m] == k) {
                return m;
            } else if (array[m] < k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return l;
    }


    public int getNumberOfK1(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }

        return getInsertIndex(array, k + 0.5) - getInsertIndex(array, k - 0.5);
    }


}
