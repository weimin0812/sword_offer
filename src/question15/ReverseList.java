package question15;

import util.ListNode;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;

        if (current == null){
            return null;
        }

        ListNode pre = null;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }
}
