package question25;

import util.RandomListNode;

import java.util.HashMap;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class Clone {
    public RandomListNode clone(RandomListNode pHead) {
        RandomListNode current = pHead;
        if (current == null) {
            return null;
        }

        HashMap<RandomListNode, RandomListNode> map = new HashMap<>(16);
        while (current != null) {
            map.put(current, new RandomListNode(current.label));
            current = current.next;
        }

        current = pHead;
        while (current != null) {
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }

        return map.get(pHead);
    }
}
