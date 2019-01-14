package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestLinkListCykle hl = new TestLinkListCykle();

        ListNode ln = new ListNode(4);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(5);
        ln.next.next.next = new ListNode(3);
        ln.next.next.next.next = new ListNode(6);
        ln.next.next.next.next.next = new ListNode(2);
        ln.next.next.next.next.next.next = ln.next.next.next;

        System.out.println(hl.hasLoop(ln));
    }
}
