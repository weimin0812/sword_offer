package question19;

import java.util.ArrayList;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class PrintMatrix {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (matrix == null){
            return ret;
        }

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom){
            // 最上面一行
            for (int i = left; i <= right; i++){
                ret.add(matrix[top][i]);
            }

            // 最右面一行
            for (int i = top + 1; i <= bottom; i++){
                ret.add(matrix[i][right]);
            }

            // 最下面一行
            if (top != bottom){
                for (int i = right - 1; i >= left; i--){
                    ret.add(matrix[bottom][i]);
                }
            }

            // 最左面一行
            if (left != right){
                for (int i = bottom - 1; i > top; i--){
                    ret.add(matrix[i][left]);
                }
            }

            top++;
            left++;
            bottom--;
            right--;
        }

        return ret;

    }
}
