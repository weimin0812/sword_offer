package question16;

import util.ListNode;

/**
 * @author weimin02
 * @date 2018/6/16
 * @project sword_offer
 */
public class Merge {
    // 非递归版本

    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode ret = new ListNode(-1);
        ListNode current = ret;
        ListNode current1 = list1;
        ListNode current2 = list2;

        while (current1 != null && current2 != null) {
            if (current1.val <= current2.val) {
                current.next = current1;
                current = current.next;
                current1 = current1.next;
            } else {
                current.next = current2;
                current = current.next;
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            current.next = current1;
            current = current.next;
            current1 = current1.next;
        }

        while (current2 != null) {
            current.next = current2;
            current = current.next;
            current2 = current2.next;
        }

        return ret.next;
    }

    // 递归版本

    public ListNode merge1(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }

        if (list2 == null){
            return list1;
        }

        if (list1.val <= list2.val){
            list1.next = merge1(list1.next, list2);
            return list1;
        }else{
            list2.next = merge1(list1, list2.next);
            return list2;
        }

    }
}
