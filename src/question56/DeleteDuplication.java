package question56;

import util.ListNode;

/**
 * @author weimin02
 * @date 2018/6/27
 * @project sword_offer
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode current = pHead;

        if (current == null || current.next == null){
            return current;
        }

        if (current.val == current.next.val) {
            ListNode notSame = current.next;
            while (notSame != null && notSame.val != current.val) {
                notSame = notSame.next;
            }
            return deleteDuplication(notSame);
        } else {
            current.next = deleteDuplication(current.next);
            return current;
        }





    }
}
