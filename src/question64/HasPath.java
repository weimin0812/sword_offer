package question64;

/**
 * @author weimin02
 * @date 2018/6/29
 * @project sword_offer
 */
public class HasPath {

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0 || rows <= 0 || cols <= 0 ||
                matrix.length != rows * cols || str == null || str.length == 0 || str.length > matrix.length) {

            return false;
        }

        int strIndex = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                boolean[][] visited = new boolean[rows][cols];
                if (hasPath(matrix, rows, cols, str, row, col, strIndex, visited)) {
                    return true;
                }
            }

        }

        return false;
    }


    private static boolean hasPath(char[] matrix, int rows, int cols, char[] str, int row, int col, int strIndex, boolean[][] visited) {
        int index = row * cols + col;
        if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[index] != str[strIndex] || visited[row][col]) {
            return false;
        }

        if (strIndex == str.length - 1) {
            return true;
        }

        visited[row][col] = true;

        return hasPath(matrix, rows, cols, str, row + 1, col, strIndex + 1, visited) ||
                hasPath(matrix, rows, cols, str, row - 1, col, strIndex + 1, visited) ||
                hasPath(matrix, rows, cols, str, row, col + 1, strIndex + 1, visited) ||
                hasPath(matrix, rows, cols, str, row, col - 1, strIndex + 1, visited);


    }


    public static void main(String[] args) {
        char[] matrix = "ABCESFCSADEE".toCharArray();
        char[] str = "ABCCED".toCharArray();
        int rows = 3;
        int cols = 4;
        boolean hasPath = hasPath(matrix, rows, cols, str);
        System.out.println(hasPath);
    }
}
