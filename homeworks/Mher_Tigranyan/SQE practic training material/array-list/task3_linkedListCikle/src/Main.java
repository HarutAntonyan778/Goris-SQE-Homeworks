public class Main {

    public static void main(String[] args) {
        HasLoop hl = new HasLoop();

        ListNode ln = new ListNode(9);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(6);
        ln.next.next.next = new ListNode(4);
        ln.next.next.next.next = new ListNode(2);
        ln.next.next.next.next.next = new ListNode(1);
        ln.next.next.next.next.next.next = ln.next.next.next;

        System.out.println(hl.hasLoop(ln));
    }
}
