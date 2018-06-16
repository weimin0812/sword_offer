package question13;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class ReOrderArray {
    public void reOrderArray(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        for (int i = array.length - 1; i > 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (isEven(array[j]) && isOdd(array[j + 1])) {
                    sorted = false;
                    swap(array, j, j + 1);
                }
            }

            if (sorted) {
                break;
            }
        }

    }

    private boolean isOdd(int i) {
        return i % 2 == 1;
    }

    private boolean isEven(int i) {
        return i % 2 == 0;
    }

    private void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
