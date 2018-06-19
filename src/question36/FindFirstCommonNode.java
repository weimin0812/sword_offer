package question36;

import util.ListNode;

/**
 * @author weimin02
 * @date 2018/6/19
 * @project sword_offer
 */
public class FindFirstCommonNode {
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        while (current1 != current2) {
            current1 = current1 == null ? pHead2 : current1.next;
            current2 = current2 == null ? pHead1 : current2.next;
        }

        return current1;
    }
}
