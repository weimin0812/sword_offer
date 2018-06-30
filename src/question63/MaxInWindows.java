package question63;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author weimin02
 * @date 2018/6/29
 * @project sword_offer
 */
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (num == null || num.length == 0 || size <= 0 || num.length < size){
            return ret;
        }

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < num.length; i++) {
            int begin = i - size + 1;
            if (!queue.isEmpty() && queue.peekFirst() < begin){
                queue.pollFirst();
            }

            while(!queue.isEmpty() && num[queue.peekLast()] <= num[i]){
                queue.pollLast();
            }

            queue.offerLast(i);

            if (begin >= 0){
                ret.add(num[queue.peekFirst()]);
            }
        }

        return ret;
    }
}
