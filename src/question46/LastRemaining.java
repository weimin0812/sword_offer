package question46;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author weimin02
 * @date 2018/6/22
 * @project sword_offer
 */
public class LastRemaining {
    public int lastRemaining(int n, int m) {
        if (m <= 0 || n <= 0) {
            return -1;
        }
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }

        int count = 0;
        while (queue.size() > 1) {
            count++;
            if (count == m) {
                queue.poll();
                count = 0;
            } else {
                queue.offer(queue.poll());
            }
        }

        return queue.peek();
    }
}
