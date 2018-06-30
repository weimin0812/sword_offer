package question62;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author weimin02
 * @date 2018/6/29
 * @project sword_offer
 */
public class GetMedian {

    private Queue<Integer> minHeap = new PriorityQueue<>();
    private Queue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    int count = 0;

    public void insert(Integer num) {
        count++;
        if (count % 2 == 1) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
    }

    public Double getMedian() {
        if (count % 2 == 1) {
            return maxHeap.peek() * 1.0;
        } else {
            return (maxHeap.peek() + minHeap.peek()) * 0.5;
        }

    }
}
