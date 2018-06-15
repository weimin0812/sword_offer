package question03;

import util.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author weimin02
 * @date 2018/6/15
 * @project sword_offer
 */
public class PrintListFromTailToHead {

    // 第一种解法：使用ArrayList的add(0, val)方法

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        ListNode current = listNode;
        if (current == null) {
            return ret;
        }

        while (current != null) {
            ret.add(0, current.val);
            current = current.next;
        }

        return ret;
    }

    // 第二种解法：使用Stack

    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ListNode current = listNode;
        ArrayList<Integer> ret = new ArrayList<>();
        if (current == null) {
            return ret;
        }

        Stack<Integer> stack = new Stack<>();
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        while (!stack.isEmpty()) {
            ret.add(stack.pop());
        }

        return ret;
    }

    // 第三种解法：反转链表

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ListNode current = listNode;
        ArrayList<Integer> ret = new ArrayList<>();
        if (current == null) {
            return ret;
        }

        current = reverse(current);
        while (current != null) {
            ret.add(current.val);
            current = current.next;
        }

        reverse(current);
        return ret;
    }

    private ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode pre = null;
        ListNode next = null;
        ListNode current = head;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }


}
