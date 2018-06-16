package question14;

import util.ListNode;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        int count = 0;
        while (fast != null) {
            count++;
            fast = fast.next;

            // 边界条件细节，可以用特殊值试试，比如链表长度为1找倒数第1个节点，是不是应该count > 1 slow才可以向后走
            if (count > k) {
                slow = slow.next;
            }
        }

        // 如果连表总长度小于k, 则应该返回null. 例如长度为5的链表要找倒数第6个节点，应该是null
        ListNode ret = count < k ? null : slow;

        return ret;
    }
}
