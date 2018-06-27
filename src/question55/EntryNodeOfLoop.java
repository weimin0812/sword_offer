package question55;

import util.ListNode;

/**
 * @author weimin02
 * @date 2018/6/27
 * @project sword_offer
 */
public class EntryNodeOfLoop {
    public ListNode entryNodeOfLoop(ListNode pHead) {
        ListNode current = pHead;

        if (current == null || current.next == null) {
            return null;
        }

        ListNode fast = current;
        ListNode slow = current;

        while (fast != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = pHead;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
