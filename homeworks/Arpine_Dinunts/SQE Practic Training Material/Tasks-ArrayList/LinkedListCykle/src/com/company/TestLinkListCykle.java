package com.company;

public class TestLinkListCykle {
    boolean hasLoop(ListNode first) {

        if (first == null)
            return false;

        ListNode slow, fast;

        slow = fast = first;

        while (true) {

            slow = slow.next;

            if (fast.next != null)
                fast = fast.next.next;
            else
                return false;

            if (slow == null || fast == null)
                return false;

            if (slow == fast)
                return true;
        }
    }
}
class ListNode {
    private int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
