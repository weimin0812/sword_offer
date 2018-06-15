package question01;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class Find {
    public boolean find(int target, int[][] array) {
        if (array == null) {
            return false;
        }

        int row = array.length;
        int col = array[0].length;
        int i = 0;
        int j = col - 1;

        while (i < row && j >= 0) {
            int current = array[i][j];
            if (current == target) {
                return true;
            } else if (current > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
