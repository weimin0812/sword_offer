package question65;

/**
 * @author weimin02
 * @date 2018/6/30
 * @project sword_offer
 */
public class MovingCount {

    public int movingCount(int threshold, int rows, int cols) {
        if (rows < 0 || cols < 0 || threshold < 0) {
            return 0;
        }

        boolean[][] visited = new boolean[rows][cols];

        int row = 0;
        int col = 0;

        return movingCount(threshold, rows, cols, row, col, visited);

    }


    private int movingCount(int threshold, int rows, int cols, int row, int col, boolean[][] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || !legal(threshold, row, col)) {
            return 0;
        }

        visited[row][col] = true;

        return 1 + movingCount(threshold, rows, cols, row + 1, col, visited)
                + movingCount(threshold, rows, cols, row - 1, col, visited)
                + movingCount(threshold, rows, cols, row, col + 1, visited)
                + movingCount(threshold, rows, cols, row, col - 1, visited);

    }

    private boolean legal(int threshold, int row, int col) {
        return digitSum(row) + digitSum(col) <= threshold;
    }

    private int digitSum(int i) {
        int sum = 0;
        while (i != 0) {
            sum += (i % 10);
            i /= 10;
        }

        return sum;
    }


}

